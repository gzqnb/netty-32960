package com.nevt.gbt32960.modle;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
//驱动电机
@Data
public class Motor {

    private long motSn;
    private int motStatus;
    private int motCtrlTemp;
    private int motSpeed;
    private float motTorque;
    private int motTemp;
    private float motCtrlInpVolt;
    private float motCtrlDCBusCurr;

    public String getStatus() {
        switch (this.getMotStatus()) {
            case 0x01:
                return "耗电";
            case 0x02:
                return "发电";
            case 0x03:
                return "关闭";
            case 0x04:
                return "准备";
            case 0xFE:
                return "异常";
            case 0xFF:
                return "无效";
            default:
                return "UNKNOWN";
        }
    }

}
