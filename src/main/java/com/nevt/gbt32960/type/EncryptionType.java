package com.nevt.gbt32960.type;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EncryptionType {

    // 不加密
    PLAIN((byte) 0x01),
    // RSA 加密
    RSA((byte) 0x02),
    // AES128 加密
    AES128((byte) 0x03),
    // 异常
    ABNORMAL((byte) 0xFE),
    // 无效
    INVALID((byte) 0xFF);

    private final byte value;

    public static EncryptionType valueOf(byte type) {
        for (EncryptionType t : values()) {
            if (t.value == type) {
                return t;
            }
        }
        throw new IllegalArgumentException("Unknown message type : " + type);
    }

}
