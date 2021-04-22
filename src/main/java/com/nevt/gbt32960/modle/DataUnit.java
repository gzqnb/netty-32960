package com.nevt.gbt32960.modle;


import com.nevt.gbt32960.type.FrameHeader;
import lombok.Data;

import java.util.List;

@Data
//准备保存进postgre的数据单元
public class DataUnit {

    private FrameHeader frameHeader;
    private long dataCollectionTime;
    private Vehicle vehicle;
    private List<Motor> motors;
    private FuelCell fuelCell;
    private Engine engine;
    private Location location;
    private Extremum extremum;
    private Alarm alarm;
    private List<ChargeableSubsystemElectric> chargeableSubsystemElectricsList;
    private List<ChargeableSubsystemTemperature> chargeableSubsystemTemperatureList;


}
