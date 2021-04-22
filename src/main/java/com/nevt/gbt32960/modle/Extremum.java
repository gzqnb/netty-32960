package com.nevt.gbt32960.modle;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

@Data
public class Extremum {

    @JSONField(name = "VMMmaxVoltBatSubsysID")
    private int voltageMaxSubsystem;
    @JSONField(name = "VMMmaxVoltBatCellID")
    private int voltageMaxBattery;
    @JSONField(name = "VMMbatCellVoltMax")
    private float maxVoltage;
    @JSONField(name = "VMMbinVoltBatSysID")
    private int voltageMinSubsystem;
    @JSONField(name = "VMMminVoltBatCellID")
    private int voltageMinBattery;
    @JSONField(name = "VMMbatCellVoltMin")
    private float minVoltage;
    @JSONField(name = "VMMmaxTempSubsysID")
    private int temperatureMaxSubsystem;
    @JSONField(name = "VMMmaxTempProbeID")
    private int temperatureMaxProbe;
    @JSONField(name = "VMMmaxTemp")
    private int maxTemperature;
    @JSONField(name = "VMMminTempSubsysID")
    private int temperatureMinSubsystem;
    @JSONField(name = "VMMminTempProbeID")
    private int temperatureMinProbe;
    @JSONField(name = "VMMminTemp")
    private int minTemperature;

}
