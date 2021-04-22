package com.nevt.gbt32960.message;

/**
 * <pre>
 * 可充电储能装置温度
 * </pre>
 * <p>
 * Protobuf type {@code ChargeableSubsystemTemperature}
 */
public final class ChargeableSubsystemTemperature extends
        com.google.protobuf.GeneratedMessageV3 implements
        ChargeableSubsystemTemperatureOrBuilder {
    private ChargeableSubsystemTemperature(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ChargeableSubsystemTemperature() {
        subSystemNumber_ = 0;
        probeTemperature_ = java.util.Collections.emptyList();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private ChargeableSubsystemTemperature(
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

                        subSystemNumber_ = input.readInt32();
                        break;
                    }
                    case 16: {
                        if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                            probeTemperature_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000002;
                        }
                        probeTemperature_.add(input.readInt32());
                        break;
                    }
                    case 18: {
                        int length = input.readRawVarint32();
                        int limit = input.pushLimit(length);
                        if (!((mutable_bitField0_ & 0x00000002) == 0x00000002) && input.getBytesUntilLimit() > 0) {
                            probeTemperature_ = new java.util.ArrayList<Integer>();
                            mutable_bitField0_ |= 0x00000002;
                        }
                        while (input.getBytesUntilLimit() > 0) {
                            probeTemperature_.add(input.readInt32());
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
            if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                probeTemperature_ = java.util.Collections.unmodifiableList(probeTemperature_);
            }
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_ChargeableSubsystemTemperature_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_ChargeableSubsystemTemperature_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        ChargeableSubsystemTemperature.class, Builder.class);
    }

    private int bitField0_;
    public static final int SUB_SYSTEM_NUMBER_FIELD_NUMBER = 1;
    private int subSystemNumber_;

    /**
     * <pre>
     * 可充电储能子系统号
     * </pre>
     *
     * <code>optional int32 sub_system_number = 1;</code>
     */
    public int getSubSystemNumber() {
        return subSystemNumber_;
    }

    public static final int PROBE_TEMPERATURE_FIELD_NUMBER = 2;
    private java.util.List<Integer> probeTemperature_;

    /**
     * <pre>
     * 可充电储能子系统各温度探针检测到的温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature = 2;</code>
     */
    public java.util.List<Integer>
    getProbeTemperatureList() {
        return probeTemperature_;
    }

    /**
     * <pre>
     * 可充电储能子系统各温度探针检测到的温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature = 2;</code>
     */
    public int getProbeTemperatureCount() {
        return probeTemperature_.size();
    }

    /**
     * <pre>
     * 可充电储能子系统各温度探针检测到的温度值
     * </pre>
     *
     * <code>repeated int32 probe_temperature = 2;</code>
     */
    public int getProbeTemperature(int index) {
        return probeTemperature_.get(index);
    }

    private int probeTemperatureMemoizedSerializedSize = -1;

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
        if (subSystemNumber_ != 0) {
            output.writeInt32(1, subSystemNumber_);
        }
        if (getProbeTemperatureList().size() > 0) {
            output.writeUInt32NoTag(18);
            output.writeUInt32NoTag(probeTemperatureMemoizedSerializedSize);
        }
        for (int i = 0; i < probeTemperature_.size(); i++) {
            output.writeInt32NoTag(probeTemperature_.get(i));
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (subSystemNumber_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(1, subSystemNumber_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < probeTemperature_.size(); i++) {
                dataSize += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(probeTemperature_.get(i));
            }
            size += dataSize;
            if (!getProbeTemperatureList().isEmpty()) {
                size += 1;
                size += com.google.protobuf.CodedOutputStream
                        .computeInt32SizeNoTag(dataSize);
            }
            probeTemperatureMemoizedSerializedSize = dataSize;
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
        if (!(obj instanceof ChargeableSubsystemTemperature)) {
            return super.equals(obj);
        }
        ChargeableSubsystemTemperature other = (ChargeableSubsystemTemperature) obj;

        boolean result = true;
        result = result && (getSubSystemNumber()
                == other.getSubSystemNumber());
        result = result && getProbeTemperatureList()
                .equals(other.getProbeTemperatureList());
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + SUB_SYSTEM_NUMBER_FIELD_NUMBER;
        hash = (53 * hash) + getSubSystemNumber();
        if (getProbeTemperatureCount() > 0) {
            hash = (37 * hash) + PROBE_TEMPERATURE_FIELD_NUMBER;
            hash = (53 * hash) + getProbeTemperatureList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static ChargeableSubsystemTemperature parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ChargeableSubsystemTemperature parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ChargeableSubsystemTemperature parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ChargeableSubsystemTemperature parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ChargeableSubsystemTemperature parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static ChargeableSubsystemTemperature parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ChargeableSubsystemTemperature parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static ChargeableSubsystemTemperature parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static ChargeableSubsystemTemperature parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static ChargeableSubsystemTemperature parseFrom(
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

    public static Builder newBuilder(ChargeableSubsystemTemperature prototype) {
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
     * 可充电储能装置温度
     * </pre>
     * <p>
     * Protobuf type {@code ChargeableSubsystemTemperature}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:ChargeableSubsystemTemperature)
            ChargeableSubsystemTemperatureOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ChargeableSubsystemTemperature_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ChargeableSubsystemTemperature_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ChargeableSubsystemTemperature.class, Builder.class);
        }

        // Construct using ChargeableSubsystemTemperature.newBuilder()
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
            subSystemNumber_ = 0;

            probeTemperature_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000002);
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ChargeableSubsystemTemperature_descriptor;
        }

        public ChargeableSubsystemTemperature getDefaultInstanceForType() {
            return ChargeableSubsystemTemperature.getDefaultInstance();
        }

        public ChargeableSubsystemTemperature build() {
            ChargeableSubsystemTemperature result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public ChargeableSubsystemTemperature buildPartial() {
            ChargeableSubsystemTemperature result = new ChargeableSubsystemTemperature(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            result.subSystemNumber_ = subSystemNumber_;
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                probeTemperature_ = java.util.Collections.unmodifiableList(probeTemperature_);
                bitField0_ = (bitField0_ & ~0x00000002);
            }
            result.probeTemperature_ = probeTemperature_;
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
            if (other instanceof ChargeableSubsystemTemperature) {
                return mergeFrom((ChargeableSubsystemTemperature) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(ChargeableSubsystemTemperature other) {
            if (other == ChargeableSubsystemTemperature.getDefaultInstance()) return this;
            if (other.getSubSystemNumber() != 0) {
                setSubSystemNumber(other.getSubSystemNumber());
            }
            if (!other.probeTemperature_.isEmpty()) {
                if (probeTemperature_.isEmpty()) {
                    probeTemperature_ = other.probeTemperature_;
                    bitField0_ = (bitField0_ & ~0x00000002);
                } else {
                    ensureProbeTemperatureIsMutable();
                    probeTemperature_.addAll(other.probeTemperature_);
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
            ChargeableSubsystemTemperature parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (ChargeableSubsystemTemperature) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private int subSystemNumber_;

        /**
         * <pre>
         * 可充电储能子系统号
         * </pre>
         *
         * <code>optional int32 sub_system_number = 1;</code>
         */
        public int getSubSystemNumber() {
            return subSystemNumber_;
        }

        /**
         * <pre>
         * 可充电储能子系统号
         * </pre>
         *
         * <code>optional int32 sub_system_number = 1;</code>
         */
        public Builder setSubSystemNumber(int value) {

            subSystemNumber_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 可充电储能子系统号
         * </pre>
         *
         * <code>optional int32 sub_system_number = 1;</code>
         */
        public Builder clearSubSystemNumber() {

            subSystemNumber_ = 0;
            onChanged();
            return this;
        }

        private java.util.List<Integer> probeTemperature_ = java.util.Collections.emptyList();

        private void ensureProbeTemperatureIsMutable() {
            if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                probeTemperature_ = new java.util.ArrayList<Integer>(probeTemperature_);
                bitField0_ |= 0x00000002;
            }
        }

        /**
         * <pre>
         * 可充电储能子系统各温度探针检测到的温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature = 2;</code>
         */
        public java.util.List<Integer>
        getProbeTemperatureList() {
            return java.util.Collections.unmodifiableList(probeTemperature_);
        }

        /**
         * <pre>
         * 可充电储能子系统各温度探针检测到的温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature = 2;</code>
         */
        public int getProbeTemperatureCount() {
            return probeTemperature_.size();
        }

        /**
         * <pre>
         * 可充电储能子系统各温度探针检测到的温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature = 2;</code>
         */
        public int getProbeTemperature(int index) {
            return probeTemperature_.get(index);
        }

        /**
         * <pre>
         * 可充电储能子系统各温度探针检测到的温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature = 2;</code>
         */
        public Builder setProbeTemperature(
                int index, int value) {
            ensureProbeTemperatureIsMutable();
            probeTemperature_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 可充电储能子系统各温度探针检测到的温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature = 2;</code>
         */
        public Builder addProbeTemperature(int value) {
            ensureProbeTemperatureIsMutable();
            probeTemperature_.add(value);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 可充电储能子系统各温度探针检测到的温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature = 2;</code>
         */
        public Builder addAllProbeTemperature(
                Iterable<? extends Integer> values) {
            ensureProbeTemperatureIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, probeTemperature_);
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 可充电储能子系统各温度探针检测到的温度值
         * </pre>
         *
         * <code>repeated int32 probe_temperature = 2;</code>
         */
        public Builder clearProbeTemperature() {
            probeTemperature_ = java.util.Collections.emptyList();
            bitField0_ = (bitField0_ & ~0x00000002);
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


        // @@protoc_insertion_point(builder_scope:ChargeableSubsystemTemperature)
    }

    // @@protoc_insertion_point(class_scope:ChargeableSubsystemTemperature)
    private static final ChargeableSubsystemTemperature DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new ChargeableSubsystemTemperature();
    }

    public static ChargeableSubsystemTemperature getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChargeableSubsystemTemperature>
            PARSER = new com.google.protobuf.AbstractParser<ChargeableSubsystemTemperature>() {
        public ChargeableSubsystemTemperature parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new ChargeableSubsystemTemperature(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<ChargeableSubsystemTemperature> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ChargeableSubsystemTemperature> getParserForType() {
        return PARSER;
    }

    public ChargeableSubsystemTemperature getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

