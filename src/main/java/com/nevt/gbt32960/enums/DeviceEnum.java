package com.nevt.gbt32960.enums;

public enum DeviceEnum {

    VEHICLE(30011),
    MOTOR(30008),
    FUELCELL(30007),
    ENGINE(30025),
    LOCATION(30012),
    EXTREMUM(30019),
    ALARM(30020)
    ;


    private int deviceTypeId;

    DeviceEnum(int deviceTypeId) {
        this.deviceTypeId = deviceTypeId;
    }

    public int getDeviceTypeId() {
        return deviceTypeId;
    }

}
