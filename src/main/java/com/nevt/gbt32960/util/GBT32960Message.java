package com.nevt.gbt32960.util;

import com.nevt.gbt32960.message.EmptyResponse;
import com.nevt.gbt32960.paltform.PlatformMessage;
import com.nevt.gbt32960.type.EncryptionType;
import com.nevt.gbt32960.type.FrameHeader;
import com.nevt.gbt32960.type.RequestType;
import com.nevt.gbt32960.type.ResponseTag;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import lombok.Builder;
import lombok.Getter;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Consumer;

@Builder
@Getter
public class GBT32960Message {

    private final FrameHeader header;
    private final Object dataUnit;
    private final boolean valid;

    public static final int MAX_LENGTH = Short.MAX_VALUE * 2 + 25;

    public static final byte EXCEPTION_MARK = (byte) 0xFE;
    public static final byte INVALID_MARK = (byte) 0xFF;

    public static final short START_SYMBOL = 0x2323;
    public static final int START_SYMBOL_LENGTH = 2;

    public static final ZoneId ZONE_UTC8 = ZoneId.of("UTC+8");
    public static final Charset ASCII_CHARSET = StandardCharsets.US_ASCII;
    public static final Charset CHINESE_CHARSET = StandardCharsets.UTF_8;

    public static long readTime(ByteBuf in) {
        // 年份按国标要求过来为两位数，加上2000的年份
        return ZonedDateTime.of(
                // year
                in.readByte() + 2000,
                // month
                in.readByte(),
                // day
                in.readByte(),
                // hour
                in.readByte(),
                // min
                in.readByte(),
                // second
                in.readByte(),
                0, ZONE_UTC8).toEpochSecond();
    }

    public static void writeTime(ByteBuf out, Long epochSecond) {
        writeTime(out, Instant.ofEpochSecond(epochSecond));
    }

    public static void writeTime(ByteBuf out, Instant instant) {
        ZonedDateTime time = instant.atZone(ZONE_UTC8);
        writeTime(out, time);
    }

    private static void writeTime(ByteBuf out, ZonedDateTime time) {
        out.writeByte(time.getYear() - 2000);
        out.writeByte(time.getMonthValue());
        out.writeByte(time.getDayOfMonth());
        out.writeByte(time.getHour());
        out.writeByte(time.getMinute());
        out.writeByte(time.getSecond());
    }

    public static void encodeCommand(ByteBuf out, String vin, RequestType type, Consumer<ByteBuf> payloadEncoder) {
        encodeMessage(out, vin, type, ResponseTag.COMMAND, payloadEncoder);
    }

    public static void encodeLoginMessage(ByteBuf out, String vin, RequestType type,
                                          ResponseTag responseTag) {
        out.writeShort(START_SYMBOL);
        int startIndex = out.writerIndex();
        out.writeByte(RequestType.LOGIN.getValue());
        out.writeByte(responseTag.getValue());
        out.writeBytes(vin.getBytes(ASCII_CHARSET));
        out.writeByte(EncryptionType.PLAIN.getValue());
        int lengthIndex = out.writerIndex();
        out.writeShort(0);
        FrameHeader.CheckCodeProcessor checkCodeProcessor = new FrameHeader.CheckCodeProcessor();
        out.forEachByte(startIndex, FrameHeader.HEADER_LENGTH, checkCodeProcessor);
        out.writeByte(checkCodeProcessor.getCheckCode());
    }

    public static void encodeLogoutMessage(ByteBuf out, String vin, RequestType type,
                                           ResponseTag responseTag) {
        out.writeShort(START_SYMBOL);
        int startIndex = out.writerIndex();
        out.writeByte(RequestType.LOGOUT.getValue());
        out.writeByte(responseTag.getValue());
        out.writeBytes(vin.getBytes(ASCII_CHARSET));
        out.writeByte(EncryptionType.PLAIN.getValue());
        int lengthIndex = out.writerIndex();
        out.writeShort(0);
        FrameHeader.CheckCodeProcessor checkCodeProcessor = new FrameHeader.CheckCodeProcessor();
        out.forEachByte(startIndex, FrameHeader.HEADER_LENGTH, checkCodeProcessor);
        out.writeByte(checkCodeProcessor.getCheckCode());
    }


