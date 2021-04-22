package com.nevt.gbt32960.type;

import lombok.AllArgsConstructor;
import lombok.Getter;
// 命令标志
@AllArgsConstructor
@Getter
public enum RequestType {
    // 车辆登入
    LOGIN((byte) 0x01),
    // 实时信息上报
    REAL_TIME((byte) 0x02),
    // 补发信息上报
    REISSUE((byte) 0x03),
    // 车辆登出
    LOGOUT((byte) 0x04),
    // 平台登入
    PLATFORM_LOGIN((byte) 0x05),
    // 平台登出
    PLATFORM_LOGOUT((byte) 0x06),

    //平台交换自定义数据0xC0~0xFE
    PLATFORM_LOGIN_RESPONSE((byte) 0xC0),
    PLATFORM_LOGOUT_RESPONSE((byte) 0xC1),
    REALTIME_RESPONSE((byte) 0xC2);

    private final byte value;

    public static RequestType valueOf(byte type) {
        for (RequestType t : values()) {
            if (t.value == type) {
                return t;
            }
        }
        throw new IllegalArgumentException("Unknown message type : " + type);
    }

}
