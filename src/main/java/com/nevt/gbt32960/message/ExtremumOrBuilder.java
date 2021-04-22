package com.nevt.gbt32960.message;

public interface ExtremumOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 最高电压电池子系统号
     * </pre>
     *
     * <code>optional int32 voltage_max_subsystem = 1;</code>
     */
    int getVoltageMaxSubsystem();

    /**
     * <pre>
     * 最高电压电池单体代号
     * </pre>
     *
     * <code>optional int32 voltage_max_battery = 2;</code>
     */
    int getVoltageMaxBattery();

    /**
     * <pre>
     * 电池单体电压最高值
     * </pre>
     *
     * <code>optional float max_voltage = 3;</code>
     */
    float getMaxVoltage();

    /**
     * <pre>
     * 最低电压电池子系统号
     * </pre>
     *
     * <code>optional int32 voltage_min_subsystem = 4;</code>
     */
    int getVoltageMinSubsystem();

    /**
     * <pre>
     * 最低电压电池单体代号
     * </pre>
     *
     * <code>optional int32 voltage_min_battery = 5;</code>
     */
    int getVoltageMinBattery();

    /**
     * <pre>
     * 电池单体电压最低值
     * </pre>
     *
     * <code>optional float min_voltage = 6;</code>
     */
    float getMinVoltage();

    /**
     * <pre>
     * 最高温度子系统号
     * </pre>
     *
     * <code>optional int32 temperature_max_subsystem = 7;</code>
     */
    int getTemperatureMaxSubsystem();

    /**
     * <pre>
     * 最高温度探针序号
     * </pre>
     *
     * <code>optional int32 temperature_max_probe = 8;</code>
     */
    int getTemperatureMaxProbe();

    /**
     * <pre>
     * 最高温度值
     * </pre>
     *
     * <code>optional int32 max_temperature = 9;</code>
     */
    int getMaxTemperature();

    /**
     * <pre>
     * 最低温度子系统号
     * </pre>
     *
     * <code>optional int32 temperature_min_subsystem = 10;</code>
     */
    int getTemperatureMinSubsystem();

    /**
     * <pre>
     * 最低温度探针序号
     * </pre>
     *
     * <code>optional int32 temperature_min_probe = 11;</code>
     */
    int getTemperatureMinProbe();

    /**
     * <pre>
     * 最低温度值
     * </pre>
     *
     * <code>optional int32 min_temperature = 12;</code>
     */
    int getMinTemperature();
}