    /*
    payloadEncoder为消费者函数，后面的泛型写最后消费输出的数据的类型
     */
    public static void encodeMessage(ByteBuf out, String vin, RequestType type,
                                     ResponseTag tag, Consumer<ByteBuf> payloadEncoder) {
        //写启始符
        out.writeShort(START_SYMBOL);
        //记录写完启始符后的out此时的指针位置
        int startIndex = out.writerIndex();
        //写命令标识
        out.writeByte(type.getValue());
        //写应答标志
        out.writeByte(tag.getValue());
        //写vin（多个字节）
        out.writeBytes(vin.getBytes(ASCII_CHARSET));
        //写加密格式
        out.writeByte(EncryptionType.PLAIN.getValue());
        //记录数据单元长度的起始字节位置，后面要回写
        int lengthIndex = out.writerIndex();
        // 占位，数据长度占两个字节
        out.writeShort(0);
        //记录开始写数据单元的起始位置，后面用来算数据单元的长度
        int payloadBegin = out.writerIndex();
        //数据单元开始写,消费之模式里的accept方法消费数据单元并写入out中
        payloadEncoder.accept(out);
        //计算数据单元长度
        int payloadLength = out.writerIndex() - payloadBegin;
        // 回写长度
        out.setShort(lengthIndex, payloadLength);
        //创建与方法的对象
        FrameHeader.CheckCodeProcessor checkCodeProcessor = new FrameHeader.CheckCodeProcessor();
        /*采用BCC(异或校验)法,校验范围从命令单元的第一个字节开始,同后一字节异或,
            直到校验码前一字节为止,校验码占用一个字节,当数据单元存在加密时,应先加密后校验,先校验后解密*/
        out.forEachByte(startIndex, FrameHeader.HEADER_LENGTH + payloadLength, checkCodeProcessor);
        //用上一步计算出来的checkcode写入out中的最后一位
        out.writeByte(checkCodeProcessor.getCheckCode());
    }

    // TODO 自定义登入规则待完善
    public static void encodeLoginMessage(ChannelHandlerContext ctx, ByteBuf out, String vin, ResponseTag responseTag) {
        out.writeShort(START_SYMBOL);
        int startIndex = out.writerIndex();
        out.writeByte(RequestType.PLATFORM_LOGIN_RESPONSE.getValue());
        out.writeByte(responseTag.getValue());
        out.writeBytes(vin.getBytes(ASCII_CHARSET));
        out.writeByte(EncryptionType.PLAIN.getValue());
        int lengthIndex = out.writerIndex();
        out.writeShort(0);
        FrameHeader.CheckCodeProcessor checkCodeProcessor = new FrameHeader.CheckCodeProcessor();
        out.forEachByte(startIndex, FrameHeader.HEADER_LENGTH, checkCodeProcessor);
        out.writeByte(checkCodeProcessor.getCheckCode());
    }

    //  TODO 自定义登出规则待完善
    public static void encodeLogoutMessage(ChannelHandlerContext ctx, ByteBuf out, String vin, ResponseTag responseTag) {
        out.writeShort(START_SYMBOL);
        int startIndex = out.writerIndex();
        out.writeByte(RequestType.PLATFORM_LOGOUT_RESPONSE.getValue());
        out.writeByte(responseTag.getValue());
        out.writeBytes(vin.getBytes(ASCII_CHARSET));
        out.writeByte(EncryptionType.PLAIN.getValue());
        int lengthIndex = out.writerIndex();
        out.writeShort(0);
        FrameHeader.CheckCodeProcessor checkCodeProcessor = new FrameHeader.CheckCodeProcessor();
        out.forEachByte(startIndex, FrameHeader.HEADER_LENGTH, checkCodeProcessor);
        out.writeByte(checkCodeProcessor.getCheckCode());
    }

    // todo 自定义实时返回数据
    public static void realTimeResponse(ChannelHandlerContext ctx, ByteBuf out, String vin, ResponseTag responseTag) {
        out.writeShort(START_SYMBOL);
        int startIndex = out.writerIndex();
        out.writeByte(RequestType.REALTIME_RESPONSE.getValue());
        out.writeByte(responseTag.getValue());
        out.writeBytes(vin.getBytes(ASCII_CHARSET));
        out.writeByte(EncryptionType.PLAIN.getValue());
        int lengthIndex = out.writerIndex();
        out.writeShort(0);
        FrameHeader.CheckCodeProcessor checkCodeProcessor = new FrameHeader.CheckCodeProcessor();
        out.forEachByte(startIndex, FrameHeader.HEADER_LENGTH, checkCodeProcessor);
        out.writeByte(checkCodeProcessor.getCheckCode());
    }

}
