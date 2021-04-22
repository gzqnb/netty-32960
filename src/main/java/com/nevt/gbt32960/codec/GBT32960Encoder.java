package com.nevt.gbt32960.codec;

import com.alibaba.fastjson.JSON;
import com.google.common.base.Preconditions;
import com.nevt.gbt32960.paltform.LoginPlatform;
import com.nevt.gbt32960.paltform.PlatformMessage;
import com.nevt.gbt32960.type.EncryptionType;
import com.nevt.gbt32960.type.FrameHeader;
import com.nevt.gbt32960.type.RequestType;
import com.nevt.gbt32960.type.ResponseTag;
import com.nevt.gbt32960.util.GBT32960Message;
import com.nevt.gbt32960.util.ResponseMessage;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import lombok.extern.slf4j.Slf4j;

import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.Arrays;
import java.util.Date;
import java.util.function.Consumer;

import static com.nevt.gbt32960.util.GBT32960Message.*;


@Slf4j
public class GBT32960Encoder extends MessageToByteEncoder<ResponseMessage> {

    // 从protocalhandler过来的数据为responseMessage，会被此encoder读取
    @Override
    protected void encode(ChannelHandlerContext ctx, ResponseMessage response, ByteBuf out) {
//
//         String test = "232301fe4c564256334a3042364a4539303032353201001e150410071d1b000138393836303331383334323030343237383037370100d9";
//        StringBuilder target = new StringBuilder();
//        for (int i = 0; i <= test.length(); i++) {
//            if (i % 2 != 0) {
//                target.append(test.substring(i - 1, i + 1)).append(" ");
//            }
//        }
//        String[] s = target.toString().split(" ");
//        Byte[] bytess = Arrays.stream(s).map(n -> (byte) Integer.parseInt(n, 16)).toArray(Byte[]::new);
//
//        byte[] bytes = new byte[bytess.length];
//
//        for (int i = 0; i < bytess.length; i++) {
//            bytes[i] = bytess[i];
//        }
//        out.writeBytes(bytes);
//        log.info("应答帧: {}", ByteBufUtil.hexDump(out));
        RequestType requestType = response.getMessage().getRequestType();

        switch (requestType) {
            case LOGIN:
                encodeLoginMessage(out, response.getVin(), requestType, response.getMessage().getResponseTag());
            case LOGOUT:
                encodeLogoutMessage(out, response.getVin(), requestType, response.getMessage().getResponseTag());
                //平台登入
            case PLATFORM_LOGIN:
                encodeMessage(out, response.getVin(), requestType, response.getMessage().getResponseTag(), buf -> encodePlatformLogin(response.getMessage(), buf));
                break;
            //平台登出
            case PLATFORM_LOGOUT:
                encodeMessage(out, response.getVin(), requestType, response.getMessage().getResponseTag(), buf -> encodePlatformLogout(response.getMessage(), buf));
                break;
//            case PLATFORM_LOGIN_RESPONSE:
//                encodeLoginMessage(ctx, out, response.getVin(), response.getMessage().getResponseTag());
//                break;
//            case PLATFORM_LOGOUT_RESPONSE:
//                encodeLogoutMessage(ctx, out, response.getVin(), response.getMessage().getResponseTag());
//                break;
            case REALTIME_RESPONSE:
                realTimeResponse(ctx, out, response.getVin(), response.getMessage().getResponseTag());
            default:
                log.info("no encode type");
                break;
        }

    }


    private void encodePlatformLogin(PlatformMessage platformMessage, ByteBuf out) {
        //登入信息的真正数据
        LoginPlatform data = platformMessage.getData();
        //平台登入的数据采集时间需要满足国标要求,writeTime方法已经进行实现
        writeTime(out, new Date().getTime() / 1000);
        //登入流水号占两个字节
//        下级平台每登入一次,登入流水号自动加1,从1开始循环累加,最大值为65531,循环周期为天
        out.writeShort(data.getLoginDaySeq());
        //平台用户名
        out.writeCharSequence(data.getUsername(), ASCII_CHARSET);
        //平台密码
        out.writeCharSequence(data.getPassword(), ASCII_CHARSET);
        //平台加密规则
        /*0x01:数据不加密;0x02:数据经过RSA算法加密;0x03:数据经过AES128位算法加密;
        “0xFE”表示异常,“0xFF”表示无效,其他预留*/
        out.writeByte(data.getEncryption());
    }

    private void encodePlatformLogout(PlatformMessage platformMessage, ByteBuf out) {
        //平台登出的数据
        LoginPlatform data = platformMessage.getData();
        //平台登出的数据采集时间需要满足国标要求,writeTime方法已经进行实现
        writeTime(out, new Date().getTime() / 1000);
        //登入流水号占两个字节
//        下级平台每登入一次,登入流水号自动加1,从1开始循环累加,最大值为65531,循环周期为天
        out.writeShort(data.getLoginDaySeq());
    }


       /* String test = "232302fe4c564256334a3042584c573031303338320101d115030f0d140d010201010000000070c4155f26a257010019700000020101043e4e204e203a157c2710080101155f26a200a20001a20d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d340d2a0d340d2a0d340d2a0d340d2a0d2a0d2a0d2a0d2a0d340d340d340d340d340d340d2a0d2a0d2a0d2a0d2a0d200d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d340d340d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d340d340d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d340d340d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d340d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d2a0d340d340d340d340d340d2a0d2a0d2a0d2a0d2a0d340d340d2a0d2a0d2a0d340d340d2a0d2a0d340d340d340d340d340d340d340d340d340d2a0d2a0d2a0d340d340d2a0d2a0d2a0d340d340d2a0d340d2a0d340d340d2a0d340d340d2a0d340d340d340d2a0d2a0d2a0d340d2a0d2a0d2a0d2a0d2a0d340d2a0d340d340d340d2a0d2a0d340d340d2a0d2a09010100303a3a3a3a39393939383838383a3939383a3b3a393a3a3a3939393938393939383838383738383837393838383838383906010e0d3401250d2001123b012437050006ec35c9025dd1330700000000000000000029";
        StringBuilder target = new StringBuilder();
        for (int i = 0; i <= test.length(); i++) {
            if (i % 2 != 0) {
                target.append(test.substring(i - 1, i + 1)).append(" ");
            }
        }
        String[] s = target.toString().split(" ");
        Byte[] bytess = Arrays.stream(s).map(n -> (byte) Integer.parseInt(n, 16)).toArray(Byte[]::new);

        byte[] bytes = new byte[bytess.length];

        for (int i = 0; i < bytess.length; i++) {
            bytes[i] = bytess[i];
        }
        out.writeBytes(bytes);
        log.info("应答帧: {}", ByteBufUtil.hexDump(out));*/


}
