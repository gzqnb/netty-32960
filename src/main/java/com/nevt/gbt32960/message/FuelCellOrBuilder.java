package com.nevt.gbt32960.message;

public interface FuelCellOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * 燃料电池电压
     * </pre>
     *
     * <code>optional double fuel_cell_voltage = 1;</code>
     */
    double getFuelCellVoltage();

    /**
     * <pre>
     * 燃料电池电流
     * </pre>
     *
     * <code>optional double fuel_cell_current = 2;</code>
     */
    double getFuelCellCurrent();

    /**
     * <pre>
     * 燃料消耗率
     * </pre>
     *
     * <code>optional double fuel_consumption_rate = 3;</code>
     */
    double getFuelConsumptionRate();

    /**
     * <pre>
     * 燃料电池温度探针总数
     * </pre>
     *
     * <code>optional int32 total_number_of_fctp = 4;</code>
     */
    int getTotalNumberOfFctp();

    /**
     * <pre>
     * 探针温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature_value = 5;</code>
     */
    java.util.List<Integer> getProbeTemperatureValueList();

    /**
     * <pre>
     * 探针温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature_value = 5;</code>
     */
    int getProbeTemperatureValueCount();

    /**
     * <pre>
     * 探针温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature_value = 5;</code>
     */
    int getProbeTemperatureValue(int index);

    /**
     * <pre>
     * 氢系统中最高温度
     * </pre>
     *
     * <code>optional double highest_temp_of_hydrogen_system = 6;</code>
     */
    double getHighestTempOfHydrogenSystem();

    /**
     * <pre>
     * 氢系统中最高温度探针代号
     * </pre>
     *
     * <code>optional int32 highest_temp_probe_code_of_hyd_sys = 7;</code>
     */
    int getHighestTempProbeCodeOfHydSys();

    /**
     * <pre>
     * 氢气最高浓度
     * </pre>
     *
     * <code>optional int32 highest_con_of_hydrogen = 8;</code>
     */
    int getHighestConOfHydrogen();

    /**
     * <pre>
     * 氢气最高浓度传感器代号
     * </pre>
     *
     * <code>optional int32 highest_hy_con_sensor_code = 9;</code>
     */
    int getHighestHyConSensorCode();

    /**
     * <pre>
     * 氢气最高压力
     * </pre>
     *
     * <code>optional double hydrogen_max_pressure = 10;</code>
     */
    double getHydrogenMaxPressure();

    /**
     * <pre>
     * 氢气最高压力传感器代号
     * </pre>
     *
     * <code>optional int32 hydrogen_max_pressure_sensor_code = 11;</code>
     */
    int getHydrogenMaxPressureSensorCode();

    /**
     * <pre>
     * 高压DC/DC状态
     * </pre>
     *
     * <code>optional .FuelCell.HighVoltageDCState high_voltage_dc_state = 12;</code>
     */
    int getHighVoltageDcStateValue();

    /**
     * <pre>
     * 高压DC/DC状态
     * </pre>
     *
     * <code>optional .FuelCell.HighVoltageDCState high_voltage_dc_state = 12;</code>
     */
    FuelCell.HighVoltageDCState getHighVoltageDcState();
}
