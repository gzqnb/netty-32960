package com.nevt.gbt32960.modle;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Map;

@Data
public class Vehicle {

    private int vehStatus;
    private int vehChargeStatus;
    private int vehRunStatus;
    private float vehSpeed;
    private double vehOdometer;
    private float vehTotalVolt;
    private float vehTotalCurr;
    private int vehSOC;
    private int vehDCDCStatus;
    private int vehGear;
    private int vehResist;
    private Map<String,Object> reserved;


    public String getStatus() {
        switch (this.getVehStatus()) {
            case 0x01:
                return "启动";
            case 0x02:
                return "熄火";
            case 0x03:
                return "其它";
            case 0xFE:
                return "异常";
            case 0xFF:
                return "无效";
            default:
                return "UNKNOWN";
        }
    }

}
