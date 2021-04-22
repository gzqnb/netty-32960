package com.nevt.gbt32960.formatters;

import com.nevt.gbt32960.modle.*;
import com.nevt.gbt32960.message.MotorState;
import com.nevt.gbt32960.message.RealTimeReport;
import com.nevt.gbt32960.message.VehicleLocation;
import com.nevt.gbt32960.message.VehicleState;
import com.nevt.gbt32960.type.FrameHeader;
import com.nevt.gbt32960.util.GBT32960Message;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FormatterToDataUnit {

    private static final String CSE = "cse";
    private static final String CST = "cst";
    private static final String MOTOR = "motors";

    //todo 保存不同种类的信息类型
    public static DataUnit RealTimeReportToDataUnit(RealTimeReport realTimeReport, FrameHeader frameHeader) {
        DataUnit dataUnit = new DataUnit();

        dataUnit.setFrameHeader(frameHeader);
        // 设置记录时间
        dataUnit.setDataCollectionTime(realTimeReport.getRecordTime());
        // 查找驱动机数据
        List<Motor> motors = new ArrayList<>();
        realTimeReport.getMotorList().forEach(s -> motors.add(toMotor(s)));
        dataUnit.setMotors(motors);
        // 查找可充电储能装置电压数据
        List<ChargeableSubsystemElectric> cses = new ArrayList<>();
        realTimeReport.getChargeSystemElectricList().forEach(s -> cses.add(toCSE(s)));
        dataUnit.setChargeableSubsystemElectricsList(cses);
        // 查找可充电储能装置温度数据
        List<ChargeableSubsystemTemperature> csts = new ArrayList<>();
        realTimeReport.getChargeSystemTemperatureList().forEach(s -> csts.add(toCST(s)));
        dataUnit.setChargeableSubsystemTemperatureList(csts);

        dataUnit.setAlarm(toAlarm(realTimeReport.getAlarm()));
        dataUnit.setDataCollectionTime(realTimeReport.getRecordTime());
        dataUnit.setEngine(toEngine(realTimeReport.getEngine()));
        dataUnit.setExtremum(toExtremum(realTimeReport.getExtremum()));
        dataUnit.setLocation(toLocation(realTimeReport.getLocation()));
        dataUnit.setFuelCell(toFuelCell(realTimeReport.getFuelCell()));
        dataUnit.setVehicle(toVehicle(realTimeReport.getVehicleState()));

        return dataUnit;
    }

    public static OnlyValueData toOnlyValueData(GBT32960Message source) {
        RealTimeReport dataUnit = (RealTimeReport) source.getDataUnit();
        OnlyValueData onlyValueData = new OnlyValueData();
        onlyValueData.setFrameHeader(source.getHeader());
        onlyValueData.setVehicle(dataUnit.getVehicleState());
        onlyValueData.setMotor(dataUnit.getMotorList());
        onlyValueData.setFuelCell(dataUnit.getFuelCell());
        onlyValueData.setEngine(dataUnit.getEngine());
        onlyValueData.setLocation(dataUnit.getLocation());
        onlyValueData.setExtremum(dataUnit.getExtremum());
        onlyValueData.setChargeableSubsystemElectric(dataUnit.getChargeSystemElectricList());
        onlyValueData.setChargeableSubsystemTemperature(dataUnit.getChargeSystemTemperatureList());
        return onlyValueData;
    }

    public static DataUnit RealTimeReportToDataUnit(List<Object> source, Map<String, List<Object>> mapList) {
        DataUnit dataUnit = new DataUnit();
        mapList.forEach((k, v) -> {
            if (k.equals(CSE)) {
                List<ChargeableSubsystemElectric> list = new ArrayList<>();
                v.forEach(cse -> list.add(toCSE((com.nevt.gbt32960.message.ChargeableSubsystemElectric) cse)));
                dataUnit.setChargeableSubsystemElectricsList(list);
            }
            if (k.equals(CST)) {
                List<ChargeableSubsystemTemperature> list = new ArrayList<>();
                v.forEach(cst -> list.add(toCST((com.nevt.gbt32960.message.ChargeableSubsystemTemperature) cst)));
                dataUnit.setChargeableSubsystemTemperatureList(list);
            }
            if (k.equals(MOTOR)) {
                List<Motor> list = new ArrayList<>();
                v.forEach(res -> list.add(toMotor((MotorState) res)));
                dataUnit.setMotors(list);
            }
        });

        source.forEach(s -> {
            if (s instanceof Long) {
                long time = (long) s;
                dataUnit.setDataCollectionTime(time);
            }
            if (s instanceof com.nevt.gbt32960.message.Extremum) {
                com.nevt.gbt32960.message.Extremum extremum = (com.nevt.gbt32960.message.Extremum) s;
                dataUnit.setExtremum(toExtremum(extremum));
            }
            if (s instanceof com.nevt.gbt32960.message.Engine) {
                com.nevt.gbt32960.message.Engine engine = (com.nevt.gbt32960.message.Engine) s;
                dataUnit.setEngine(toEngine(engine));
            }
            if (s instanceof com.nevt.gbt32960.message.Alarm) {
                com.nevt.gbt32960.message.Alarm alarm = (com.nevt.gbt32960.message.Alarm) s;
                dataUnit.setAlarm(toAlarm(alarm));
            }
            if (s instanceof com.nevt.gbt32960.message.VehicleState) {
                VehicleState vehicleState = (VehicleState) s;
                dataUnit.setVehicle(toVehicle(vehicleState));
            }
            if (s instanceof com.nevt.gbt32960.message.VehicleLocation) {
                VehicleLocation vehicleLocation = (VehicleLocation) s;
                dataUnit.setLocation(toLocation(vehicleLocation));
            }
            if (s instanceof com.nevt.gbt32960.message.FuelCell) {
                com.nevt.gbt32960.message.FuelCell fuelCell = (com.nevt.gbt32960.message.FuelCell) s;
                dataUnit.setFuelCell(toFuelCell(fuelCell));
            }
        });
        return dataUnit;
    }

    public static ChargeableSubsystemTemperature toCST(com.nevt.gbt32960.message.ChargeableSubsystemTemperature source) {
        ChargeableSubsystemTemperature chargeableSubsystemTemperature = new ChargeableSubsystemTemperature();
        chargeableSubsystemTemperature.setSubSystemNumber(source.getSubSystemNumber());
        chargeableSubsystemTemperature.setProbeTemperature(source.getProbeTemperatureList());
        return chargeableSubsystemTemperature;
    }

    public static ChargeableSubsystemElectric toCSE(com.nevt.gbt32960.message.ChargeableSubsystemElectric source) {
        ChargeableSubsystemElectric chargeableSubsystemElectric = new ChargeableSubsystemElectric();
        chargeableSubsystemElectric.setChargeableSubSystemNumber(source.getChargeableSubSystemNumber());
        chargeableSubsystemElectric.setVoltage(source.getVoltage());
        chargeableSubsystemElectric.setCurrent(source.getCurrent());
        chargeableSubsystemElectric.setBatteryTotalCount(source.getBatteryTotalCount());
        chargeableSubsystemElectric.setFrameStartBatterySeq(source.getFrameStartBatterySeq());
        chargeableSubsystemElectric.setBatteryVoltage(source.getBatteryVoltageList());
        return chargeableSubsystemElectric;
    }

    public static Alarm toAlarm(com.nevt.gbt32960.message.Alarm source) {
        Alarm alarm = new Alarm();
        alarm.setMaxAlarmLevel(source.getMaxAlarmLevel());
        alarm.setAlarmBitIdentify(source.getAlarmBitIdentify());
        alarm.setBatteryFaultNum(source.getBatteryFaultNum());
        alarm.setBatteryFaultData(source.getBatteryFaultDataList());
        alarm.setEngineFaultNum(source.getEngineFaultNum());
        alarm.setEngineFaultData(source.getEngineFaultDataList());
        alarm.setOtherFaultNum(source.getOtherFaultNum());
        alarm.setOtherFaultData(source.getOtherFaultDataList());
        return alarm;
    }

    public static Extremum toExtremum(com.nevt.gbt32960.message.Extremum source) {
        Extremum extremum = new Extremum();
        extremum.setVoltageMaxSubsystem(source.getVoltageMaxSubsystem());
        extremum.setVoltageMaxBattery(source.getVoltageMaxBattery());
        extremum.setMaxVoltage(source.getMaxVoltage());
        extremum.setVoltageMinSubsystem(source.getVoltageMinSubsystem());
        extremum.setVoltageMinBattery(source.getVoltageMinBattery());
        extremum.setMinVoltage(source.getMinVoltage());
        extremum.setTemperatureMaxSubsystem(source.getTemperatureMaxSubsystem());
        extremum.setTemperatureMaxProbe(source.getTemperatureMaxProbe());
        extremum.setMaxTemperature(source.getMaxTemperature());
        extremum.setTemperatureMinSubsystem(source.getTemperatureMinSubsystem());
        extremum.setTemperatureMinProbe(source.getTemperatureMinProbe());
        extremum.setMinTemperature(source.getMinTemperature());
        return extremum;
    }

    public static Location toLocation(VehicleLocation source) {
        Location location = new Location();
        location.setGpsStatus(source.getIsValid());
        location.setGpsLongitude(source.getLongitude());
        location.setGpsLatitude(source.getLatitude());
        return location;
    }

    public static Engine toEngine(com.nevt.gbt32960.message.Engine source) {
        Engine engine = new Engine();
        engine.setVEGStatus(source.getEngineStateValue());
        engine.setVEGSpeed(source.getCrankshaftSpeed());
        engine.setVEGFuelRate(source.getFuelConsumptionRate());
        return engine;
    }

    public static FuelCell toFuelCell(com.nevt.gbt32960.message.FuelCell source) {
        FuelCell fuelCell = new FuelCell();
        fuelCell.setFcVoltage(source.getFuelCellVoltage());
        fuelCell.setFcCurrent(source.getFuelCellCurrent());
        fuelCell.setFcFuelConsRate(source.getFuelConsumptionRate());
        fuelCell.setFcTempProbeTotal(source.getProbeTemperatureValueList());
        fuelCell.setFcH2TempMax(source.getHighestTempOfHydrogenSystem());
        fuelCell.setFcH2TempMaxProbeID(source.getHighestTempProbeCodeOfHydSys());
        fuelCell.setFcH2ConcMax(source.getHighestConOfHydrogen());
        fuelCell.setFcH2ConcMaxSensID(source.getHighestHyConSensorCode());
        fuelCell.setFcH2PresMax(source.getHydrogenMaxPressure());
        fuelCell.setFcH2PresMaxSensID(source.getHydrogenMaxPressureSensorCode());
        fuelCell.setFcDCDCStatus(source.getHighVoltageDcStateValue());
        return fuelCell;
    }

    public static Motor toMotor(MotorState source) {
        Motor motor = new Motor();
        motor.setMotSn(source.getMotorSeq());
        motor.setMotStatus(source.getStatusValue());
        motor.setMotSpeed(source.getMotorSpeed());
        motor.setMotTorque(source.getMotorTorque());
        motor.setMotTemp(source.getMotorTemperature());
        motor.setMotCtrlInpVolt(source.getControllerVoltage());
        motor.setMotCtrlDCBusCurr(source.getControllerCurrent());
        motor.setMotCtrlTemp(source.getControllerTemperature());
        return motor;
    }

    public static Vehicle toVehicle(VehicleState source) {
        Vehicle vehicle = new Vehicle();
        Map<String, Object> reserved = new HashMap<>(12);
        vehicle.setVehStatus(source.getOperatingStateValue());
        vehicle.setVehChargeStatus(source.getChargingStateValue());
        vehicle.setVehRunStatus(source.getOperationModeValue());
        vehicle.setVehSpeed(source.getSpeed());
        vehicle.setVehOdometer(source.getMileage());
        vehicle.setVehTotalVolt(source.getVoltage());
        vehicle.setVehTotalCurr(source.getCurrent());
        vehicle.setVehChargeStatus(source.getStateOfCharge());
        vehicle.setVehDCDCStatus(source.getDcInverterStateValue());
        vehicle.setVehGear(source.getGearPosition());
        vehicle.setVehResist(source.getInsulance());
        reserved.put("acceleratorTravel", source.getAcceleratorTravel());
        reserved.put("breakeTravel", source.getBrakeTravel());
        vehicle.setReserved(reserved);
        return vehicle;
    }

}
