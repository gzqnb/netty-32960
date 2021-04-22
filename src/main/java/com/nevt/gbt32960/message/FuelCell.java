package com.nevt.gbt32960.message;

/**
 * <pre>
 * 燃料电池数据
 * </pre>
 * <p>
 * Protobuf type {@code FuelCell}
 */
public final class FuelCell extends
        com.google.protobuf.GeneratedMessageV3 implements
        FuelCellOrBuilder {
    private FuelCell(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private FuelCell() {
        fuelCellVoltage_ = 0D;
        fuelCellCurrent_ = 0D;
        fuelConsumptionRate_ = 0D;
        totalNumberOfFctp_ = 0;
        probeTemperatureValue_ = java.util.Collections.emptyList();
        highestTempOfHydrogenSystem_ = 0D;
        highestTempProbeCodeOfHydSys_ = 0;
        highestConOfHydrogen_ = 0;
        highestHyConSensorCode_ = 0;
        hydrogenMaxPressure_ = 0D;
        hydrogenMaxPressureSensorCode_ = 0;
        highVoltageDcState_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private FuelCell(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        this();
        int mutable_bitField0_ = 0;
        try {
            boolean done = false;
            while (!done) {
                int tag = input.readTag();
                switch (tag) {
                    case 0:
                        done = true;
                        break;
                    default: {
                        if (!input.skipField(tag)) {
                            done = true;
                        }
                        break;
                    }
                    case 9: {

                        fuelCellVoltage_ = input.readDouble();
                        break;
                    }
                    case 17: {

                        fuelCellCurrent_ = input.readDouble();
                        break;
                    }
                    case 25: {

                        fuelConsumptionRate_ = input.readDouble();
                        break;
                    }
                    case 32: {

                        totalNumberOfFctp_ = input.readInt32();
                        break;
                    }
                    case 40: {
                        if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                            probeTemperatureValue_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000010;
                        }
                        probeTemperatureValue_.add(input.readInt32());
                        break;
                    }
                    case 42: {
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if (!((mutable_bitField0_ & 0x00000010) == 0x00000010) && input.getBytesUntilLimit() > 0) {
                            probeTemperatureValue_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000010;
                        }
                        while (input.getBytesUntilLimit() > 0) {
                            probeTemperatureValue_.add(input.readInt32());
                        }
                        input.popLimit(limit);
                        break;
                    }
                    case 49: {

                        highestTempOfHydrogenSystem_ = input.readDouble();
                        break;
                    }
                    case 56: {

                        highestTempProbeCodeOfHydSys_ = input.readInt32();
                        break;
                    }
                    case 64: {

                        highestConOfHydrogen_ = input.readInt32();
                        break;
                    }
                    case 72: {

                        highestHyConSensorCode_ = input.readInt32();
                        break;
                    }
                    case 81: {

                        hydrogenMaxPressure_ = input.readDouble();
                        break;
                    }
                    case 88: {

                        hydrogenMaxPressureSensorCode_ = input.readInt32();
                        break;
                    }
                    case 96: {
                        int rawValue = input.readEnum();

                        highVoltageDcState_ = rawValue;
                        break;
                    }
                }
            }
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(this);
        } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(
                    e).setUnfinishedMessage(this);
        } finally {
            if (((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                probeTemperatureValue_ = java.util.Collections.unmodifiableList(probeTemperatureValue_);
            }
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_FuelCell_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_FuelCell_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        FuelCell.class, Builder.class);
    }

    /**
     * Protobuf enum {@code FuelCell.HighVoltageDCState}
     */
    public enum HighVoltageDCState
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <pre>
         * unused
         * </pre>
         *
         * <code>_1 = 0;</code>
         */
        _1(0),
        /**
         * <pre>
         * 工作
         * </pre>
         *
         * <code>ON = 1;</code>
         */
        ON(1),
        /**
         * <pre>
         * 断开
         * </pre>
         *
         * <code>OFF = 2;</code>
         */
        OFF(2),
        /**
         * <code>HIGH_VOLTAGE_DC_EXCEPTION = 254;</code>
         */
        HIGH_VOLTAGE_DC_EXCEPTION(254),
        /**
         * <code>HIGH_VOLTAGE_DC_INVALID = 255;</code>
         */
        HIGH_VOLTAGE_DC_INVALID(255),
        UNRECOGNIZED(-1),
        ;

        /**
         * <pre>
         * unused
         * </pre>
         *
         * <code>_1 = 0;</code>
         */
        public static final int _1_VALUE = 0;
        /**
         * <pre>
         * 工作
         * </pre>
         *
         * <code>ON = 1;</code>
         */
        public static final int ON_VALUE = 1;
        /**
         * <pre>
         * 断开
         * </pre>
         *
         * <code>OFF = 2;</code>
         */
        public static final int OFF_VALUE = 2;
        /**
         * <code>HIGH_VOLTAGE_DC_EXCEPTION = 254;</code>
         */
        public static final int HIGH_VOLTAGE_DC_EXCEPTION_VALUE = 254;
        /**
         * <code>HIGH_VOLTAGE_DC_INVALID = 255;</code>
         */
        public static final int HIGH_VOLTAGE_DC_INVALID_VALUE = 255;


        public final int getNumber() {
            if (this == UNRECOGNIZED) {
                throw new IllegalArgumentException(
                        "Can't get the number of an unknown enum value.");
            }
            return value;
        }

        /**
         * @deprecated Use {@link #forNumber(int)} instead.
         */
        @Deprecated
        public static HighVoltageDCState valueOf(int value) {
            return forNumber(value);
        }

        public static HighVoltageDCState forNumber(int value) {
            switch (value) {
                case 0:
                    return _1;
                case 1:
                    return ON;
                case 2:
                    return OFF;
                case 254:
                    return HIGH_VOLTAGE_DC_EXCEPTION;
                case 255:
                    return HIGH_VOLTAGE_DC_INVALID;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<HighVoltageDCState>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                HighVoltageDCState> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<HighVoltageDCState>() {
                    public HighVoltageDCState findValueByNumber(int number) {
                        return HighVoltageDCState.forNumber(number);
                    }
                };

        public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
            return getDescriptor().getValues().get(ordinal());
        }

        public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
            return getDescriptor();
        }

        public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
            return FuelCell.getDescriptor().getEnumTypes().get(0);
        }

        private static final HighVoltageDCState[] VALUES = values();

        public static HighVoltageDCState valueOf(
                com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
            if (desc.getType() != getDescriptor()) {
                throw new IllegalArgumentException(
                        "EnumValueDescriptor is not for this type.");
            }
            if (desc.getIndex() == -1) {
                return UNRECOGNIZED;
            }
            return VALUES[desc.getIndex()];
        }

        private final int value;

        private HighVoltageDCState(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:FuelCell.HighVoltageDCState)
    }

    private int bitField0_;
    public static final int FUEL_CELL_VOLTAGE_FIELD_NUMBER = 1;
    private double fuelCellVoltage_;

    /**
     * <pre>
     * 燃料电池电压
     * </pre>
     *
     * <code>optional double fuel_cell_voltage = 1;</code>
     */
    public double getFuelCellVoltage() {
        return fuelCellVoltage_;
    }

    public static final int FUEL_CELL_CURRENT_FIELD_NUMBER = 2;
    private double fuelCellCurrent_;

    /**
     * <pre>
     * 燃料电池电流
     * </pre>
     *
     * <code>optional double fuel_cell_current = 2;</code>
     */
    public double getFuelCellCurrent() {
        return fuelCellCurrent_;
    }

    public static final int FUEL_CONSUMPTION_RATE_FIELD_NUMBER = 3;
    private double fuelConsumptionRate_;

    /**
     * <pre>
     * 燃料消耗率
     * </pre>
     *
     * <code>optional double fuel_consumption_rate = 3;</code>
     */
    public double getFuelConsumptionRate() {
        return fuelConsumptionRate_;
    }

    public static final int TOTAL_NUMBER_OF_FCTP_FIELD_NUMBER = 4;
    private int totalNumberOfFctp_;

    /**
     * <pre>
     * 燃料电池温度探针总数
     * </pre>
     *
     * <code>optional int32 total_number_of_fctp = 4;</code>
     */
    public int getTotalNumberOfFctp() {
        return totalNumberOfFctp_;
    }

    public static final int PROBE_TEMPERATURE_VALUE_FIELD_NUMBER = 5;
    private java.util.List<Integer> probeTemperatureValue_;

    /**
     * <pre>
     * 探针温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature_value = 5;</code>
     */
    public java.util.List<Integer>
    getProbeTemperatureValueList() {
        return probeTemperatureValue_;
    }

    /**
     * <pre>
     * 探针温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature_value = 5;</code>
     */
    public int getProbeTemperatureValueCount() {
        return probeTemperatureValue_.size();
    }

    /**
     * <pre>
     * 探针温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature_value = 5;</code>
     */
    public int getProbeTemperatureValue(int index) {
        return probeTemperatureValue_.get(index);
    }

    private int probeTemperatureValueMemoizedSerializedSize = -1;

    public static final int HIGHEST_TEMP_OF_HYDROGEN_SYSTEM_FIELD_NUMBER = 6;
    private double highestTempOfHydrogenSystem_;

    /**
     * <pre>
     * 氢系统中最高温度
     * </pre>
     *
     * <code>optional double highest_temp_of_hydrogen_system = 6;</code>
     */
    public double getHighestTempOfHydrogenSystem() {
        return highestTempOfHydrogenSystem_;
    }

    public static final int HIGHEST_TEMP_PROBE_CODE_OF_HYD_SYS_FIELD_NUMBER = 7;
    private int highestTempProbeCodeOfHydSys_;

    /**
     * <pre>
     * 氢系统中最高温度探针代号
     * </pre>
     *
     * <code>optional int32 highest_temp_probe_code_of_hyd_sys = 7;</code>
     */
    public int getHighestTempProbeCodeOfHydSys() {
        return highestTempProbeCodeOfHydSys_;
    }

    public static final int HIGHEST_CON_OF_HYDROGEN_FIELD_NUMBER = 8;
    private int highestConOfHydrogen_;

    /**
     * <pre>
     * 氢气最高浓度
     * </pre>
     *
     * <code>optional int32 highest_con_of_hydrogen = 8;</code>
     */
    public int getHighestConOfHydrogen() {
        return highestConOfHydrogen_;
    }

    public static final int HIGHEST_HY_CON_SENSOR_CODE_FIELD_NUMBER = 9;
    private int highestHyConSensorCode_;

    /**
     * <pre>
     * 氢气最高浓度传感器代号
     * </pre>
     *
     * <code>optional int32 highest_hy_con_sensor_code = 9;</code>
     */
    public int getHighestHyConSensorCode() {
        return highestHyConSensorCode_;
    }

    public static final int HYDROGEN_MAX_PRESSURE_FIELD_NUMBER = 10;
    private double hydrogenMaxPressure_;

    /**
     * <pre>
     * 氢气最高压力
     * </pre>
     *
     * <code>optional double hydrogen_max_pressure = 10;</code>
     */
    public double getHydrogenMaxPressure() {
        return hydrogenMaxPressure_;
    }

    public static final int HYDROGEN_MAX_PRESSURE_SENSOR_CODE_FIELD_NUMBER = 11;
    private int hydrogenMaxPressureSensorCode_;

    /**
     * <pre>
     * 氢气最高压力传感器代号
     * </pre>
     *
     * <code>optional int32 hydrogen_max_pressure_sensor_code = 11;</code>
     */
    public int getHydrogenMaxPressureSensorCode() {
        return hydrogenMaxPressureSensorCode_;
    }

    public static final int HIGH_VOLTAGE_DC_STATE_FIELD_NUMBER = 12;
    private int highVoltageDcState_;

    /**
     * <pre>
     * 高压DC/DC状态
     * </pre>
     *
     * <code>optional .FuelCell.HighVoltageDCState high_voltage_dc_state = 12;</code>
     */
    public int getHighVoltageDcStateValue() {
        return highVoltageDcState_;
    }

    /**
     * <pre>
     * 高压DC/DC状态
     * </pre>
     *
     * <code>optional .FuelCell.HighVoltageDCState high_voltage_dc_state = 12;</code>
     */
    public HighVoltageDCState getHighVoltageDcState() {
        HighVoltageDCState result = HighVoltageDCState.valueOf(highVoltageDcState_);
        return result == null ? HighVoltageDCState.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;

    public final boolean isInitialized() {
        byte isInitialized = memoizedIsInitialized;
        if (isInitialized == 1) return true;
        if (isInitialized == 0) return false;

        memoizedIsInitialized = 1;
        return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
            throws java.io.IOException {
        getSerializedSize();
        if (fuelCellVoltage_ != 0D) {
            output.writeDouble(1, fuelCellVoltage_);
        }
        if (fuelCellCurrent_ != 0D) {
            output.writeDouble(2, fuelCellCurrent_);
        }
        if (fuelConsumptionRate_ != 0D) {
            output.writeDouble(3, fuelConsumptionRate_);
        }
        if (totalNumberOfFctp_ != 0) {
            output.writeInt32(4, totalNumberOfFctp_);
        }
        if (getProbeTemperatureValueList().size() > 0) {
            output.writeUInt32NoTag(42);
            output.writeUInt32NoTag(probeTemperatureValueMemoizedSerializedSize);
        }
        for (int i = 0; i < probeTemperatureValue_.size(); i++) {
            output.writeInt32NoTag(probeTemperatureValue_.get(i));
        }
        if (highestTempOfHydrogenSystem_ != 0D) {
            output.writeDouble(6, highestTempOfHydrogenSystem_);
        }
        if (highestTempProbeCodeOfHydSys_ != 0) {
            output.writeInt32(7, highestTempProbeCodeOfHydSys_);
        }
        if (highestConOfHydrogen_ != 0) {
            output.writeInt32(8, highestConOfHydrogen_);
        }
        if (highestHyConSensorCode_ != 0) {
            output.writeInt32(9, highestHyConSensorCode_);
        }
        if (hydrogenMaxPressure_ != 0D) {
            output.writeDouble(10, hydrogenMaxPressure_);
        }
        if (hydrogenMaxPressureSensorCode_ != 0) {
            output.writeInt32(11, hydrogenMaxPressureSensorCode_);
        }
        if (highVoltageDcState_ != HighVoltageDCState._1.getNumber()) {
            output.writeEnum(12, highVoltageDcState_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (fuelCellVoltage_ != 0D) {
            size += com.google.protobuf.CodedOutputStream
                    .computeDoubleSize(1, fuelCellVoltage_);
        }
        if (fuelCellCurrent_ != 0D) {
            size += com.google.protobuf.CodedOutputStream
                    .computeDoubleSize(2, fuelCellCurrent_);
        }
        if (fuelConsumptionRate_ != 0D) {
            size += com.google.protobuf.CodedOutputStream
                    .computeDoubleSize(3, fuelConsumptionRate_);
        }
        if (totalNumberOfFctp_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(4, totalNumberOfFctp_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < probeTemperatureValue_.size(); i++) {
                dataSize += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(probeTemperatureValue_.get(i));
            }
            size += dataSize;
            if (!getProbeTemperatureValueList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(dataSize);
            }
            probeTemperatureValueMemoizedSerializedSize = dataSize;
        }
        if (highestTempOfHydrogenSystem_ != 0D) {
            size += com.google.protobuf.CodedOutputStream
                    .computeDoubleSize(6, highestTempOfHydrogenSystem_);
        }
        if (highestTempProbeCodeOfHydSys_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(7, highestTempProbeCodeOfHydSys_);
        }
        if (highestConOfHydrogen_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(8, highestConOfHydrogen_);
        }
        if (highestHyConSensorCode_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(9, highestHyConSensorCode_);
        }
        if (hydrogenMaxPressure_ != 0D) {
            size += com.google.protobuf.CodedOutputStream
                    .computeDoubleSize(10, hydrogenMaxPressure_);
        }
        if (hydrogenMaxPressureSensorCode_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(11, hydrogenMaxPressureSensorCode_);
        }
        if (highVoltageDcState_ != HighVoltageDCState._1.getNumber()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(12, highVoltageDcState_);
        }
        memoizedSize = size;
        return size;
    }

    private static final long serialVersionUID = 0L;

    @Override
    public boolean equals(final Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof FuelCell)) {
            return super.equals(obj);
        }
        FuelCell other = (FuelCell) obj;

        boolean result = true;
        result = result && (
                Double.doubleToLongBits(getFuelCellVoltage())
                        == Double.doubleToLongBits(
                        other.getFuelCellVoltage()));
        result = result && (
                Double.doubleToLongBits(getFuelCellCurrent())
                        == Double.doubleToLongBits(
                        other.getFuelCellCurrent()));
        result = result && (
                Double.doubleToLongBits(getFuelConsumptionRate())
                        == Double.doubleToLongBits(
                        other.getFuelConsumptionRate()));
        result = result && (getTotalNumberOfFctp()
                == other.getTotalNumberOfFctp());
        result = result && getProbeTemperatureValueList()
                .equals(other.getProbeTemperatureValueList());
        result = result && (
                Double.doubleToLongBits(getHighestTempOfHydrogenSystem())
                        == Double.doubleToLongBits(
                        other.getHighestTempOfHydrogenSystem()));
        result = result && (getHighestTempProbeCodeOfHydSys()
                == other.getHighestTempProbeCodeOfHydSys());
        result = result && (getHighestConOfHydrogen()
                == other.getHighestConOfHydrogen());
        result = result && (getHighestHyConSensorCode()
                == other.getHighestHyConSensorCode());
        result = result && (
                Double.doubleToLongBits(getHydrogenMaxPressure())
                        == Double.doubleToLongBits(
                        other.getHydrogenMaxPressure()));
        result = result && (getHydrogenMaxPressureSensorCode()
                == other.getHydrogenMaxPressureSensorCode());
        result = result && highVoltageDcState_ == other.highVoltageDcState_;
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + FUEL_CELL_VOLTAGE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                Double.doubleToLongBits(getFuelCellVoltage()));
        hash = (37 * hash) + FUEL_CELL_CURRENT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                Double.doubleToLongBits(getFuelCellCurrent()));
        hash = (37 * hash) + FUEL_CONSUMPTION_RATE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                Double.doubleToLongBits(getFuelConsumptionRate()));
        hash = (37 * hash) + TOTAL_NUMBER_OF_FCTP_FIELD_NUMBER;
        hash = (53 * hash) + getTotalNumberOfFctp();
        if (getProbeTemperatureValueCount() > 0) {
            hash = (37 * hash) + PROBE_TEMPERATURE_VALUE_FIELD_NUMBER;
            hash = (53 * hash) + getProbeTemperatureValueList().hashCode();
        }
        hash = (37 * hash) + HIGHEST_TEMP_OF_HYDROGEN_SYSTEM_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                Double.doubleToLongBits(getHighestTempOfHydrogenSystem()));
        hash = (37 * hash) + HIGHEST_TEMP_PROBE_CODE_OF_HYD_SYS_FIELD_NUMBER;
        hash = (53 * hash) + getHighestTempProbeCodeOfHydSys();
        hash = (37 * hash) + HIGHEST_CON_OF_HYDROGEN_FIELD_NUMBER;
        hash = (53 * hash) + getHighestConOfHydrogen();
        hash = (37 * hash) + HIGHEST_HY_CON_SENSOR_CODE_FIELD_NUMBER;
        hash = (53 * hash) + getHighestHyConSensorCode();
        hash = (37 * hash) + HYDROGEN_MAX_PRESSURE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                Double.doubleToLongBits(getHydrogenMaxPressure()));
        hash = (37 * hash) + HYDROGEN_MAX_PRESSURE_SENSOR_CODE_FIELD_NUMBER;
        hash = (53 * hash) + getHydrogenMaxPressureSensorCode();
        hash = (37 * hash) + HIGH_VOLTAGE_DC_STATE_FIELD_NUMBER;
        hash = (53 * hash) + highVoltageDcState_;
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static FuelCell parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static FuelCell parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static FuelCell parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static FuelCell parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static FuelCell parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static FuelCell parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static FuelCell parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static FuelCell parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static FuelCell parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static FuelCell parseFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() {
        return newBuilder();
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.toBuilder();
    }

    public static Builder newBuilder(FuelCell prototype) {
        return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    public Builder toBuilder() {
        return this == DEFAULT_INSTANCE
                ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
            BuilderParent parent) {
        Builder builder = new Builder(parent);
        return builder;
    }

    /**
     * <pre>
     * 燃料电池数据
     * </pre>
     * <p>
     * Protobuf type {@code FuelCell}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:FuelCell)
            FuelCellOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_FuelCell_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_FuelCell_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            FuelCell.class, Builder.class);
        }

        // Construct using FuelCell.newBuilder()
        private Builder() {
            maybeForceBuilderInitialization();
        }

        private Builder(
                BuilderParent parent) {
            super(parent);
            maybeForceBuilderInitialization();
        }

        private void maybeForceBuilderInitialization() {
            if (com.google.protobuf.GeneratedMessageV3
                    .alwaysUseFieldBuilders) {
            }
        }

        public Builder clear() {
            super.clear();
            fuelCellVoltage_ = 0D;

            fuelCellCurrent_ = 0D;

            fuelConsumptionRate_ = 0D;

            totalNumberOfFctp_ = 0;

            probeTemperatureValue_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000010);
            highestTempOfHydrogenSystem_ = 0D;

            highestTempProbeCodeOfHydSys_ = 0;

            highestConOfHydrogen_ = 0;

            highestHyConSensorCode_ = 0;

            hydrogenMaxPressure_ = 0D;

            hydrogenMaxPressureSensorCode_ = 0;

            highVoltageDcState_ = 0;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_FuelCell_descriptor;
        }

        public FuelCell getDefaultInstanceForType() {
            return FuelCell.getDefaultInstance();
        }

        public FuelCell build() {
            FuelCell result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public FuelCell buildPartial() {
            FuelCell result = new FuelCell(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            result.fuelCellVoltage_ = fuelCellVoltage_;
            result.fuelCellCurrent_ = fuelCellCurrent_;
            result.fuelConsumptionRate_ = fuelConsumptionRate_;
            result.totalNumberOfFctp_ = totalNumberOfFctp_;
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                probeTemperatureValue_ = java.util.Collections.unmodifiableList(probeTemperatureValue_);
                bitField0_ = (bitField0_ & ~0x00000010);
            }
            result.probeTemperatureValue_ = probeTemperatureValue_;
            result.highestTempOfHydrogenSystem_ = highestTempOfHydrogenSystem_;
            result.highestTempProbeCodeOfHydSys_ = highestTempProbeCodeOfHydSys_;
            result.highestConOfHydrogen_ = highestConOfHydrogen_;
            result.highestHyConSensorCode_ = highestHyConSensorCode_;
            result.hydrogenMaxPressure_ = hydrogenMaxPressure_;
            result.hydrogenMaxPressureSensorCode_ = hydrogenMaxPressureSensorCode_;
            result.highVoltageDcState_ = highVoltageDcState_;
            result.bitField0_ = to_bitField0_;
            onBuilt();
            return result;
        }

        public Builder clone() {
            return (Builder) super.clone();
        }

        public Builder setField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return (Builder) super.setField(field, value);
        }

        public Builder clearField(
                com.google.protobuf.Descriptors.FieldDescriptor field) {
            return (Builder) super.clearField(field);
        }

        public Builder clearOneof(
                com.google.protobuf.Descriptors.OneofDescriptor oneof) {
            return (Builder) super.clearOneof(oneof);
        }

        public Builder setRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                int index, Object value) {
            return (Builder) super.setRepeatedField(field, index, value);
        }

        public Builder addRepeatedField(
                com.google.protobuf.Descriptors.FieldDescriptor field,
                Object value) {
            return (Builder) super.addRepeatedField(field, value);
        }

        public Builder mergeFrom(com.google.protobuf.Message other) {
            if (other instanceof FuelCell) {
                return mergeFrom((FuelCell) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(FuelCell other) {
            if (other == FuelCell.getDefaultInstance()) return this;
            if (other.getFuelCellVoltage() != 0D) {
                setFuelCellVoltage(other.getFuelCellVoltage());
            }
            if (other.getFuelCellCurrent() != 0D) {
                setFuelCellCurrent(other.getFuelCellCurrent());
            }
            if (other.getFuelConsumptionRate() != 0D) {
                setFuelConsumptionRate(other.getFuelConsumptionRate());
            }
            if (other.getTotalNumberOfFctp() != 0) {
                setTotalNumberOfFctp(other.getTotalNumberOfFctp());
            }
            if (!other.probeTemperatureValue_.isEmpty()) {
                if (probeTemperatureValue_.isEmpty()) {
                    probeTemperatureValue_ = other.probeTemperatureValue_;
                    bitField0_ = (bitField0_ & ~0x00000010);
                } else {
                    ensureProbeTemperatureValueIsMutable();
                    probeTemperatureValue_.addAll(other.probeTemperatureValue_);
                }
                onChanged();
            }
            if (other.getHighestTempOfHydrogenSystem() != 0D) {
                setHighestTempOfHydrogenSystem(other.getHighestTempOfHydrogenSystem());
            }
            if (other.getHighestTempProbeCodeOfHydSys() != 0) {
                setHighestTempProbeCodeOfHydSys(other.getHighestTempProbeCodeOfHydSys());
            }
            if (other.getHighestConOfHydrogen() != 0) {
                setHighestConOfHydrogen(other.getHighestConOfHydrogen());
            }
            if (other.getHighestHyConSensorCode() != 0) {
                setHighestHyConSensorCode(other.getHighestHyConSensorCode());
            }
            if (other.getHydrogenMaxPressure() != 0D) {
                setHydrogenMaxPressure(other.getHydrogenMaxPressure());
            }
            if (other.getHydrogenMaxPressureSensorCode() != 0) {
                setHydrogenMaxPressureSensorCode(other.getHydrogenMaxPressureSensorCode());
            }
            if (other.highVoltageDcState_ != 0) {
                setHighVoltageDcStateValue(other.getHighVoltageDcStateValue());
            }
            onChanged();
            return this;
        }

        public final boolean isInitialized() {
            return true;
        }

        public Builder mergeFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            FuelCell parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (FuelCell) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private double fuelCellVoltage_;

        /**
         * <pre>
         * 燃料电池电压
         * </pre>
         *
         * <code>optional double fuel_cell_voltage = 1;</code>
         */
        public double getFuelCellVoltage() {
            return fuelCellVoltage_;
        }

        /**
         * <pre>
         * 燃料电池电压
         * </pre>
         *
         * <code>optional double fuel_cell_voltage = 1;</code>
         */
        public Builder setFuelCellVoltage(double value) {

            fuelCellVoltage_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 燃料电池电压
         * </pre>
         *
         * <code>optional double fuel_cell_voltage = 1;</code>
         */
        public Builder clearFuelCellVoltage() {

            fuelCellVoltage_ = 0D;
            onChanged();
            return this;
        }

        private double fuelCellCurrent_;

        /**
         * <pre>
         * 燃料电池电流
         * </pre>
         *
         * <code>optional double fuel_cell_current = 2;</code>
         */
        public double getFuelCellCurrent() {
            return fuelCellCurrent_;
        }

        /**
         * <pre>
         * 燃料电池电流
         * </pre>
         *
         * <code>optional double fuel_cell_current = 2;</code>
         */
        public Builder setFuelCellCurrent(double value) {

            fuelCellCurrent_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 燃料电池电流
         * </pre>
         *
         * <code>optional double fuel_cell_current = 2;</code>
         */
        public Builder clearFuelCellCurrent() {

            fuelCellCurrent_ = 0D;
            onChanged();
            return this;
        }

        private double fuelConsumptionRate_;

        /**
         * <pre>
         * 燃料消耗率
         * </pre>
         *
         * <code>optional double fuel_consumption_rate = 3;</code>
         */
        public double getFuelConsumptionRate() {
            return fuelConsumptionRate_;
        }

        /**
         * <pre>
         * 燃料消耗率
         * </pre>
         *
         * <code>optional double fuel_consumption_rate = 3;</code>
         */
        public Builder setFuelConsumptionRate(double value) {

            fuelConsumptionRate_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 燃料消耗率
         * </pre>
         *
         * <code>optional double fuel_consumption_rate = 3;</code>
         */
        public Builder clearFuelConsumptionRate() {

            fuelConsumptionRate_ = 0D;
            onChanged();
            return this;
        }

        private int totalNumberOfFctp_;

        /**
         * <pre>
         * 燃料电池温度探针总数
         * </pre>
         *
         * <code>optional int32 total_number_of_fctp = 4;</code>
         */
        public int getTotalNumberOfFctp() {
            return totalNumberOfFctp_;
        }

        /**
         * <pre>
         * 燃料电池温度探针总数
         * </pre>
         *
         * <code>optional int32 total_number_of_fctp = 4;</code>
         */
        public Builder setTotalNumberOfFctp(int value) {

            totalNumberOfFctp_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 燃料电池温度探针总数
         * </pre>
         *
         * <code>optional int32 total_number_of_fctp = 4;</code>
         */
        public Builder clearTotalNumberOfFctp() {

            totalNumberOfFctp_ = 0;
            onChanged();
            return this;
        }

        private java.util.List<Integer> probeTemperatureValue_ = java.util.Collections.emptyList();

        private void ensureProbeTemperatureValueIsMutable() {
            if (!((bitField0_ & 0x00000010) == 0x00000010)) {
                probeTemperatureValue_ = new java.util.ArrayList<Integer>(probeTemperatureValue_);
                bitField0_ |= 0x00000010;
            }
        }

        /**
         * <pre>
         * 探针温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature_value = 5;</code>
         */
        public java.util.List<Integer>
        getProbeTemperatureValueList() {
            return java.util.Collections.unmodifiableList(probeTemperatureValue_);
        }

        /**
         * <pre>
         * 探针温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature_value = 5;</code>
         */
        public int getProbeTemperatureValueCount() {
            return probeTemperatureValue_.size();
        }

        /**
         * <pre>
         * 探针温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature_value = 5;</code>
         */
        public int getProbeTemperatureValue(int index) {
            return probeTemperatureValue_.get(index);
        }

        /**
         * <pre>
         * 探针温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature_value = 5;</code>
         */
        public Builder setProbeTemperatureValue(
                int index, int value) {
            ensureProbeTemperatureValueIsMutable();
            probeTemperatureValue_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 探针温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature_value = 5;</code>
         */
        public Builder addProbeTemperatureValue(int value) {
            ensureProbeTemperatureValueIsMutable();
            probeTemperatureValue_.add(value);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 探针温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature_value = 5;</code>
         */
        public Builder addAllProbeTemperatureValue(
                Iterable<? extends Integer> values) {
            ensureProbeTemperatureValueIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, probeTemperatureValue_);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 探针温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature_value = 5;</code>
         */
        public Builder clearProbeTemperatureValue() {
            probeTemperatureValue_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000010);
            onChanged();
            return this;
        }

        private double highestTempOfHydrogenSystem_;

        /**
         * <pre>
         * 氢系统中最高温度
         * </pre>
         *
         * <code>optional double highest_temp_of_hydrogen_system = 6;</code>
         */
        public double getHighestTempOfHydrogenSystem() {
            return highestTempOfHydrogenSystem_;
        }

        /**
         * <pre>
         * 氢系统中最高温度
         * </pre>
         *
         * <code>optional double highest_temp_of_hydrogen_system = 6;</code>
         */
        public Builder setHighestTempOfHydrogenSystem(double value) {

            highestTempOfHydrogenSystem_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 氢系统中最高温度
         * </pre>
         *
         * <code>optional double highest_temp_of_hydrogen_system = 6;</code>
         */
        public Builder clearHighestTempOfHydrogenSystem() {

            highestTempOfHydrogenSystem_ = 0D;
            onChanged();
            return this;
        }

        private int highestTempProbeCodeOfHydSys_;

        /**
         * <pre>
         * 氢系统中最高温度探针代号
         * </pre>
         *
         * <code>optional int32 highest_temp_probe_code_of_hyd_sys = 7;</code>
         */
        public int getHighestTempProbeCodeOfHydSys() {
            return highestTempProbeCodeOfHydSys_;
        }

        /**
         * <pre>
         * 氢系统中最高温度探针代号
         * </pre>
         *
         * <code>optional int32 highest_temp_probe_code_of_hyd_sys = 7;</code>
         */
        public Builder setHighestTempProbeCodeOfHydSys(int value) {

            highestTempProbeCodeOfHydSys_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 氢系统中最高温度探针代号
         * </pre>
         *
         * <code>optional int32 highest_temp_probe_code_of_hyd_sys = 7;</code>
         */
        public Builder clearHighestTempProbeCodeOfHydSys() {

            highestTempProbeCodeOfHydSys_ = 0;
            onChanged();
            return this;
        }

        private int highestConOfHydrogen_;

        /**
         * <pre>
         * 氢气最高浓度
         * </pre>
         *
         * <code>optional int32 highest_con_of_hydrogen = 8;</code>
         */
        public int getHighestConOfHydrogen() {
            return highestConOfHydrogen_;
        }

        /**
         * <pre>
         * 氢气最高浓度
         * </pre>
         *
         * <code>optional int32 highest_con_of_hydrogen = 8;</code>
         */
        public Builder setHighestConOfHydrogen(int value) {

            highestConOfHydrogen_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 氢气最高浓度
         * </pre>
         *
         * <code>optional int32 highest_con_of_hydrogen = 8;</code>
         */
        public Builder clearHighestConOfHydrogen() {

            highestConOfHydrogen_ = 0;
            onChanged();
            return this;
        }

        private int highestHyConSensorCode_;

        /**
         * <pre>
         * 氢气最高浓度传感器代号
         * </pre>
         *
         * <code>optional int32 highest_hy_con_sensor_code = 9;</code>
         */
        public int getHighestHyConSensorCode() {
            return highestHyConSensorCode_;
        }

        /**
         * <pre>
         * 氢气最高浓度传感器代号
         * </pre>
         *
         * <code>optional int32 highest_hy_con_sensor_code = 9;</code>
         */
        public Builder setHighestHyConSensorCode(int value) {

            highestHyConSensorCode_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 氢气最高浓度传感器代号
         * </pre>
         *
         * <code>optional int32 highest_hy_con_sensor_code = 9;</code>
         */
        public Builder clearHighestHyConSensorCode() {

            highestHyConSensorCode_ = 0;
            onChanged();
            return this;
        }

        private double hydrogenMaxPressure_;

        /**
         * <pre>
         * 氢气最高压力
         * </pre>
         *
         * <code>optional double hydrogen_max_pressure = 10;</code>
         */
        public double getHydrogenMaxPressure() {
            return hydrogenMaxPressure_;
        }

        /**
         * <pre>
         * 氢气最高压力
         * </pre>
         *
         * <code>optional double hydrogen_max_pressure = 10;</code>
         */
        public Builder setHydrogenMaxPressure(double value) {

            hydrogenMaxPressure_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 氢气最高压力
         * </pre>
         *
         * <code>optional double hydrogen_max_pressure = 10;</code>
         */
        public Builder clearHydrogenMaxPressure() {

            hydrogenMaxPressure_ = 0D;
            onChanged();
            return this;
        }

        private int hydrogenMaxPressureSensorCode_;

        /**
         * <pre>
         * 氢气最高压力传感器代号
         * </pre>
         *
         * <code>optional int32 hydrogen_max_pressure_sensor_code = 11;</code>
         */
        public int getHydrogenMaxPressureSensorCode() {
            return hydrogenMaxPressureSensorCode_;
        }

        /**
         * <pre>
         * 氢气最高压力传感器代号
         * </pre>
         *
         * <code>optional int32 hydrogen_max_pressure_sensor_code = 11;</code>
         */
        public Builder setHydrogenMaxPressureSensorCode(int value) {

            hydrogenMaxPressureSensorCode_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 氢气最高压力传感器代号
         * </pre>
         *
         * <code>optional int32 hydrogen_max_pressure_sensor_code = 11;</code>
         */
        public Builder clearHydrogenMaxPressureSensorCode() {

            hydrogenMaxPressureSensorCode_ = 0;
            onChanged();
            return this;
        }

        private int highVoltageDcState_ = 0;

        /**
         * <pre>
         * 高压DC/DC状态
         * </pre>
         *
         * <code>optional .FuelCell.HighVoltageDCState high_voltage_dc_state = 12;</code>
         */
        public int getHighVoltageDcStateValue() {
            return highVoltageDcState_;
        }

        /**
         * <pre>
         * 高压DC/DC状态
         * </pre>
         *
         * <code>optional .FuelCell.HighVoltageDCState high_voltage_dc_state = 12;</code>
         */
        public Builder setHighVoltageDcStateValue(int value) {
            highVoltageDcState_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 高压DC/DC状态
         * </pre>
         *
         * <code>optional .FuelCell.HighVoltageDCState high_voltage_dc_state = 12;</code>
         */
        public HighVoltageDCState getHighVoltageDcState() {
            HighVoltageDCState result = HighVoltageDCState.valueOf(highVoltageDcState_);
            return result == null ? HighVoltageDCState.UNRECOGNIZED : result;
        }

        /**
         * <pre>
         * 高压DC/DC状态
         * </pre>
         *
         * <code>optional .FuelCell.HighVoltageDCState high_voltage_dc_state = 12;</code>
         */
        public Builder setHighVoltageDcState(HighVoltageDCState value) {
            if (value == null) {
                throw new NullPointerException();
            }

            highVoltageDcState_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 高压DC/DC状态
         * </pre>
         *
         * <code>optional .FuelCell.HighVoltageDCState high_voltage_dc_state = 12;</code>
         */
        public Builder clearHighVoltageDcState() {

            highVoltageDcState_ = 0;
            onChanged();
            return this;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }


        // @@protoc_insertion_point(builder_scope:FuelCell)
    }

    // @@protoc_insertion_point(class_scope:FuelCell)
    private static final FuelCell DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new FuelCell();
    }

    public static FuelCell getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<FuelCell>
            PARSER = new com.google.protobuf.AbstractParser<FuelCell>() {
        public FuelCell parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new FuelCell(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<FuelCell> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<FuelCell> getParserForType() {
        return PARSER;
    }

    public FuelCell getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

