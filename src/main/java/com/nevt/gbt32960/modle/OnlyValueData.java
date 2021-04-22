package com.nevt.gbt32960.modle;

import com.nevt.gbt32960.message.*;
import com.nevt.gbt32960.message.Alarm;
import com.nevt.gbt32960.message.ChargeableSubsystemElectric;
import com.nevt.gbt32960.message.ChargeableSubsystemTemperature;
import com.nevt.gbt32960.message.Engine;
import com.nevt.gbt32960.message.Extremum;
import com.nevt.gbt32960.message.FuelCell;
import com.nevt.gbt32960.type.FrameHeader;
import lombok.Data;

import java.util.List;

@Data
public class OnlyValueData {

    private FrameHeader frameHeader;
    private VehicleState vehicle;
    private List<MotorState> motor;
    private FuelCell fuelCell;
    private Engine engine;
    private VehicleLocation location;
    private Extremum extremum;
    private Alarm alarm;
    private List<ChargeableSubsystemTemperature> chargeableSubsystemTemperature;
    private List<ChargeableSubsystemElectric> chargeableSubsystemElectric;

}
