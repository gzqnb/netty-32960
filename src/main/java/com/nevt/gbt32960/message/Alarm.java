package com.nevt.gbt32960.message;

/**
 * <pre>
 * 报警数据
 * </pre>
 * <p>
 * Protobuf type {@code Alarm}
 */
public final class Alarm extends
        com.google.protobuf.GeneratedMessageV3 implements
        AlarmOrBuilder {
    private Alarm(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private Alarm() {
        maxAlarmLevel_ = 0;
        alarmBitIdentify_ = 0;
        batteryFaultNum_ = 0;
        batteryFaultData_ = java.util.Collections.emptyList();
        motorFaultNum_ = 0;
        motorFaultData_ = java.util.Collections.emptyList();
        engineFaultNum_ = 0;
        engineFaultData_ = java.util.Collections.emptyList();
        otherFaultNum_ = 0;
        otherFaultData_ = java.util.Collections.emptyList();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private Alarm(
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

                        maxAlarmLevel_ = input.readInt32();
                        break;
                    }
                    case 16: {

                        alarmBitIdentify_ = input.readInt32();
                        break;
                    }
                    case 24: {

                        batteryFaultNum_ = input.readInt32();
                        break;
                    }
                    case 32: {
                        if (!((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                            batteryFaultData_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000008;
                        }
                        batteryFaultData_.add(input.readInt32());
                        break;
                    }
                    case 34: {
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if (!((mutable_bitField0_ & 0x00000008) == 0x00000008) && input.getBytesUntilLimit() > 0) {
                            batteryFaultData_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000008;
                        }
                        while (input.getBytesUntilLimit() > 0) {
                            batteryFaultData_.add(input.readInt32());
                        }
                        input.popLimit(limit);
                        break;
                    }
                    case 40: {

                        motorFaultNum_ = input.readInt32();
                        break;
                    }
                    case 48: {
                        if (!((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                            motorFaultData_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000020;
                        }
                        motorFaultData_.add(input.readInt32());
                        break;
                    }
                    case 50: {
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if (!((mutable_bitField0_ & 0x00000020) == 0x00000020) && input.getBytesUntilLimit() > 0) {
                            motorFaultData_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000020;
                        }
                        while (input.getBytesUntilLimit() > 0) {
                            motorFaultData_.add(input.readInt32());
                        }
                        input.popLimit(limit);
                        break;
                    }
                    case 56: {

                        engineFaultNum_ = input.readInt32();
                        break;
                    }
                    case 64: {
                        if (!((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                            engineFaultData_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000080;
                        }
                        engineFaultData_.add(input.readInt32());
                        break;
                    }
                    case 66: {
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if (!((mutable_bitField0_ & 0x00000080) == 0x00000080) && input.getBytesUntilLimit() > 0) {
                            engineFaultData_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000080;
                        }
                        while (input.getBytesUntilLimit() > 0) {
                            engineFaultData_.add(input.readInt32());
                        }
                        input.popLimit(limit);
                        break;
                    }
                    case 72: {

                        otherFaultNum_ = input.readInt32();
                        break;
                    }
                    case 80: {
                        if (!((mutable_bitField0_ & 0x00000200) == 0x00000200)) {
                            otherFaultData_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000200;
                        }
                        otherFaultData_.add(input.readInt32());
                        break;
                    }
                    case 82: {
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if (!((mutable_bitField0_ & 0x00000200) == 0x00000200) && input.getBytesUntilLimit() > 0) {
                            otherFaultData_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000200;
                        }
                        while (input.getBytesUntilLimit() > 0) {
                            otherFaultData_.add(input.readInt32());
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
            if (((mutable_bitField0_ & 0x00000008) == 0x00000008)) {
                batteryFaultData_ = java.util.Collections.unmodifiableList(batteryFaultData_);
            }
            if (((mutable_bitField0_ & 0x00000020) == 0x00000020)) {
                motorFaultData_ = java.util.Collections.unmodifiableList(motorFaultData_);
            }
            if (((mutable_bitField0_ & 0x00000080) == 0x00000080)) {
                engineFaultData_ = java.util.Collections.unmodifiableList(engineFaultData_);
            }
            if (((mutable_bitField0_ & 0x00000200) == 0x00000200)) {
                otherFaultData_ = java.util.Collections.unmodifiableList(otherFaultData_);
            }
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_Alarm_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_Alarm_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        Alarm.class, Builder.class);
    }

    private int bitField0_;
    public static final int MAX_ALARM_LEVEL_FIELD_NUMBER = 1;
    private int maxAlarmLevel_;

    /**
     * <code>optional int32 max_alarm_level = 1;</code>
     */
    public int getMaxAlarmLevel() {
        return maxAlarmLevel_;
    }

    public static final int ALARM_BIT_IDENTIFY_FIELD_NUMBER = 2;
    private int alarmBitIdentify_;

    /**
     * <code>optional int32 alarm_bit_identify = 2;</code>
     */
    public int getAlarmBitIdentify() {
        return alarmBitIdentify_;
    }

    public static final int BATTERY_FAULT_NUM_FIELD_NUMBER = 3;
    private int batteryFaultNum_;

    /**
     * <code>optional int32 battery_fault_num = 3;</code>
     */
    public int getBatteryFaultNum() {
        return batteryFaultNum_;
    }

    public static final int BATTERY_FAULT_DATA_FIELD_NUMBER = 4;
    private java.util.List<Integer> batteryFaultData_;

    /**
     * <code>repeated int32 battery_fault_data = 4;</code>
     */
    public java.util.List<Integer>
    getBatteryFaultDataList() {
        return batteryFaultData_;
    }

    /**
     * <code>repeated int32 battery_fault_data = 4;</code>
     */
    public int getBatteryFaultDataCount() {
        return batteryFaultData_.size();
    }

    /**
     * <code>repeated int32 battery_fault_data = 4;</code>
     */
    public int getBatteryFaultData(int index) {
        return batteryFaultData_.get(index);
    }

    private int batteryFaultDataMemoizedSerializedSize = -1;

    public static final int MOTOR_FAULT_NUM_FIELD_NUMBER = 5;
    private int motorFaultNum_;

    /**
     * <code>optional int32 motor_fault_num = 5;</code>
     */
    public int getMotorFaultNum() {
        return motorFaultNum_;
    }

    public static final int MOTOR_FAULT_DATA_FIELD_NUMBER = 6;
    private java.util.List<Integer> motorFaultData_;

    /**
     * <code>repeated int32 motor_fault_data = 6;</code>
     */
    public java.util.List<Integer>
    getMotorFaultDataList() {
        return motorFaultData_;
    }

    /**
     * <code>repeated int32 motor_fault_data = 6;</code>
     */
    public int getMotorFaultDataCount() {
        return motorFaultData_.size();
    }

    /**
     * <code>repeated int32 motor_fault_data = 6;</code>
     */
    public int getMotorFaultData(int index) {
        return motorFaultData_.get(index);
    }

    private int motorFaultDataMemoizedSerializedSize = -1;

    public static final int ENGINE_FAULT_NUM_FIELD_NUMBER = 7;
    private int engineFaultNum_;

    /**
     * <code>optional int32 engine_fault_num = 7;</code>
     */
    public int getEngineFaultNum() {
        return engineFaultNum_;
    }

    public static final int ENGINE_FAULT_DATA_FIELD_NUMBER = 8;
    private java.util.List<Integer> engineFaultData_;

    /**
     * <code>repeated int32 engine_fault_data = 8;</code>
     */
    public java.util.List<Integer>
    getEngineFaultDataList() {
        return engineFaultData_;
    }

    /**
     * <code>repeated int32 engine_fault_data = 8;</code>
     */
    public int getEngineFaultDataCount() {
        return engineFaultData_.size();
    }

    /**
     * <code>repeated int32 engine_fault_data = 8;</code>
     */
    public int getEngineFaultData(int index) {
        return engineFaultData_.get(index);
    }

    private int engineFaultDataMemoizedSerializedSize = -1;

    public static final int OTHER_FAULT_NUM_FIELD_NUMBER = 9;
    private int otherFaultNum_;

    /**
     * <code>optional int32 other_fault_num = 9;</code>
     */
    public int getOtherFaultNum() {
        return otherFaultNum_;
    }

    public static final int OTHER_FAULT_DATA_FIELD_NUMBER = 10;
    private java.util.List<Integer> otherFaultData_;

    /**
     * <code>repeated int32 other_fault_data = 10;</code>
     */
    public java.util.List<Integer>
    getOtherFaultDataList() {
        return otherFaultData_;
    }

    /**
     * <code>repeated int32 other_fault_data = 10;</code>
     */
    public int getOtherFaultDataCount() {
        return otherFaultData_.size();
    }

    /**
     * <code>repeated int32 other_fault_data = 10;</code>
     */
    public int getOtherFaultData(int index) {
        return otherFaultData_.get(index);
    }

    private int otherFaultDataMemoizedSerializedSize = -1;

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
        if (maxAlarmLevel_ != 0) {
            output.writeInt32(1, maxAlarmLevel_);
        }
        if (alarmBitIdentify_ != 0) {
            output.writeInt32(2, alarmBitIdentify_);
        }
        if (batteryFaultNum_ != 0) {
            output.writeInt32(3, batteryFaultNum_);
        }
        if (getBatteryFaultDataList().size() > 0) {
            output.writeUInt32NoTag(34);
            output.writeUInt32NoTag(batteryFaultDataMemoizedSerializedSize);
        }
        for (int i = 0; i < batteryFaultData_.size(); i++) {
            output.writeInt32NoTag(batteryFaultData_.get(i));
        }
        if (motorFaultNum_ != 0) {
            output.writeInt32(5, motorFaultNum_);
        }
        if (getMotorFaultDataList().size() > 0) {
            output.writeUInt32NoTag(50);
            output.writeUInt32NoTag(motorFaultDataMemoizedSerializedSize);
        }
        for (int i = 0; i < motorFaultData_.size(); i++) {
            output.writeInt32NoTag(motorFaultData_.get(i));
        }
        if (engineFaultNum_ != 0) {
            output.writeInt32(7, engineFaultNum_);
        }
        if (getEngineFaultDataList().size() > 0) {
            output.writeUInt32NoTag(66);
            output.writeUInt32NoTag(engineFaultDataMemoizedSerializedSize);
        }
        for (int i = 0; i < engineFaultData_.size(); i++) {
            output.writeInt32NoTag(engineFaultData_.get(i));
        }
        if (otherFaultNum_ != 0) {
            output.writeInt32(9, otherFaultNum_);
        }
        if (getOtherFaultDataList().size() > 0) {
            output.writeUInt32NoTag(82);
            output.writeUInt32NoTag(otherFaultDataMemoizedSerializedSize);
        }
        for (int i = 0; i < otherFaultData_.size(); i++) {
            output.writeInt32NoTag(otherFaultData_.get(i));
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (maxAlarmLevel_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(1, maxAlarmLevel_);
        }
        if (alarmBitIdentify_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(2, alarmBitIdentify_);
        }
        if (batteryFaultNum_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(3, batteryFaultNum_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < batteryFaultData_.size(); i++) {
                dataSize += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(batteryFaultData_.get(i));
            }
            size += dataSize;
            if (!getBatteryFaultDataList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(dataSize);
            }
            batteryFaultDataMemoizedSerializedSize = dataSize;
        }
        if (motorFaultNum_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(5, motorFaultNum_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < motorFaultData_.size(); i++) {
                dataSize += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(motorFaultData_.get(i));
            }
            size += dataSize;
            if (!getMotorFaultDataList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(dataSize);
            }
            motorFaultDataMemoizedSerializedSize = dataSize;
        }
        if (engineFaultNum_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(7, engineFaultNum_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < engineFaultData_.size(); i++) {
                dataSize += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(engineFaultData_.get(i));
            }
            size += dataSize;
            if (!getEngineFaultDataList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(dataSize);
            }
            engineFaultDataMemoizedSerializedSize = dataSize;
        }
        if (otherFaultNum_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(9, otherFaultNum_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < otherFaultData_.size(); i++) {
                dataSize += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(otherFaultData_.get(i));
            }
            size += dataSize;
            if (!getOtherFaultDataList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(dataSize);
            }
            otherFaultDataMemoizedSerializedSize = dataSize;
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
        if (!(obj instanceof Alarm)) {
            return super.equals(obj);
        }
        Alarm other = (Alarm) obj;

        boolean result = true;
        result = result && (getMaxAlarmLevel()
                == other.getMaxAlarmLevel());
        result = result && (getAlarmBitIdentify()
                == other.getAlarmBitIdentify());
        result = result && (getBatteryFaultNum()
                == other.getBatteryFaultNum());
        result = result && getBatteryFaultDataList()
                .equals(other.getBatteryFaultDataList());
        result = result && (getMotorFaultNum()
                == other.getMotorFaultNum());
        result = result && getMotorFaultDataList()
                .equals(other.getMotorFaultDataList());
        result = result && (getEngineFaultNum()
                == other.getEngineFaultNum());
        result = result && getEngineFaultDataList()
                .equals(other.getEngineFaultDataList());
        result = result && (getOtherFaultNum()
                == other.getOtherFaultNum());
        result = result && getOtherFaultDataList()
                .equals(other.getOtherFaultDataList());
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + MAX_ALARM_LEVEL_FIELD_NUMBER;
        hash = (53 * hash) + getMaxAlarmLevel();
        hash = (37 * hash) + ALARM_BIT_IDENTIFY_FIELD_NUMBER;
        hash = (53 * hash) + getAlarmBitIdentify();
        hash = (37 * hash) + BATTERY_FAULT_NUM_FIELD_NUMBER;
        hash = (53 * hash) + getBatteryFaultNum();
        if (getBatteryFaultDataCount() > 0) {
            hash = (37 * hash) + BATTERY_FAULT_DATA_FIELD_NUMBER;
            hash = (53 * hash) + getBatteryFaultDataList().hashCode();
        }
        hash = (37 * hash) + MOTOR_FAULT_NUM_FIELD_NUMBER;
        hash = (53 * hash) + getMotorFaultNum();
        if (getMotorFaultDataCount() > 0) {
            hash = (37 * hash) + MOTOR_FAULT_DATA_FIELD_NUMBER;
            hash = (53 * hash) + getMotorFaultDataList().hashCode();
        }
        hash = (37 * hash) + ENGINE_FAULT_NUM_FIELD_NUMBER;
        hash = (53 * hash) + getEngineFaultNum();
        if (getEngineFaultDataCount() > 0) {
            hash = (37 * hash) + ENGINE_FAULT_DATA_FIELD_NUMBER;
            hash = (53 * hash) + getEngineFaultDataList().hashCode();
        }
        hash = (37 * hash) + OTHER_FAULT_NUM_FIELD_NUMBER;
        hash = (53 * hash) + getOtherFaultNum();
        if (getOtherFaultDataCount() > 0) {
            hash = (37 * hash) + OTHER_FAULT_DATA_FIELD_NUMBER;
            hash = (53 * hash) + getOtherFaultDataList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static Alarm parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Alarm parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Alarm parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static Alarm parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static Alarm parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Alarm parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static Alarm parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static Alarm parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static Alarm parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static Alarm parseFrom(
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

    public static Builder newBuilder(Alarm prototype) {
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
     * 报警数据
     * </pre>
     * <p>
     * Protobuf type {@code Alarm}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:Alarm)
            AlarmOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Alarm_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Alarm_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            Alarm.class, Builder.class);
        }

        // Construct using Alarm.newBuilder()
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
            maxAlarmLevel_ = 0;

            alarmBitIdentify_ = 0;

            batteryFaultNum_ = 0;

            batteryFaultData_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000008);
            motorFaultNum_ = 0;

            motorFaultData_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000020);
            engineFaultNum_ = 0;

            engineFaultData_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000080);
            otherFaultNum_ = 0;

            otherFaultData_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000200);
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_Alarm_descriptor;
        }

        public Alarm getDefaultInstanceForType() {
            return Alarm.getDefaultInstance();
        }

        public Alarm build() {
            Alarm result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public Alarm buildPartial() {
            Alarm result = new Alarm(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            result.maxAlarmLevel_ = maxAlarmLevel_;
            result.alarmBitIdentify_ = alarmBitIdentify_;
            result.batteryFaultNum_ = batteryFaultNum_;
            if (((bitField0_ & 0x00000008) == 0x00000008)) {
                batteryFaultData_ = java.util.Collections.unmodifiableList(batteryFaultData_);
                bitField0_ = (bitField0_ & ~0x00000008);
            }
            result.batteryFaultData_ = batteryFaultData_;
            result.motorFaultNum_ = motorFaultNum_;
            if (((bitField0_ & 0x00000020) == 0x00000020)) {
                motorFaultData_ = java.util.Collections.unmodifiableList(motorFaultData_);
                bitField0_ = (bitField0_ & ~0x00000020);
            }
            result.motorFaultData_ = motorFaultData_;
            result.engineFaultNum_ = engineFaultNum_;
            if (((bitField0_ & 0x00000080) == 0x00000080)) {
                engineFaultData_ = java.util.Collections.unmodifiableList(engineFaultData_);
                bitField0_ = (bitField0_ & ~0x00000080);
            }
            result.engineFaultData_ = engineFaultData_;
            result.otherFaultNum_ = otherFaultNum_;
            if (((bitField0_ & 0x00000200) == 0x00000200)) {
                otherFaultData_ = java.util.Collections.unmodifiableList(otherFaultData_);
                bitField0_ = (bitField0_ & ~0x00000200);
            }
            result.otherFaultData_ = otherFaultData_;
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
            if (other instanceof Alarm) {
                return mergeFrom((Alarm) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(Alarm other) {
            if (other == Alarm.getDefaultInstance()) return this;
            if (other.getMaxAlarmLevel() != 0) {
                setMaxAlarmLevel(other.getMaxAlarmLevel());
            }
            if (other.getAlarmBitIdentify() != 0) {
                setAlarmBitIdentify(other.getAlarmBitIdentify());
            }
            if (other.getBatteryFaultNum() != 0) {
                setBatteryFaultNum(other.getBatteryFaultNum());
            }
            if (!other.batteryFaultData_.isEmpty()) {
                if (batteryFaultData_.isEmpty()) {
                    batteryFaultData_ = other.batteryFaultData_;
                    bitField0_ = (bitField0_ & ~0x00000008);
                } else {
                    ensureBatteryFaultDataIsMutable();
                    batteryFaultData_.addAll(other.batteryFaultData_);
                }
                onChanged();
            }
            if (other.getMotorFaultNum() != 0) {
                setMotorFaultNum(other.getMotorFaultNum());
            }
            if (!other.motorFaultData_.isEmpty()) {
                if (motorFaultData_.isEmpty()) {
                    motorFaultData_ = other.motorFaultData_;
                    bitField0_ = (bitField0_ & ~0x00000020);
                } else {
                    ensureMotorFaultDataIsMutable();
                    motorFaultData_.addAll(other.motorFaultData_);
                }
                onChanged();
            }
            if (other.getEngineFaultNum() != 0) {
                setEngineFaultNum(other.getEngineFaultNum());
            }
            if (!other.engineFaultData_.isEmpty()) {
                if (engineFaultData_.isEmpty()) {
                    engineFaultData_ = other.engineFaultData_;
                    bitField0_ = (bitField0_ & ~0x00000080);
                } else {
                    ensureEngineFaultDataIsMutable();
                    engineFaultData_.addAll(other.engineFaultData_);
                }
                onChanged();
            }
            if (other.getOtherFaultNum() != 0) {
                setOtherFaultNum(other.getOtherFaultNum());
            }
            if (!other.otherFaultData_.isEmpty()) {
                if (otherFaultData_.isEmpty()) {
                    otherFaultData_ = other.otherFaultData_;
                    bitField0_ = (bitField0_ & ~0x00000200);
                } else {
                    ensureOtherFaultDataIsMutable();
                    otherFaultData_.addAll(other.otherFaultData_);
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
            Alarm parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (Alarm) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private int maxAlarmLevel_;

        /**
         * <code>optional int32 max_alarm_level = 1;</code>
         */
        public int getMaxAlarmLevel() {
            return maxAlarmLevel_;
        }

        /**
         * <code>optional int32 max_alarm_level = 1;</code>
         */
        public Builder setMaxAlarmLevel(int value) {

            maxAlarmLevel_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 max_alarm_level = 1;</code>
         */
        public Builder clearMaxAlarmLevel() {

            maxAlarmLevel_ = 0;
            onChanged();
            return this;
        }

        private int alarmBitIdentify_;

        /**
         * <code>optional int32 alarm_bit_identify = 2;</code>
         */
        public int getAlarmBitIdentify() {
            return alarmBitIdentify_;
        }

        /**
         * <code>optional int32 alarm_bit_identify = 2;</code>
         */
        public Builder setAlarmBitIdentify(int value) {

            alarmBitIdentify_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 alarm_bit_identify = 2;</code>
         */
        public Builder clearAlarmBitIdentify() {

            alarmBitIdentify_ = 0;
            onChanged();
            return this;
        }

        private int batteryFaultNum_;

        /**
         * <code>optional int32 battery_fault_num = 3;</code>
         */
        public int getBatteryFaultNum() {
            return batteryFaultNum_;
        }

        /**
         * <code>optional int32 battery_fault_num = 3;</code>
         */
        public Builder setBatteryFaultNum(int value) {

            batteryFaultNum_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 battery_fault_num = 3;</code>
         */
        public Builder clearBatteryFaultNum() {

            batteryFaultNum_ = 0;
            onChanged();
            return this;
        }

        private java.util.List<Integer> batteryFaultData_ = java.util.Collections.emptyList();

        private void ensureBatteryFaultDataIsMutable() {
            if (!((bitField0_ & 0x00000008) == 0x00000008)) {
                batteryFaultData_ = new java.util.ArrayList<Integer>(batteryFaultData_);
                bitField0_ |= 0x00000008;
            }
        }

        /**
         * <code>repeated int32 battery_fault_data = 4;</code>
         */
        public java.util.List<Integer>
        getBatteryFaultDataList() {
            return java.util.Collections.unmodifiableList(batteryFaultData_);
        }

        /**
         * <code>repeated int32 battery_fault_data = 4;</code>
         */
        public int getBatteryFaultDataCount() {
            return batteryFaultData_.size();
        }

        /**
         * <code>repeated int32 battery_fault_data = 4;</code>
         */
        public int getBatteryFaultData(int index) {
            return batteryFaultData_.get(index);
        }

        /**
         * <code>repeated int32 battery_fault_data = 4;</code>
         */
        public Builder setBatteryFaultData(
                int index, int value) {
            ensureBatteryFaultDataIsMutable();
            batteryFaultData_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 battery_fault_data = 4;</code>
         */
        public Builder addBatteryFaultData(int value) {
            ensureBatteryFaultDataIsMutable();
            batteryFaultData_.add(value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 battery_fault_data = 4;</code>
         */
        public Builder addAllBatteryFaultData(
                Iterable<? extends Integer> values) {
            ensureBatteryFaultDataIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, batteryFaultData_);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 battery_fault_data = 4;</code>
         */
        public Builder clearBatteryFaultData() {
            batteryFaultData_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000008);
            onChanged();
            return this;
        }

        private int motorFaultNum_;

        /**
         * <code>optional int32 motor_fault_num = 5;</code>
         */
        public int getMotorFaultNum() {
            return motorFaultNum_;
        }

        /**
         * <code>optional int32 motor_fault_num = 5;</code>
         */
        public Builder setMotorFaultNum(int value) {

            motorFaultNum_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 motor_fault_num = 5;</code>
         */
        public Builder clearMotorFaultNum() {

            motorFaultNum_ = 0;
            onChanged();
            return this;
        }

        private java.util.List<Integer> motorFaultData_ = java.util.Collections.emptyList();

        private void ensureMotorFaultDataIsMutable() {
            if (!((bitField0_ & 0x00000020) == 0x00000020)) {
                motorFaultData_ = new java.util.ArrayList<Integer>(motorFaultData_);
                bitField0_ |= 0x00000020;
            }
        }

        /**
         * <code>repeated int32 motor_fault_data = 6;</code>
         */
        public java.util.List<Integer>
        getMotorFaultDataList() {
            return java.util.Collections.unmodifiableList(motorFaultData_);
        }

        /**
         * <code>repeated int32 motor_fault_data = 6;</code>
         */
        public int getMotorFaultDataCount() {
            return motorFaultData_.size();
        }

        /**
         * <code>repeated int32 motor_fault_data = 6;</code>
         */
        public int getMotorFaultData(int index) {
            return motorFaultData_.get(index);
        }

        /**
         * <code>repeated int32 motor_fault_data = 6;</code>
         */
        public Builder setMotorFaultData(
                int index, int value) {
            ensureMotorFaultDataIsMutable();
            motorFaultData_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 motor_fault_data = 6;</code>
         */
        public Builder addMotorFaultData(int value) {
            ensureMotorFaultDataIsMutable();
            motorFaultData_.add(value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 motor_fault_data = 6;</code>
         */
        public Builder addAllMotorFaultData(
                Iterable<? extends Integer> values) {
            ensureMotorFaultDataIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, motorFaultData_);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 motor_fault_data = 6;</code>
         */
        public Builder clearMotorFaultData() {
            motorFaultData_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000020);
            onChanged();
            return this;
        }

        private int engineFaultNum_;

        /**
         * <code>optional int32 engine_fault_num = 7;</code>
         */
        public int getEngineFaultNum() {
            return engineFaultNum_;
        }

        /**
         * <code>optional int32 engine_fault_num = 7;</code>
         */
        public Builder setEngineFaultNum(int value) {

            engineFaultNum_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 engine_fault_num = 7;</code>
         */
        public Builder clearEngineFaultNum() {

            engineFaultNum_ = 0;
            onChanged();
            return this;
        }

        private java.util.List<Integer> engineFaultData_ = java.util.Collections.emptyList();

        private void ensureEngineFaultDataIsMutable() {
            if (!((bitField0_ & 0x00000080) == 0x00000080)) {
                engineFaultData_ = new java.util.ArrayList<Integer>(engineFaultData_);
                bitField0_ |= 0x00000080;
            }
        }

        /**
         * <code>repeated int32 engine_fault_data = 8;</code>
         */
        public java.util.List<Integer>
        getEngineFaultDataList() {
            return java.util.Collections.unmodifiableList(engineFaultData_);
        }

        /**
         * <code>repeated int32 engine_fault_data = 8;</code>
         */
        public int getEngineFaultDataCount() {
            return engineFaultData_.size();
        }

        /**
         * <code>repeated int32 engine_fault_data = 8;</code>
         */
        public int getEngineFaultData(int index) {
            return engineFaultData_.get(index);
        }

        /**
         * <code>repeated int32 engine_fault_data = 8;</code>
         */
        public Builder setEngineFaultData(
                int index, int value) {
            ensureEngineFaultDataIsMutable();
            engineFaultData_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 engine_fault_data = 8;</code>
         */
        public Builder addEngineFaultData(int value) {
            ensureEngineFaultDataIsMutable();
            engineFaultData_.add(value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 engine_fault_data = 8;</code>
         */
        public Builder addAllEngineFaultData(
                Iterable<? extends Integer> values) {
            ensureEngineFaultDataIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, engineFaultData_);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 engine_fault_data = 8;</code>
         */
        public Builder clearEngineFaultData() {
            engineFaultData_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000080);
            onChanged();
            return this;
        }

        private int otherFaultNum_;

        /**
         * <code>optional int32 other_fault_num = 9;</code>
         */
        public int getOtherFaultNum() {
            return otherFaultNum_;
        }

        /**
         * <code>optional int32 other_fault_num = 9;</code>
         */
        public Builder setOtherFaultNum(int value) {

            otherFaultNum_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 other_fault_num = 9;</code>
         */
        public Builder clearOtherFaultNum() {

            otherFaultNum_ = 0;
            onChanged();
            return this;
        }

        private java.util.List<Integer> otherFaultData_ = java.util.Collections.emptyList();

        private void ensureOtherFaultDataIsMutable() {
            if (!((bitField0_ & 0x00000200) == 0x00000200)) {
                otherFaultData_ = new java.util.ArrayList<Integer>(otherFaultData_);
                bitField0_ |= 0x00000200;
            }
        }

        /**
         * <code>repeated int32 other_fault_data = 10;</code>
         */
        public java.util.List<Integer>
        getOtherFaultDataList() {
            return java.util.Collections.unmodifiableList(otherFaultData_);
        }

        /**
         * <code>repeated int32 other_fault_data = 10;</code>
         */
        public int getOtherFaultDataCount() {
            return otherFaultData_.size();
        }

        /**
         * <code>repeated int32 other_fault_data = 10;</code>
         */
        public int getOtherFaultData(int index) {
            return otherFaultData_.get(index);
        }

        /**
         * <code>repeated int32 other_fault_data = 10;</code>
         */
        public Builder setOtherFaultData(
                int index, int value) {
            ensureOtherFaultDataIsMutable();
            otherFaultData_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 other_fault_data = 10;</code>
         */
        public Builder addOtherFaultData(int value) {
            ensureOtherFaultDataIsMutable();
            otherFaultData_.add(value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 other_fault_data = 10;</code>
         */
        public Builder addAllOtherFaultData(
                Iterable<? extends Integer> values) {
            ensureOtherFaultDataIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, otherFaultData_);
            onChanged();
            return this;
        }

        /**
         * <code>repeated int32 other_fault_data = 10;</code>
         */
        public Builder clearOtherFaultData() {
            otherFaultData_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000200);
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


        // @@protoc_insertion_point(builder_scope:Alarm)
    }

    // @@protoc_insertion_point(class_scope:Alarm)
    private static final Alarm DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new Alarm();
    }

    public static Alarm getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Alarm>
            PARSER = new com.google.protobuf.AbstractParser<Alarm>() {
        public Alarm parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new Alarm(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<Alarm> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<Alarm> getParserForType() {
        return PARSER;
    }

    public Alarm getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

