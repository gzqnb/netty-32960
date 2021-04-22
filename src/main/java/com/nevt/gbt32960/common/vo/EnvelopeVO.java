package com.nevt.gbt32960.common.vo;

import lombok.Data;


@Data
public class EnvelopeVO {

    private int dataStationId;
    private int dataStationTypeId;
    private Object content;

    public static EnvelopeVO nullEnvelope() {
        EnvelopeVO envelopeVO = new EnvelopeVO();
        //参数错误
        envelopeVO.setDataStationTypeId(404);
        return envelopeVO;
    }

}
