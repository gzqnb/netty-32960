package com.nevt.gbt32960.common.dto;

import lombok.Data;

import java.util.Date;

@Data
public class Envelope {

    private int dataStationId;
    private int dataStationTypeId;
    private Date cTime;
    private Date uTime;
    private Object content;
}