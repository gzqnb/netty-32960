package com.nevt.gbt32960.modle;

import lombok.Data;

@Data
public class Location {

    private boolean gpsStatus;
    private double gpsLongitude;
    private double gpsLatitude;

    public String getStatus() {
        if (this.gpsStatus) {
            return "有效";
        } else {
            return "无效";
        }
    }
}
