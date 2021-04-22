package com.nevt.gbt32960.codec;

import com.nevt.gbt32960.message.*;
import com.nevt.gbt32960.paltform.LoginPlatform;
import com.nevt.gbt32960.paltform.PlatformMessage;
import com.nevt.gbt32960.type.EncryptionType;
import com.nevt.gbt32960.type.FrameHeader;
import com.nevt.gbt32960.type.RequestType;
import com.nevt.gbt32960.type.ResponseTag;
import com.nevt.gbt32960.util.GBT32960Message;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ReplayingDecoder;
import lombok.extern.slf4j.Slf4j;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.List;

import static com.nevt.gbt32960.type.FrameHeader.HEADER_LENGTH;
import static com.nevt.gbt32960.util.GBT32960Message.*;

@Slf4j
//ReplayingDecoder解决粘包拆包问题
public class GBT32960Decoder extends ReplayingDecoder<Void> {

    private FrameHeader frameHeader;

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) throws Exception {
        //记录此时进来的包的指针偏移量 后面会用做算数据单元的长度的
        int startIndex = in.readerIndex();
        checkpoint();
//        log.info("帧消息: {}", ByteBufUtil.hexDump(internalBuffer()));
        // 读取数据包的启始符（两个##）,in的readerindex前移两个字节
        if (in.readShort() != START_SYMBOL) {
            System.out.println("NO START_SYMBOL");
            in.skipBytes(actualReadableBytes());
            ctx.close();
            return;
        }
        // 将头部信息（除启始符##）转化为FrameHeader对象,此时in指针继续前移
        frameHeader = decodeFrameHeader(in);
        //获取数据单元长度
        int payloadLength = frameHeader.getPayloadLength();
/*        计算收到的数据的校验码 现在的in里虽然头部已经消费掉了##和header但是记录了原始的进来的in的索引位置，所以可以进行
         异或校验（因为前两位##一样，异或校验完后为0，所以可以从startindex开始）
         异或运算法则 a^0 = a, a^a=0头部的两个0x23 ^ 0x23异或结果为0是无意义的，不会对结果产生影响*/
        byte nowCheckCode = checkCode(in, startIndex, HEADER_LENGTH + 2 + payloadLength);
        //得到传递来的数据的原始校验码（也就是数据报文的最后一位）
        byte sourceCheckCode = in.getByte(HEADER_LENGTH + 2 + payloadLength + startIndex);
        //对比两个校验码
        if (nowCheckCode != sourceCheckCode) {
            log.info("消息校验位验证失败: {} vs {}", String.format("%02X", nowCheckCode),
                   /* x 表示以十六进制形式输出
                    02 表示不足两位,，前面补0输出，如果超过两位，则以实际输出*/
                    String.format("%02X", sourceCheckCode));
            return;
        }
        // 进行信息解码，此命令结束in继续前移到倒数第一位
        Object dataUnit = decodeDataUnit(in, frameHeader);
        // 把得到的dataUnit（数据单元）封装到message里（此时封装成标准32960数据包）
        GBT32960Message message = GBT32960Message.builder()
                .header(frameHeader)
                .dataUnit(dataUnit)
                .build();
        // 解析完成
        log.info("Analysis complete And Release");
        // 将message写出到下一个handler（protocolhandler）
        out.add(message);
        // 将in指针继续前移（把最后一位校验码跳过，让下一个数据包进入到decode方法）
        in.skipBytes(1);

    }

    private Object decodeDataUnit(ByteBuf in, FrameHeader header) {
        switch (header.getRequestType()) {
            // 获取请求方式有如下几种
            case REAL_TIME:
                log.info("实时信息上报消息");
                return realTime(in, header);
            case REISSUE:
                log.info("补发信息上报");
                return reIssueTime(in, header);
            case PLATFORM_LOGIN:
                log.info("平台登入消息");
                return decodeLoginPlatform(in);
            case PLATFORM_LOGOUT:
                return decodeLogoutPlatform(in);
            case PLATFORM_LOGOUT_RESPONSE:
            case PLATFORM_LOGIN_RESPONSE:
                return header.getResponseTag();
            case LOGIN:
                log.info("车辆登入消息");
                LoginRequest loginRequest = decodeLogin(in);
                log.info("登入信息: \n数据采集时间:{}\n{}", ZonedDateTime.ofInstant(Instant.ofEpochSecond(loginRequest.getRecordTime()), ZONE_UTC8), loginRequest);
                return loginRequest;
            case LOGOUT:
                log.info("车辆登出消息");
                LogoutRequest logout = LogoutRequest.newBuilder()
                        .setRecordTime(readTime(in))
                        .setLogoutDaySeq(in.readUnsignedShort()).build();
                log.info("登出消息: \n数据采集时间:{}\n{}", ZonedDateTime.ofInstant(Instant.ofEpochSecond(logout.getRecordTime()), ZONE_UTC8), logout);
                return logout;
            default:
                throw new Error();
        }
    }

    /**
     * 解析 登入数据
     *
     * @param in ByteBuf
     * @return 登入数据
     */
    private LoginRequest decodeLogin(ByteBuf in) {
        LoginRequest.Builder builder = LoginRequest.newBuilder()
                .setRecordTime(readTime(in))
                .setLoginDaySeq(in.readUnsignedShort())
                .setIccid(in.readCharSequence(20, ASCII_CHARSET).toString());
        int count = in.readByte();
        int length = in.readByte();
        builder.setSystemCodeLength(length);
        for (int i = 0; i < count; i++) {
            builder.addChargeableSubsystemCode(
                    in.readCharSequence(length, ASCII_CHARSET).toString());
        }
        return builder.build();
    }


    /**
     * @param in ByteBuf
     * @return LoginPlatform
     * @author lihuang
     */
    private LoginPlatform decodeLoginPlatform(ByteBuf in) {
        return LoginPlatform.decoderFul(in);
    }

    private LoginPlatform decodeLogoutPlatform(ByteBuf in) {
        return LoginPlatform.decoderLogout(in);
    }

    /**
     * 解析头部数据
     *
     * @param in ByteBuf
     * @return 头部数据
     */
    private FrameHeader decodeFrameHeader(ByteBuf in) {
        frameHeader = FrameHeader.builder()
                .requestType(RequestType.valueOf(in.readByte()))
                .responseTag(ResponseTag.valueOf(in.readByte()))
                // 读取vin唯一标志码
                .vin(in.readCharSequence(17, GBT32960Message.ASCII_CHARSET).toString())
                .encryptionType(EncryptionType.valueOf(in.readByte()))
                .payloadLength(in.readUnsignedShort())
                .build();
        return frameHeader;
    }

    /**
     * 计算校验码
     *
     * @param in     ByteBuf
     * @param start  开始位置
     * @param length 长度
     * @return 校验码
     */
    private byte checkCode(ByteBuf in, int start, int length) {
        if (length == 0) {
            return 0;
        }
        FrameHeader.CheckCodeProcessor processor = new FrameHeader.CheckCodeProcessor();
        in.forEachByte(start, length, processor);
        System.out.println(processor.getCheckCode());
        return processor.getCheckCode();
    }

    private RealTimeReport realTime(ByteBuf in, FrameHeader header) {
        // 制作出一个fullbody的切片，长度为数据单元的长度，长度从头部信息获取，指针前移
        ByteBuf fullBody = in.readRetainedSlice(header.getPayloadLength());
        // 进行解析
        RealTimeReport.Builder report = ReportDecoder.decodeFully(fullBody);
        // 释放掉
        fullBody.release();
        //  设置是否为补交上报信息
        report.setReissue(header.getRequestType() == RequestType.REISSUE);
        return report.build();
    }

    private RealTimeReport reIssueTime(ByteBuf in, FrameHeader header) {
        ByteBuf fullBody = in.readRetainedSlice(header.getPayloadLength());
        RealTimeReport.Builder report = ReportDecoder.decodeFully(fullBody);
        fullBody.release();
        report.setReissue(header.getRequestType() == RequestType.REISSUE);
        return report.build();
    }

}
