package com.nevt.gbt32960.message;

public interface ChargeableSubsystemElectricOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 可充电储能子系统号
     * </pre>
     *
     * <code>optional int32 chargeable_sub_system_number = 1;</code>
     */
    int getChargeableSubSystemNumber();

    /**
     * <pre>
     * 可充电储能装置电压
     * </pre>
     *
     * <code>optional float voltage = 2;</code>
     */
    float getVoltage();

    /**
     * <pre>
     * 可充电储能装置电流
     * </pre>
     *
     * <code>optional float current = 3;</code>
     */
    float getCurrent();

    /**
     * <pre>
     * 单体电池总数
     * </pre>
     *
     * <code>optional int64 battery_total_count = 4;</code>
     */
    long getBatteryTotalCount();

    /**
     * <pre>
     * 本帧起始电池序号
     * </pre>
     *
     * <code>optional int64 frame_start_battery_seq = 5;</code>
     */
    long getFrameStartBatterySeq();

    /**
     * <pre>
     * 单体电池电压值
     * </pre>
     *
     * <code>repeated float battery_voltage = 7;</code>
     */
    java.util.List<Float> getBatteryVoltageList();

    /**
     * <pre>
     * 单体电池电压值
     * </pre>
     *
     * <code>repeated float battery_voltage = 7;</code>
     */
    int getBatteryVoltageCount();

    /**
     * <pre>
     * 单体电池电压值
     * </pre>
     *
     * <code>repeated float battery_voltage = 7;</code>
     */
    float getBatteryVoltage(int index);
}
