package com.nevt.gbt32960.message;

/**
 * <pre>
 * 可充电储能子系统
 * </pre>
 * <p>
 * Protobuf type {@code ChargeableSubsystemElectric}
 */
public final class ChargeableSubsystemElectric extends
        com.google.protobuf.GeneratedMessageV3 implements
        ChargeableSubsystemElectricOrBuilder {
    private ChargeableSubsystemElectric(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ChargeableSubsystemElectric() {
        chargeableSubSystemNumber_ = 0;
        voltage_ = 0F;
        current_ = 0F;
        batteryTotalCount_ = 0L;
        frameStartBatterySeq_ = 0L;
        batteryVoltage_ = java.util.Collections.emptyList();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private ChargeableSubsystemElectric(
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

                        chargeableSubSystemNumber_ = input.readInt32();
                        break;
                    }
                    case 21: {

                        voltage_ = input.readFloat();
                        break;
                    }
                    case 29: {

                        current_ = input.readFloat();
                        break;
                    }
                    case 32: {

                        batteryTotalCount_ = input.readInt64();
                        break;
                    }
                    case 40: {

                        frameStartBatterySeq_ = input.readInt64();
                        break;
                    }
                    case 61: {
                        if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                            batteryVoltage_ = new java.util.ArrayList<Float>();
                            mutable_bitField0_ |= 0x00000020;
                        }
                        batteryVoltage_.add(input.readFloat());
                        break;
                    }
                    case 58: {
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if (!((mutable_bitField0_ & 0x00000020) == 0x00000020) && input.getBytesUntilLimit() > 0) {
                            batteryVoltage_ = new java.util.ArrayList<Float>();
                            mutable_bitField0_ |= 0x00000020;
                        }
                        while (input.getBytesUntilLimit() > 0) {
                            batteryVoltage_.add(input.readFloat());
                        }
                        input.popLimit(limit);
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
            if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                batteryVoltage_ = java.util.Collections.unmodifiableList(batteryVoltage_);
            }
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_ChargeableSubsystemElectric_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_ChargeableSubsystemElectric_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        ChargeableSubsystemElectric.class, Builder.class);
    }

    private int bitField0_;
    public static final int CHARGEABLE_SUB_SYSTEM_NUMBER_FIELD_NUMBER = 1;
    private int chargeableSubSystemNumber_;

    /**
     * <pre>
     * 可充电储能子系统号
     * </pre>
     *
     * <code>optional int32 chargeable_sub_system_number = 1;</code>
     */
    public int getChargeableSubSystemNumber() {
        return chargeableSubSystemNumber_;
    }

    public static final int VOLTAGE_FIELD_NUMBER = 2;
    private float voltage_;

    /**
     * <pre>
     * 可充电储能装置电压
     * </pre>
     *
     * <code>optional float voltage = 2;</code>
     */
    public float getVoltage() {
        return voltage_;
    }

    public static final int CURRENT_FIELD_NUMBER = 3;
    private float current_;

    /**
     * <pre>
     * 可充电储能装置电流
     * </pre>
     *
     * <code>optional float current = 3;</code>
     */
    public float getCurrent() {
        return current_;
    }

    public static final int BATTERY_TOTAL_COUNT_FIELD_NUMBER = 4;
    private long batteryTotalCount_;

    /**
     * <pre>
     * 单体电池总数
     * </pre>
     *
     * <code>optional int64 battery_total_count = 4;</code>
     */
    public long getBatteryTotalCount() {
        return batteryTotalCount_;
    }

    public static final int FRAME_START_BATTERY_SEQ_FIELD_NUMBER = 5;
    private long frameStartBatterySeq_;

    /**
     * <pre>
     * 本帧起始电池序号
     * </pre>
     *
     * <code>optional int64 frame_start_battery_seq = 5;</code>
     */
    public long getFrameStartBatterySeq() {
        return frameStartBatterySeq_;
    }

    public static final int BATTERY_VOLTAGE_FIELD_NUMBER = 7;
    private java.util.List<Float> batteryVoltage_;

    /**
     * <pre>
     * 单体电池电压值
     * </pre>
     *
     * <code>repeated float battery_voltage = 7;</code>
     */
    public java.util.List<Float>
    getBatteryVoltageList() {
        return batteryVoltage_;
    }

    /**
     * <pre>
     * 单体电池电压值
     * </pre>
     *
     * <code>repeated float battery_voltage = 7;</code>
     */
    public int getBatteryVoltageCount() {
        return batteryVoltage_.size();
    }

    /**
     * <pre>
     * 单体电池电压值
     * </pre>
     *
     * <code>repeated float battery_voltage = 7;</code>
     */
    public float getBatteryVoltage(int index) {
        return batteryVoltage_.get(index);
    }

    private int batteryVoltageMemoizedSerializedSize = -1;

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
        if (chargeableSubSystemNumber_ != 0) {
            output.writeInt32(1, chargeableSubSystemNumber_);
        }
        if (voltage_ != 0F) {
            output.writeFloat(2, voltage_);
        }
        if (current_ != 0F) {
            output.writeFloat(3, current_);
        }
        if (batteryTotalCount_ != 0L) {
            output.writeInt64(4, batteryTotalCount_);
        }
        if (frameStartBatterySeq_ != 0L) {
            output.writeInt64(5, frameStartBatterySeq_);
        }
        if (getBatteryVoltageList().size() > 0) {
            output.writeUInt32NoTag(58);
            output.writeUInt32NoTag(batteryVoltageMemoizedSerializedSize);
        }
        for (int i = 0; i < batteryVoltage_.size(); i++) {
            output.writeFloatNoTag(batteryVoltage_.get(i));
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (chargeableSubSystemNumber_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(1, chargeableSubSystemNumber_);
        }
        if (voltage_ != 0F) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(2, voltage_);
        }
        if (current_ != 0F) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(3, current_);
        }
        if (batteryTotalCount_ != 0L) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(4, batteryTotalCount_);
        }
        if (frameStartBatterySeq_ != 0L) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(5, frameStartBatterySeq_);
        }
        {
            int dataSize = 0;
            dataSize = 4 * getBatteryVoltageList().size();
            size += dataSize;
            if (!getBatteryVoltageList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(dataSize);
            }
            batteryVoltageMemoizedSerializedSize = dataSize;
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
        if (!(obj instanceof ChargeableSubsystemElectric)) {
            return super.equals(obj);
        }
        ChargeableSubsystemElectric other = (ChargeableSubsystemElectric) obj;

        boolean result = true;
        result = result && (getChargeableSubSystemNumber()
                == other.getChargeableSubSystemNumber());
        result = result && (
                Float.floatToIntBits(getVoltage())
                        == Float.floatToIntBits(
                        other.getVoltage()));
        result = result && (
                Float.floatToIntBits(getCurrent())
                        == Float.floatToIntBits(
                        other.getCurrent()));
        result = result && (getBatteryTotalCount()
                == other.getBatteryTotalCount());
        result = result && (getFrameStartBatterySeq()
                == other.getFrameStartBatterySeq());
        result = result && getBatteryVoltageList()
                .equals(other.getBatteryVoltageList());
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + CHARGEABLE_SUB_SYSTEM_NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + getChargeableSubSystemNumber();
        hash = (37 * hash) + VOLTAGE_FIELD_NUMBER;
        hash = (53 * hash) + Float.floatToIntBits(
                getVoltage());
        hash = (37 * hash) + CURRENT_FIELD_NUMBER;
        hash = (53 * hash) + Float.floatToIntBits(
                getCurrent());
        hash = (37 * hash) + BATTERY_TOTAL_COUNT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getBatteryTotalCount());
        hash = (37 * hash) + FRAME_START_BATTERY_SEQ_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getFrameStartBatterySeq());
        if (getBatteryVoltageCount() > 0) {
            hash = (37 * hash) + BATTERY_VOLTAGE_FIELD_NUMBER;
            hash = (53 * hash) + getBatteryVoltageList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static ChargeableSubsystemElectric parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ChargeableSubsystemElectric parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ChargeableSubsystemElectric parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ChargeableSubsystemElectric parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ChargeableSubsystemElectric parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static ChargeableSubsystemElectric parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ChargeableSubsystemElectric parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static ChargeableSubsystemElectric parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static ChargeableSubsystemElectric parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static ChargeableSubsystemElectric parseFrom(
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

    public static Builder newBuilder(ChargeableSubsystemElectric prototype) {
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
     * 可充电储能子系统
     * </pre>
     * <p>
     * Protobuf type {@code ChargeableSubsystemElectric}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:ChargeableSubsystemElectric)
            ChargeableSubsystemElectricOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ChargeableSubsystemElectric_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ChargeableSubsystemElectric_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ChargeableSubsystemElectric.class, Builder.class);
        }

        // Construct using ChargeableSubsystemElectric.newBuilder()
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
            chargeableSubSystemNumber_ = 0;

            voltage_ = 0F;

            current_ = 0F;

            batteryTotalCount_ = 0L;

            frameStartBatterySeq_ = 0L;

            batteryVoltage_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000020);
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ChargeableSubsystemElectric_descriptor;
        }

        public ChargeableSubsystemElectric getDefaultInstanceForType() {
            return ChargeableSubsystemElectric.getDefaultInstance();
        }

        public ChargeableSubsystemElectric build() {
            ChargeableSubsystemElectric result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public ChargeableSubsystemElectric buildPartial() {
            ChargeableSubsystemElectric result = new ChargeableSubsystemElectric(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            result.chargeableSubSystemNumber_ = chargeableSubSystemNumber_;
            result.voltage_ = voltage_;
            result.current_ = current_;
            result.batteryTotalCount_ = batteryTotalCount_;
            result.frameStartBatterySeq_ = frameStartBatterySeq_;
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                batteryVoltage_ = java.util.Collections.unmodifiableList(batteryVoltage_);
                bitField0_ = (bitField0_ & ~0x00000020);
            }
            result.batteryVoltage_ = batteryVoltage_;
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
            if (other instanceof ChargeableSubsystemElectric) {
                return mergeFrom((ChargeableSubsystemElectric) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(ChargeableSubsystemElectric other) {
            if (other == ChargeableSubsystemElectric.getDefaultInstance()) return this;
            if (other.getChargeableSubSystemNumber() != 0) {
                setChargeableSubSystemNumber(other.getChargeableSubSystemNumber());
            }
            if (other.getVoltage() != 0F) {
                setVoltage(other.getVoltage());
            }
            if (other.getCurrent() != 0F) {
                setCurrent(other.getCurrent());
            }
            if (other.getBatteryTotalCount() != 0L) {
                setBatteryTotalCount(other.getBatteryTotalCount());
            }
            if (other.getFrameStartBatterySeq() != 0L) {
                setFrameStartBatterySeq(other.getFrameStartBatterySeq());
            }
            if (!other.batteryVoltage_.isEmpty()) {
                if (batteryVoltage_.isEmpty()) {
                    batteryVoltage_ = other.batteryVoltage_;
                    bitField0_ = (bitField0_ & ~0x00000020);
                } else {
                    ensureBatteryVoltageIsMutable();
                    batteryVoltage_.addAll(other.batteryVoltage_);
                }
                onChanged();
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
            ChargeableSubsystemElectric parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (ChargeableSubsystemElectric) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private int chargeableSubSystemNumber_;

        /**
         * <pre>
         * 可充电储能子系统号
         * </pre>
         *
         * <code>optional int32 chargeable_sub_system_number = 1;</code>
         */
        public int getChargeableSubSystemNumber() {
            return chargeableSubSystemNumber_;
        }

        /**
         * <pre>
         * 可充电储能子系统号
         * </pre>
         *
         * <code>optional int32 chargeable_sub_system_number = 1;</code>
         */
        public Builder setChargeableSubSystemNumber(int value) {

            chargeableSubSystemNumber_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 可充电储能子系统号
         * </pre>
         *
         * <code>optional int32 chargeable_sub_system_number = 1;</code>
         */
        public Builder clearChargeableSubSystemNumber() {

            chargeableSubSystemNumber_ = 0;
            onChanged();
            return this;
        }

        private float voltage_;

        /**
         * <pre>
         * 可充电储能装置电压
         * </pre>
         *
         * <code>optional float voltage = 2;</code>
         */
        public float getVoltage() {
            return voltage_;
        }

        /**
         * <pre>
         * 可充电储能装置电压
         * </pre>
         *
         * <code>optional float voltage = 2;</code>
         */
        public Builder setVoltage(float value) {

            voltage_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 可充电储能装置电压
         * </pre>
         *
         * <code>optional float voltage = 2;</code>
         */
        public Builder clearVoltage() {

            voltage_ = 0F;
            onChanged();
            return this;
        }

        private float current_;

        /**
         * <pre>
         * 可充电储能装置电流
         * </pre>
         *
         * <code>optional float current = 3;</code>
         */
        public float getCurrent() {
            return current_;
        }

        /**
         * <pre>
         * 可充电储能装置电流
         * </pre>
         *
         * <code>optional float current = 3;</code>
         */
        public Builder setCurrent(float value) {

            current_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 可充电储能装置电流
         * </pre>
         *
         * <code>optional float current = 3;</code>
         */
        public Builder clearCurrent() {

            current_ = 0F;
            onChanged();
            return this;
        }

        private long batteryTotalCount_;

        /**
         * <pre>
         * 单体电池总数
         * </pre>
         *
         * <code>optional int64 battery_total_count = 4;</code>
         */
        public long getBatteryTotalCount() {
            return batteryTotalCount_;
        }

        /**
         * <pre>
         * 单体电池总数
         * </pre>
         *
         * <code>optional int64 battery_total_count = 4;</code>
         */
        public Builder setBatteryTotalCount(long value) {

            batteryTotalCount_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 单体电池总数
         * </pre>
         *
         * <code>optional int64 battery_total_count = 4;</code>
         */
        public Builder clearBatteryTotalCount() {

            batteryTotalCount_ = 0L;
            onChanged();
            return this;
        }

        private long frameStartBatterySeq_;

        /**
         * <pre>
         * 本帧起始电池序号
         * </pre>
         *
         * <code>optional int64 frame_start_battery_seq = 5;</code>
         */
        public long getFrameStartBatterySeq() {
            return frameStartBatterySeq_;
        }

        /**
         * <pre>
         * 本帧起始电池序号
         * </pre>
         *
         * <code>optional int64 frame_start_battery_seq = 5;</code>
         */
        public Builder setFrameStartBatterySeq(long value) {

            frameStartBatterySeq_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 本帧起始电池序号
         * </pre>
         *
         * <code>optional int64 frame_start_battery_seq = 5;</code>
         */
        public Builder clearFrameStartBatterySeq() {

            frameStartBatterySeq_ = 0L;
            onChanged();
            return this;
        }

        private java.util.List<Float> batteryVoltage_ = java.util.Collections.emptyList();

        private void ensureBatteryVoltageIsMutable() {
            if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                batteryVoltage_ = new java.util.ArrayList<Float>(batteryVoltage_);
                bitField0_ |= 0x00000020;
            }
        }

        /**
         * <pre>
         * 单体电池电压值
         * </pre>
         *
         * <code>repeated float battery_voltage = 7;</code>
         */
        public java.util.List<Float>
        getBatteryVoltageList() {
            return java.util.Collections.unmodifiableList(batteryVoltage_);
        }

        /**
         * <pre>
         * 单体电池电压值
         * </pre>
         *
         * <code>repeated float battery_voltage = 7;</code>
         */
        public int getBatteryVoltageCount() {
            return batteryVoltage_.size();
        }

        /**
         * <pre>
         * 单体电池电压值
         * </pre>
         *
         * <code>repeated float battery_voltage = 7;</code>
         */
        public float getBatteryVoltage(int index) {
            return batteryVoltage_.get(index);
        }

        /**
         * <pre>
         * 单体电池电压值
         * </pre>
         *
         * <code>repeated float battery_voltage = 7;</code>
         */
        public Builder setBatteryVoltage(
                int index, float value) {
            ensureBatteryVoltageIsMutable();
            batteryVoltage_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 单体电池电压值
         * </pre>
         *
         * <code>repeated float battery_voltage = 7;</code>
         */
        public Builder addBatteryVoltage(float value) {
            ensureBatteryVoltageIsMutable();
            batteryVoltage_.add(value);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 单体电池电压值
         * </pre>
         *
         * <code>repeated float battery_voltage = 7;</code>
         */
        public Builder addAllBatteryVoltage(
                Iterable<? extends Float> values) {
            ensureBatteryVoltageIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, batteryVoltage_);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 单体电池电压值
         * </pre>
         *
         * <code>repeated float battery_voltage = 7;</code>
         */
        public Builder clearBatteryVoltage() {
            batteryVoltage_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000020);
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


        // @@protoc_insertion_point(builder_scope:ChargeableSubsystemElectric)
    }

    // @@protoc_insertion_point(class_scope:ChargeableSubsystemElectric)
    private static final ChargeableSubsystemElectric DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new ChargeableSubsystemElectric();
    }

    public static ChargeableSubsystemElectric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChargeableSubsystemElectric>
            PARSER = new com.google.protobuf.AbstractParser<ChargeableSubsystemElectric>() {
        public ChargeableSubsystemElectric parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new ChargeableSubsystemElectric(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<ChargeableSubsystemElectric> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ChargeableSubsystemElectric> getParserForType() {
        return PARSER;
    }

    public ChargeableSubsystemElectric getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

