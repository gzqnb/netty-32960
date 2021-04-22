package com.nevt.gbt32960.util;


import com.nevt.gbt32960.common.result.BaseResult;

public class VOUtil {

    public static BaseResult<Object> VO(boolean b, Object o) {
        if (b) {
            return BaseResult.custom(2000, "SUCCESS", o);
        }
        return BaseResult.custom(4004, "FAIL", null);
    }

    public static BaseResult<Object> VO(boolean b) {
        if (b) {
            return BaseResult.custom(2000, "SUCCESS", null);
        }
        return BaseResult.custom(4004, "FAIL", null);
    }

}
