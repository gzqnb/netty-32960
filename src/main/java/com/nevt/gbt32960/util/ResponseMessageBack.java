package com.nevt.gbt32960.util;

import com.nevt.gbt32960.message.PlatformMessage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseMessageBack {
    private String vin;
    private PlatformMessage message;
}
