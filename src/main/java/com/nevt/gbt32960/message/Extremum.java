package com.nevt.gbt32960.message;

/**
 * <pre>
 * 极值数据
 * </pre>
 * <p>
 * Protobuf type {@code Extremum}
 */
public final class Extremum extends
        com.google.protobuf.GeneratedMessageV3 implements
        ExtremumOrBuilder {
    private Extremum(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Extremum() {
        voltageMaxSubsystem_ = 0;
        voltageMaxBattery_ = 0;
        maxVoltage_ = 0F;
        voltageMinSubsystem_ = 0;
        voltageMinBattery_ = 0;
        minVoltage_ = 0F;
        temperatureMaxSubsystem_ = 0;
        temperatureMaxProbe_ = 0;
        maxTemperature_ = 0;
        temperatureMinSubsystem_ = 0;
        temperatureMinProbe_ = 0;
        minTemperature_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private Extremum(
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
                    case 8: {

                        voltageMaxSubsystem_ = input.readInt32();
                        break;
                    }
                    case 16: {

                        voltageMaxBattery_ = input.readInt32();
                        break;
                    }
                    case 29: {

                        maxVoltage_ = input.readFloat();
                        break;
                    }
                    case 32: {

                        voltageMinSubsystem_ = input.readInt32();
                        break;
                    }
                    case 40: {

                        voltageMinBattery_ = input.readInt32();
                        break;
                    }
                    case 53: {

                        minVoltage_ = input.readFloat();
                        break;
                    }
                    case 56: {

                        temperatureMaxSubsystem_ = input.readInt32();
                        break;
                    }
                    case 64: {

                        temperatureMaxProbe_ = input.readInt32();
                        break;
                    }
                    case 72: {

                        maxTemperature_ = input.readInt32();
                        break;
                    }
                    case 80: {

                        temperatureMinSubsystem_ = input.readInt32();
                        break;
                    }
                    case 88: {

                        temperatureMinProbe_ = input.readInt32();
                        break;
                    }
                    case 96: {

                        minTemperature_ = input.readInt32();
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
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_Extremum_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_Extremum_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        Extremum.class, Builder.class);
    }

    public static final int VOLTAGE_MAX_SUBSYSTEM_FIELD_NUMBER = 1;
    private int voltageMaxSubsystem_;

    /**
     * <pre>
     * 最高电压电池子系统号
     * </pre>
     *
     * <code>optional int32 voltage_max_subsystem = 1;</code>
     */
    public int getVoltageMaxSubsystem() {
        return voltageMaxSubsystem_;
    }

    public static final int VOLTAGE_MAX_BATTERY_FIELD_NUMBER = 2;
    private int voltageMaxBattery_;

    /**
     * <pre>
     * 最高电压电池单体代号
     * </pre>
     *
     * <code>optional int32 voltage_max_battery = 2;</code>
     */
    public int getVoltageMaxBattery() {
        return voltageMaxBattery_;
    }

    public static final int MAX_VOLTAGE_FIELD_NUMBER = 3;
    private float maxVoltage_;

    /**
     * <pre>
     * 电池单体电压最高值
     * </pre>
     *
     * <code>optional float max_voltage = 3;</code>
     */
    public float getMaxVoltage() {
        return maxVoltage_;
    }

    public static final int VOLTAGE_MIN_SUBSYSTEM_FIELD_NUMBER = 4;
    private int voltageMinSubsystem_;

    /**
     * <pre>
     * 最低电压电池子系统号
     * </pre>
     *
     * <code>optional int32 voltage_min_subsystem = 4;</code>
     */
    public int getVoltageMinSubsystem() {
        return voltageMinSubsystem_;
    }

    public static final int VOLTAGE_MIN_BATTERY_FIELD_NUMBER = 5;
    private int voltageMinBattery_;

    /**
     * <pre>
     * 最低电压电池单体代号
     * </pre>
     *
     * <code>optional int32 voltage_min_battery = 5;</code>
     */
    public int getVoltageMinBattery() {
        return voltageMinBattery_;
    }

    public static final int MIN_VOLTAGE_FIELD_NUMBER = 6;
    private float minVoltage_;

    /**
     * <pre>
     * 电池单体电压最低值
     * </pre>
     *
     * <code>optional float min_voltage = 6;</code>
     */
    public float getMinVoltage() {
        return minVoltage_;
    }

    public static final int TEMPERATURE_MAX_SUBSYSTEM_FIELD_NUMBER = 7;
    private int temperatureMaxSubsystem_;

    /**
     * <pre>
     * 最高温度子系统号
     * </pre>
     *
     * <code>optional int32 temperature_max_subsystem = 7;</code>
     */
    public int getTemperatureMaxSubsystem() {
        return temperatureMaxSubsystem_;
    }

    public static final int TEMPERATURE_MAX_PROBE_FIELD_NUMBER = 8;
    private int temperatureMaxProbe_;

    /**
     * <pre>
     * 最高温度探针序号
     * </pre>
     *
     * <code>optional int32 temperature_max_probe = 8;</code>
     */
    public int getTemperatureMaxProbe() {
        return temperatureMaxProbe_;
    }

    public static final int MAX_TEMPERATURE_FIELD_NUMBER = 9;
    private int maxTemperature_;

    /**
     * <pre>
     * 最高温度值
     * </pre>
     *
     * <code>optional int32 max_temperature = 9;</code>
     */
    public int getMaxTemperature() {
        return maxTemperature_;
    }

    public static final int TEMPERATURE_MIN_SUBSYSTEM_FIELD_NUMBER = 10;
    private int temperatureMinSubsystem_;

    /**
     * <pre>
     * 最低温度子系统号
     * </pre>
     *
     * <code>optional int32 temperature_min_subsystem = 10;</code>
     */
    public int getTemperatureMinSubsystem() {
        return temperatureMinSubsystem_;
    }

    public static final int TEMPERATURE_MIN_PROBE_FIELD_NUMBER = 11;
    private int temperatureMinProbe_;

    /**
     * <pre>
     * 最低温度探针序号
     * </pre>
     *
     * <code>optional int32 temperature_min_probe = 11;</code>
     */
    public int getTemperatureMinProbe() {
        return temperatureMinProbe_;
    }

    public static final int MIN_TEMPERATURE_FIELD_NUMBER = 12;
    private int minTemperature_;

    /**
     * <pre>
     * 最低温度值
     * </pre>
     *
     * <code>optional int32 min_temperature = 12;</code>
     */
    public int getMinTemperature() {
        return minTemperature_;
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
        if (voltageMaxSubsystem_ != 0) {
            output.writeInt32(1, voltageMaxSubsystem_);
        }
        if (voltageMaxBattery_ != 0) {
            output.writeInt32(2, voltageMaxBattery_);
        }
        if (maxVoltage_ != 0F) {
            output.writeFloat(3, maxVoltage_);
        }
        if (voltageMinSubsystem_ != 0) {
            output.writeInt32(4, voltageMinSubsystem_);
        }
        if (voltageMinBattery_ != 0) {
            output.writeInt32(5, voltageMinBattery_);
        }
        if (minVoltage_ != 0F) {
            output.writeFloat(6, minVoltage_);
        }
        if (temperatureMaxSubsystem_ != 0) {
            output.writeInt32(7, temperatureMaxSubsystem_);
        }
        if (temperatureMaxProbe_ != 0) {
            output.writeInt32(8, temperatureMaxProbe_);
        }
        if (maxTemperature_ != 0) {
            output.writeInt32(9, maxTemperature_);
        }
        if (temperatureMinSubsystem_ != 0) {
            output.writeInt32(10, temperatureMinSubsystem_);
        }
        if (temperatureMinProbe_ != 0) {
            output.writeInt32(11, temperatureMinProbe_);
        }
        if (minTemperature_ != 0) {
            output.writeInt32(12, minTemperature_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (voltageMaxSubsystem_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(1, voltageMaxSubsystem_);
        }
        if (voltageMaxBattery_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(2, voltageMaxBattery_);
        }
        if (maxVoltage_ != 0F) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(3, maxVoltage_);
        }
        if (voltageMinSubsystem_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(4, voltageMinSubsystem_);
        }
        if (voltageMinBattery_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(5, voltageMinBattery_);
        }
        if (minVoltage_ != 0F) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(6, minVoltage_);
        }
        if (temperatureMaxSubsystem_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(7, temperatureMaxSubsystem_);
        }
        if (temperatureMaxProbe_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(8, temperatureMaxProbe_);
        }
        if (maxTemperature_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(9, maxTemperature_);
        }
        if (temperatureMinSubsystem_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(10, temperatureMinSubsystem_);
        }
        if (temperatureMinProbe_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(11, temperatureMinProbe_);
        }
        if (minTemperature_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(12, minTemperature_);
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
        if (!(obj instanceof Extremum)) {
            return super.equals(obj);
        }
        Extremum other = (Extremum) obj;

        boolean result = true;
        result = result && (getVoltageMaxSubsystem()
                == other.getVoltageMaxSubsystem());
        result = result && (getVoltageMaxBattery()
                == other.getVoltageMaxBattery());
        result = result && (
                Float.floatToIntBits(getMaxVoltage())
                        == Float.floatToIntBits(
                        other.getMaxVoltage()));
        result = result && (getVoltageMinSubsystem()
                == other.getVoltageMinSubsystem());
        result = result && (getVoltageMinBattery()
                == other.getVoltageMinBattery());
        result = result && (
                Float.floatToIntBits(getMinVoltage())
                        == Float.floatToIntBits(
                        other.getMinVoltage()));
        result = result && (getTemperatureMaxSubsystem()
                == other.getTemperatureMaxSubsystem());
        result = result && (getTemperatureMaxProbe()
                == other.getTemperatureMaxProbe());
        result = result && (getMaxTemperature()
                == other.getMaxTemperature());
        result = result && (getTemperatureMinSubsystem()
                == other.getTemperatureMinSubsystem());
        result = result && (getTemperatureMinProbe()
                == other.getTemperatureMinProbe());
        result = result && (getMinTemperature()
                == other.getMinTemperature());
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + VOLTAGE_MAX_SUBSYSTEM_FIELD_NUMBER;
        hash = (53 * hash) + getVoltageMaxSubsystem();
        hash = (37 * hash) + VOLTAGE_MAX_BATTERY_FIELD_NUMBER;
        hash = (53 * hash) + getVoltageMaxBattery();
        hash = (37 * hash) + MAX_VOLTAGE_FIELD_NUMBER;
        hash = (53 * hash) + Float.floatToIntBits(
                getMaxVoltage());
        hash = (37 * hash) + VOLTAGE_MIN_SUBSYSTEM_FIELD_NUMBER;
        hash = (53 * hash) + getVoltageMinSubsystem();
        hash = (37 * hash) + VOLTAGE_MIN_BATTERY_FIELD_NUMBER;
        hash = (53 * hash) + getVoltageMinBattery();
        hash = (37 * hash) + MIN_VOLTAGE_FIELD_NUMBER;
        hash = (53 * hash) + Float.floatToIntBits(
                getMinVoltage());
        hash = (37 * hash) + TEMPERATURE_MAX_SUBSYSTEM_FIELD_NUMBER;
        hash = (53 * hash) + getTemperatureMaxSubsystem();
        hash = (37 * hash) + TEMPERATURE_MAX_PROBE_FIELD_NUMBER;
        hash = (53 * hash) + getTemperatureMaxProbe();
        hash = (37 * hash) + MAX_TEMPERATURE_FIELD_NUMBER;
        hash = (53 * hash) + getMaxTemperature();
        hash = (37 * hash) + TEMPERATURE_MIN_SUBSYSTEM_FIELD_NUMBER;
        hash = (53 * hash) + getTemperatureMinSubsystem();
        hash = (37 * hash) + TEMPERATURE_MIN_PROBE_FIELD_NUMBER;
        hash = (53 * hash) + getTemperatureMinProbe();
        hash = (37 * hash) + MIN_TEMPERATURE_FIELD_NUMBER;
        hash = (53 * hash) + getMinTemperature();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static Extremum parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Extremum parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Extremum parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Extremum parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Extremum parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Extremum parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Extremum parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static Extremum parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static Extremum parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Extremum parseFrom(
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

    public static Builder newBuilder(Extremum prototype) {
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
     * 极值数据
     * </pre>
     * <p>
     * Protobuf type {@code Extremum}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:Extremum)
            ExtremumOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Extremum_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Extremum_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Extremum.class, Builder.class);
        }

        // Construct using Extremum.newBuilder()
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
            voltageMaxSubsystem_ = 0;

            voltageMaxBattery_ = 0;

            maxVoltage_ = 0F;

            voltageMinSubsystem_ = 0;

            voltageMinBattery_ = 0;

            minVoltage_ = 0F;

            temperatureMaxSubsystem_ = 0;

            temperatureMaxProbe_ = 0;

            maxTemperature_ = 0;

            temperatureMinSubsystem_ = 0;

            temperatureMinProbe_ = 0;

            minTemperature_ = 0;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Extremum_descriptor;
        }

        public Extremum getDefaultInstanceForType() {
            return Extremum.getDefaultInstance();
        }

        public Extremum build() {
            Extremum result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public Extremum buildPartial() {
            Extremum result = new Extremum(this);
            result.voltageMaxSubsystem_ = voltageMaxSubsystem_;
            result.voltageMaxBattery_ = voltageMaxBattery_;
            result.maxVoltage_ = maxVoltage_;
            result.voltageMinSubsystem_ = voltageMinSubsystem_;
            result.voltageMinBattery_ = voltageMinBattery_;
            result.minVoltage_ = minVoltage_;
            result.temperatureMaxSubsystem_ = temperatureMaxSubsystem_;
            result.temperatureMaxProbe_ = temperatureMaxProbe_;
            result.maxTemperature_ = maxTemperature_;
            result.temperatureMinSubsystem_ = temperatureMinSubsystem_;
            result.temperatureMinProbe_ = temperatureMinProbe_;
            result.minTemperature_ = minTemperature_;
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
            if (other instanceof Extremum) {
                return mergeFrom((Extremum) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(Extremum other) {
            if (other == Extremum.getDefaultInstance()) return this;
            if (other.getVoltageMaxSubsystem() != 0) {
                setVoltageMaxSubsystem(other.getVoltageMaxSubsystem());
            }
            if (other.getVoltageMaxBattery() != 0) {
                setVoltageMaxBattery(other.getVoltageMaxBattery());
            }
            if (other.getMaxVoltage() != 0F) {
                setMaxVoltage(other.getMaxVoltage());
            }
            if (other.getVoltageMinSubsystem() != 0) {
                setVoltageMinSubsystem(other.getVoltageMinSubsystem());
            }
            if (other.getVoltageMinBattery() != 0) {
                setVoltageMinBattery(other.getVoltageMinBattery());
            }
            if (other.getMinVoltage() != 0F) {
                setMinVoltage(other.getMinVoltage());
            }
            if (other.getTemperatureMaxSubsystem() != 0) {
                setTemperatureMaxSubsystem(other.getTemperatureMaxSubsystem());
            }
            if (other.getTemperatureMaxProbe() != 0) {
                setTemperatureMaxProbe(other.getTemperatureMaxProbe());
            }
            if (other.getMaxTemperature() != 0) {
                setMaxTemperature(other.getMaxTemperature());
            }
            if (other.getTemperatureMinSubsystem() != 0) {
                setTemperatureMinSubsystem(other.getTemperatureMinSubsystem());
            }
            if (other.getTemperatureMinProbe() != 0) {
                setTemperatureMinProbe(other.getTemperatureMinProbe());
            }
            if (other.getMinTemperature() != 0) {
                setMinTemperature(other.getMinTemperature());
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
            Extremum parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Extremum) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int voltageMaxSubsystem_;

        /**
         * <pre>
         * 最高电压电池子系统号
         * </pre>
         *
         * <code>optional int32 voltage_max_subsystem = 1;</code>
         */
        public int getVoltageMaxSubsystem() {
            return voltageMaxSubsystem_;
        }

        /**
         * <pre>
         * 最高电压电池子系统号
         * </pre>
         *
         * <code>optional int32 voltage_max_subsystem = 1;</code>
         */
        public Builder setVoltageMaxSubsystem(int value) {

            voltageMaxSubsystem_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 最高电压电池子系统号
         * </pre>
         *
         * <code>optional int32 voltage_max_subsystem = 1;</code>
         */
        public Builder clearVoltageMaxSubsystem() {

            voltageMaxSubsystem_ = 0;
            onChanged();
            return this;
        }

        private int voltageMaxBattery_;

        /**
         * <pre>
         * 最高电压电池单体代号
         * </pre>
         *
         * <code>optional int32 voltage_max_battery = 2;</code>
         */
        public int getVoltageMaxBattery() {
            return voltageMaxBattery_;
        }

        /**
         * <pre>
         * 最高电压电池单体代号
         * </pre>
         *
         * <code>optional int32 voltage_max_battery = 2;</code>
         */
        public Builder setVoltageMaxBattery(int value) {

            voltageMaxBattery_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 最高电压电池单体代号
         * </pre>
         *
         * <code>optional int32 voltage_max_battery = 2;</code>
         */
        public Builder clearVoltageMaxBattery() {

            voltageMaxBattery_ = 0;
            onChanged();
            return this;
        }

        private float maxVoltage_;

        /**
         * <pre>
         * 电池单体电压最高值
         * </pre>
         *
         * <code>optional float max_voltage = 3;</code>
         */
        public float getMaxVoltage() {
            return maxVoltage_;
        }

        /**
         * <pre>
         * 电池单体电压最高值
         * </pre>
         *
         * <code>optional float max_voltage = 3;</code>
         */
        public Builder setMaxVoltage(float value) {

            maxVoltage_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 电池单体电压最高值
         * </pre>
         *
         * <code>optional float max_voltage = 3;</code>
         */
        public Builder clearMaxVoltage() {

            maxVoltage_ = 0F;
            onChanged();
            return this;
        }

        private int voltageMinSubsystem_;

        /**
         * <pre>
         * 最低电压电池子系统号
         * </pre>
         *
         * <code>optional int32 voltage_min_subsystem = 4;</code>
         */
        public int getVoltageMinSubsystem() {
            return voltageMinSubsystem_;
        }

        /**
         * <pre>
         * 最低电压电池子系统号
         * </pre>
         *
         * <code>optional int32 voltage_min_subsystem = 4;</code>
         */
        public Builder setVoltageMinSubsystem(int value) {

            voltageMinSubsystem_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 最低电压电池子系统号
         * </pre>
         *
         * <code>optional int32 voltage_min_subsystem = 4;</code>
         */
        public Builder clearVoltageMinSubsystem() {

            voltageMinSubsystem_ = 0;
            onChanged();
            return this;
        }

        private int voltageMinBattery_;

        /**
         * <pre>
         * 最低电压电池单体代号
         * </pre>
         *
         * <code>optional int32 voltage_min_battery = 5;</code>
         */
        public int getVoltageMinBattery() {
            return voltageMinBattery_;
        }

        /**
         * <pre>
         * 最低电压电池单体代号
         * </pre>
         *
         * <code>optional int32 voltage_min_battery = 5;</code>
         */
        public Builder setVoltageMinBattery(int value) {

            voltageMinBattery_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 最低电压电池单体代号
         * </pre>
         *
         * <code>optional int32 voltage_min_battery = 5;</code>
         */
        public Builder clearVoltageMinBattery() {

            voltageMinBattery_ = 0;
            onChanged();
            return this;
        }

        private float minVoltage_;

        /**
         * <pre>
         * 电池单体电压最低值
         * </pre>
         *
         * <code>optional float min_voltage = 6;</code>
         */
        public float getMinVoltage() {
            return minVoltage_;
        }

        /**
         * <pre>
         * 电池单体电压最低值
         * </pre>
         *
         * <code>optional float min_voltage = 6;</code>
         */
        public Builder setMinVoltage(float value) {

            minVoltage_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 电池单体电压最低值
         * </pre>
         *
         * <code>optional float min_voltage = 6;</code>
         */
        public Builder clearMinVoltage() {

            minVoltage_ = 0F;
            onChanged();
            return this;
        }

        private int temperatureMaxSubsystem_;

        /**
         * <pre>
         * 最高温度子系统号
         * </pre>
         *
         * <code>optional int32 temperature_max_subsystem = 7;</code>
         */
        public int getTemperatureMaxSubsystem() {
            return temperatureMaxSubsystem_;
        }

        /**
         * <pre>
         * 最高温度子系统号
         * </pre>
         *
         * <code>optional int32 temperature_max_subsystem = 7;</code>
         */
        public Builder setTemperatureMaxSubsystem(int value) {

            temperatureMaxSubsystem_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 最高温度子系统号
         * </pre>
         *
         * <code>optional int32 temperature_max_subsystem = 7;</code>
         */
        public Builder clearTemperatureMaxSubsystem() {

            temperatureMaxSubsystem_ = 0;
            onChanged();
            return this;
        }

        private int temperatureMaxProbe_;

        /**
         * <pre>
         * 最高温度探针序号
         * </pre>
         *
         * <code>optional int32 temperature_max_probe = 8;</code>
         */
        public int getTemperatureMaxProbe() {
            return temperatureMaxProbe_;
        }

        /**
         * <pre>
         * 最高温度探针序号
         * </pre>
         *
         * <code>optional int32 temperature_max_probe = 8;</code>
         */
        public Builder setTemperatureMaxProbe(int value) {

            temperatureMaxProbe_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 最高温度探针序号
         * </pre>
         *
         * <code>optional int32 temperature_max_probe = 8;</code>
         */
        public Builder clearTemperatureMaxProbe() {

            temperatureMaxProbe_ = 0;
            onChanged();
            return this;
        }

        private int maxTemperature_;

        /**
         * <pre>
         * 最高温度值
         * </pre>
         *
         * <code>optional int32 max_temperature = 9;</code>
         */
        public int getMaxTemperature() {
            return maxTemperature_;
        }

        /**
         * <pre>
         * 最高温度值
         * </pre>
         *
         * <code>optional int32 max_temperature = 9;</code>
         */
        public Builder setMaxTemperature(int value) {

            maxTemperature_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 最高温度值
         * </pre>
         *
         * <code>optional int32 max_temperature = 9;</code>
         */
        public Builder clearMaxTemperature() {

            maxTemperature_ = 0;
            onChanged();
            return this;
        }

        private int temperatureMinSubsystem_;

        /**
         * <pre>
         * 最低温度子系统号
         * </pre>
         *
         * <code>optional int32 temperature_min_subsystem = 10;</code>
         */
        public int getTemperatureMinSubsystem() {
            return temperatureMinSubsystem_;
        }

        /**
         * <pre>
         * 最低温度子系统号
         * </pre>
         *
         * <code>optional int32 temperature_min_subsystem = 10;</code>
         */
        public Builder setTemperatureMinSubsystem(int value) {

            temperatureMinSubsystem_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 最低温度子系统号
         * </pre>
         *
         * <code>optional int32 temperature_min_subsystem = 10;</code>
         */
        public Builder clearTemperatureMinSubsystem() {

            temperatureMinSubsystem_ = 0;
            onChanged();
            return this;
        }

        private int temperatureMinProbe_;

        /**
         * <pre>
         * 最低温度探针序号
         * </pre>
         *
         * <code>optional int32 temperature_min_probe = 11;</code>
         */
        public int getTemperatureMinProbe() {
            return temperatureMinProbe_;
        }

        /**
         * <pre>
         * 最低温度探针序号
         * </pre>
         *
         * <code>optional int32 temperature_min_probe = 11;</code>
         */
        public Builder setTemperatureMinProbe(int value) {

            temperatureMinProbe_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 最低温度探针序号
         * </pre>
         *
         * <code>optional int32 temperature_min_probe = 11;</code>
         */
        public Builder clearTemperatureMinProbe() {

            temperatureMinProbe_ = 0;
            onChanged();
            return this;
        }

        private int minTemperature_;

        /**
         * <pre>
         * 最低温度值
         * </pre>
         *
         * <code>optional int32 min_temperature = 12;</code>
         */
        public int getMinTemperature() {
            return minTemperature_;
        }

        /**
         * <pre>
         * 最低温度值
         * </pre>
         *
         * <code>optional int32 min_temperature = 12;</code>
         */
        public Builder setMinTemperature(int value) {

            minTemperature_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 最低温度值
         * </pre>
         *
         * <code>optional int32 min_temperature = 12;</code>
         */
        public Builder clearMinTemperature() {

            minTemperature_ = 0;
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


        // @@protoc_insertion_point(builder_scope:Extremum)
    }

    // @@protoc_insertion_point(class_scope:Extremum)
    private static final Extremum DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new Extremum();
    }

    public static Extremum getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Extremum>
            PARSER = new com.google.protobuf.AbstractParser<Extremum>() {
        public Extremum parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Extremum(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<Extremum> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Extremum> getParserForType() {
        return PARSER;
    }

    public Extremum getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

