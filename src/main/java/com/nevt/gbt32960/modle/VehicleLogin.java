package com.nevt.gbt32960.modle;

import lombok.Data;

@Data
public class VehicleLogin {

    private String loginTime;
    private int loginSeq;
    private String ICCID;
    private int systemCodeLength;
    private String chargeableSubsystemCode;

}
