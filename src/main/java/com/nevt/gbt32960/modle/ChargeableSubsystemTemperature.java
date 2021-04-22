package com.nevt.gbt32960.modle;

import lombok.Data;

import java.util.Collections;
import java.util.List;

@Data
public class ChargeableSubsystemTemperature {

    private int subSystemNumber;
    private List<Integer> probeTemperature = Collections.emptyList();

}
