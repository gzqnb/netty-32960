package com.nevt.gbt32960.message;

public interface ChargeableSubsystemTemperatureOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 可充电储能子系统号
     * </pre>
     *
     * <code>optional int32 sub_system_number = 1;</code>
     */
    int getSubSystemNumber();

    /**
     * <pre>
     * 可充电储能子系统各温度探针检测到的温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature = 2;</code>
     */
    java.util.List<Integer> getProbeTemperatureList();

    /**
     * <pre>
     * 可充电储能子系统各温度探针检测到的温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature = 2;</code>
     */
    int getProbeTemperatureCount();

    /**
     * <pre>
     * 可充电储能子系统各温度探针检测到的温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature = 2;</code>
     */
    int getProbeTemperature(int index);
}
