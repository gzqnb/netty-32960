package com.nevt.gbt32960.modle;

import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class ChargeableSubsystemElectric {

    private int chargeableSubSystemNumber;
    private float voltage;
    private float current;
    private long batteryTotalCount;
    private long frameStartBatterySeq;
    private List<Float> batteryVoltage = Collections.emptyList();

}
