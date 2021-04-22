package com.nevt.gbt32960.type;

import io.netty.util.ByteProcessor;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class FrameHeader {

    public static final int HEADER_LENGTH = 22;

    private final RequestType requestType;
    private final ResponseTag responseTag;
    private final String vin;
    private final EncryptionType encryptionType;
    private final int payloadLength;

    //必须继承ByteProcesser来重写process方法，在encode和decoder时的ByteBuf的foreachByte方法会用到
    public static final class CheckCodeProcessor implements ByteProcessor {

        @Getter
        private byte checkCode = (byte) 0x00;

        @Override
        public boolean process(byte value) throws Exception {
            checkCode ^= value;
            return true;
        }
    }

}
