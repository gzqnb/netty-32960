package com.nevt.gbt32960.modle;

import com.alibaba.fastjson.annotation.JSONCreator;
import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class Alarm {

    @JSONField(name = "VALmaxLevel")
    private int maxAlarmLevel;
    @JSONField(name = "VALcommFlag")
    private int alarmBitIdentify;
    @JSONField(name = "VALchagStorTotal")
    private int batteryFaultNum;
    @JSONField(name = "VALchagStorList")
    private List<Integer> batteryFaultData = Collections.emptyList();
    @JSONField(name = "VALmotTotal")
    private int motorFaultNum;
    @JSONField(name = "VALmotList")
    private List<Integer> motorFaultData = Collections.emptyList();
    @JSONField(name = "VALengTotal")
    private int engineFaultNum;
    @JSONField(name = "VALengList")
    private List<Integer> engineFaultData = Collections.emptyList();
    @JSONField(name = "VALothersTotal")
    private int otherFaultNum;
    @JSONField(name = "VALothersList")
    private List<Integer> otherFaultData = Collections.emptyList();

}
