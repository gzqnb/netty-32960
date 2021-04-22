package com.nevt.gbt32960.common.dto;

import lombok.Data;

import java.util.Map;

@Data
public class Information {

    private int deviceTypeId;
    private int deviceId;
    private int deviceIndex;
    private Map<String,Object> values;

}
