package com.nevt.gbt32960.modle;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class FuelCell {

    private double fcVoltage;
    private double fcCurrent;
    private double fcFuelConsRate;
    private List<Integer> fcTempProbeTotal = Collections.emptyList();
    private double fcH2TempMax;
    private int fcH2TempMaxProbeID;
    private float fcH2ConcMax;
    private int fcH2ConcMaxSensID;
    private double fcH2PresMax;
    private int fcH2PresMaxSensID;
    private int fcDCDCStatus;

    public String getStatus() {
        switch (this.getFcDCDCStatus()) {
            case 0x01:
                return "工作";
            case 0x02:
                return "断开";
            case 0xFE:
                return "异常";
            case 0xFF:
                return "无效";
            default:
                return "UNKNOWN";
        }
    }
}
