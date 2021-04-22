package com.nevt.gbt32960.message;

public interface AlarmOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 max_alarm_level = 1;</code>
     */
    int getMaxAlarmLevel();

    /**
     * <code>optional int32 alarm_bit_identify = 2;</code>
     */
    int getAlarmBitIdentify();

    /**
     * <code>optional int32 battery_fault_num = 3;</code>
     */
    int getBatteryFaultNum();

    /**
     * <code>repeated int32 battery_fault_data = 4;</code>
     */
    java.util.List<Integer> getBatteryFaultDataList();

    /**
     * <code>repeated int32 battery_fault_data = 4;</code>
     */
    int getBatteryFaultDataCount();

    /**
     * <code>repeated int32 battery_fault_data = 4;</code>
     */
    int getBatteryFaultData(int index);

    /**
     * <code>optional int32 motor_fault_num = 5;</code>
     */
    int getMotorFaultNum();

    /**
     * <code>repeated int32 motor_fault_data = 6;</code>
     */
    java.util.List<Integer> getMotorFaultDataList();

    /**
     * <code>repeated int32 motor_fault_data = 6;</code>
     */
    int getMotorFaultDataCount();

    /**
     * <code>repeated int32 motor_fault_data = 6;</code>
     */
    int getMotorFaultData(int index);

    /**
     * <code>optional int32 engine_fault_num = 7;</code>
     */
    int getEngineFaultNum();

    /**
     * <code>repeated int32 engine_fault_data = 8;</code>
     */
    java.util.List<Integer> getEngineFaultDataList();

    /**
     * <code>repeated int32 engine_fault_data = 8;</code>
     */
    int getEngineFaultDataCount();

    /**
     * <code>repeated int32 engine_fault_data = 8;</code>
     */
    int getEngineFaultData(int index);

    /**
     * <code>optional int32 other_fault_num = 9;</code>
     */
    int getOtherFaultNum();

    /**
     * <code>repeated int32 other_fault_data = 10;</code>
     */
    java.util.List<Integer> getOtherFaultDataList();

    /**
     * <code>repeated int32 other_fault_data = 10;</code>
     */
    int getOtherFaultDataCount();

    /**
     * <code>repeated int32 other_fault_data = 10;</code>
     */
    int getOtherFaultData(int index);
}
