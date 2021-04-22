package com.nevt.gbt32960.modle;

import lombok.Data;

@Data
public class PlatformLogin {

    private String loginTime;
    private int loginSeq;
    private String username;
    private String password;
    private int encrypotion;

}
