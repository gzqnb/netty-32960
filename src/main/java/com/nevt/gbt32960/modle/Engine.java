package com.nevt.gbt32960.modle;

import com.alibaba.fastjson.annotation.JSONField;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

@Data
public class Engine {


    @JSONField(name = "VEGStatus")
    private int vEGStatus;
    @JSONField(name = "VEGSpeed")
    private int vEGSpeed;
    @JSONField(name = "VEGFuelRate")
    private double vEGFuelRate;

    public String getStatus() {
        switch (this.getVEGStatus()) {
            case 0x01:
                return "启动";
            case 0x02:
                return "关闭";
            case 0xFE:
                return "异常";
            case 0xFF:
                return "无效";
            default:
                return "UNKNOWN";
        }
    }
}
