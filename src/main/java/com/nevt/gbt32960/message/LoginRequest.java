package com.nevt.gbt32960.message;

public final class LoginRequest extends
        com.google.protobuf.GeneratedMessageV3 implements
        LoginRequestOrBuilder {
    private LoginRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private LoginRequest() {
        recordTime_ = 0L;
        loginDaySeq_ = 0;
        iccid_ = "";
        systemCodeLength_ = 0;
        chargeableSubsystemCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private LoginRequest(
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

                        recordTime_ = input.readInt64();
                        break;
                    }
                    case 16: {

                        loginDaySeq_ = input.readInt32();
                        break;
                    }
                    case 26: {
                        String s = input.readStringRequireUtf8();

                        iccid_ = s;
                        break;
                    }
                    case 32: {

                        systemCodeLength_ = input.readInt32();
                        break;
                    }
                    case 42: {
                        String s = input.readStringRequireUtf8();
                        if (!((mutable_bitField0_ & 0x00000010) == 0x00000010)) {
                            chargeableSubsystemCode_ = new com.google.protobuf.LazyStringArrayList();
                            mutable_bitField0_ |= 0x00000010;
                        }
                        chargeableSubsystemCode_.add(s);
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
                chargeableSubsystemCode_ = chargeableSubsystemCode_.getUnmodifiableView();
            }
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_LoginRequest_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_LoginRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        LoginRequest.class, Builder.class);
    }

    private int bitField0_;
    public static final int RECORD_TIME_FIELD_NUMBER = 1;
    private long recordTime_;

    /**
     * <code>optional int64 record_time = 1;</code>
     */
    public long getRecordTime() {
        return recordTime_;
    }

    public static final int LOGIN_DAY_SEQ_FIELD_NUMBER = 2;
    private int loginDaySeq_;

    /**
     * <code>optional int32 login_day_seq = 2;</code>
     */
    public int getLoginDaySeq() {
        return loginDaySeq_;
    }

    public static final int ICCID_FIELD_NUMBER = 3;
    private volatile Object iccid_;

    /**
     * <code>optional string iccid = 3;</code>
     */
    public String getIccid() {
        Object ref = iccid_;
        if (ref instanceof String) {
            return (String) ref;
        } else {
            com.google.protobuf.ByteString bs =
                    (com.google.protobuf.ByteString) ref;
            String s = bs.toStringUtf8();
            iccid_ = s;
            return s;
        }
    }

    /**
     * <code>optional string iccid = 3;</code>
     */
    public com.google.protobuf.ByteString
    getIccidBytes() {
        Object ref = iccid_;
        if (ref instanceof String) {
            com.google.protobuf.ByteString b =
                    com.google.protobuf.ByteString.copyFromUtf8(
                            (String) ref);
            iccid_ = b;
            return b;
        } else {
            return (com.google.protobuf.ByteString) ref;
        }
    }

    public static final int SYSTEM_CODE_LENGTH_FIELD_NUMBER = 4;
    private int systemCodeLength_;

    /**
     * <code>optional int32 system_code_length = 4;</code>
     */
    public int getSystemCodeLength() {
        return systemCodeLength_;
    }

    public static final int CHARGEABLE_SUBSYSTEM_CODE_FIELD_NUMBER = 5;
    private com.google.protobuf.LazyStringList chargeableSubsystemCode_;

    /**
     * <code>repeated string chargeable_subsystem_code = 5;</code>
     */
    public com.google.protobuf.ProtocolStringList
    getChargeableSubsystemCodeList() {
        return chargeableSubsystemCode_;
    }

    /**
     * <code>repeated string chargeable_subsystem_code = 5;</code>
     */
    public int getChargeableSubsystemCodeCount() {
        return chargeableSubsystemCode_.size();
    }

    /**
     * <code>repeated string chargeable_subsystem_code = 5;</code>
     */
    public String getChargeableSubsystemCode(int index) {
        return chargeableSubsystemCode_.get(index);
    }

    /**
     * <code>repeated string chargeable_subsystem_code = 5;</code>
     */
    public com.google.protobuf.ByteString
    getChargeableSubsystemCodeBytes(int index) {
        return chargeableSubsystemCode_.getByteString(index);
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
        if (recordTime_ != 0L) {
            output.writeInt64(1, recordTime_);
        }
        if (loginDaySeq_ != 0) {
            output.writeInt32(2, loginDaySeq_);
        }
        if (!getIccidBytes().isEmpty()) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 3, iccid_);
        }
        if (systemCodeLength_ != 0) {
            output.writeInt32(4, systemCodeLength_);
        }
        for (int i = 0; i < chargeableSubsystemCode_.size(); i++) {
            com.google.protobuf.GeneratedMessageV3.writeString(output, 5, chargeableSubsystemCode_.getRaw(i));
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (recordTime_ != 0L) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(1, recordTime_);
        }
        if (loginDaySeq_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(2, loginDaySeq_);
        }
        if (!getIccidBytes().isEmpty()) {
            size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, iccid_);
        }
        if (systemCodeLength_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(4, systemCodeLength_);
        }
        {
            int dataSize = 0;
            for (int i = 0; i < chargeableSubsystemCode_.size(); i++) {
                dataSize += computeStringSizeNoTag(chargeableSubsystemCode_.getRaw(i));
            }
            size += dataSize;
            size += 1 * getChargeableSubsystemCodeList().size();
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
        if (!(obj instanceof LoginRequest)) {
            return super.equals(obj);
        }
        LoginRequest other = (LoginRequest) obj;

        boolean result = true;
        result = result && (getRecordTime()
                == other.getRecordTime());
        result = result && (getLoginDaySeq()
                == other.getLoginDaySeq());
        result = result && getIccid()
                .equals(other.getIccid());
        result = result && (getSystemCodeLength()
                == other.getSystemCodeLength());
        result = result && getChargeableSubsystemCodeList()
                .equals(other.getChargeableSubsystemCodeList());
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + RECORD_TIME_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getRecordTime());
        hash = (37 * hash) + LOGIN_DAY_SEQ_FIELD_NUMBER;
        hash = (53 * hash) + getLoginDaySeq();
        hash = (37 * hash) + ICCID_FIELD_NUMBER;
        hash = (53 * hash) + getIccid().hashCode();
        hash = (37 * hash) + SYSTEM_CODE_LENGTH_FIELD_NUMBER;
        hash = (53 * hash) + getSystemCodeLength();
        if (getChargeableSubsystemCodeCount() > 0) {
            hash = (37 * hash) + CHARGEABLE_SUBSYSTEM_CODE_FIELD_NUMBER;
            hash = (53 * hash) + getChargeableSubsystemCodeList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static LoginRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static LoginRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static LoginRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static LoginRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static LoginRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static LoginRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static LoginRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static LoginRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static LoginRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static LoginRequest parseFrom(
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

    public static Builder newBuilder(LoginRequest prototype) {
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
     * Protobuf type {@code LoginRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:LoginRequest)
            LoginRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_LoginRequest_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_LoginRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            LoginRequest.class, Builder.class);
        }

        // Construct using LoginRequest.newBuilder()
        public Builder() {
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
            recordTime_ = 0L;

            loginDaySeq_ = 0;

            iccid_ = "";

            systemCodeLength_ = 0;

            chargeableSubsystemCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000010);
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_LoginRequest_descriptor;
        }

        public LoginRequest getDefaultInstanceForType() {
            return LoginRequest.getDefaultInstance();
        }

        public LoginRequest build() {
            LoginRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public LoginRequest buildPartial() {
            LoginRequest result = new LoginRequest(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            result.recordTime_ = recordTime_;
            result.loginDaySeq_ = loginDaySeq_;
            result.iccid_ = iccid_;
            result.systemCodeLength_ = systemCodeLength_;
            if (((bitField0_ & 0x00000010) == 0x00000010)) {
                chargeableSubsystemCode_ = chargeableSubsystemCode_.getUnmodifiableView();
                bitField0_ = (bitField0_ & ~0x00000010);
            }
            result.chargeableSubsystemCode_ = chargeableSubsystemCode_;
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
            if (other instanceof LoginRequest) {
                return mergeFrom((LoginRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(LoginRequest other) {
            if (other == LoginRequest.getDefaultInstance()) return this;
            if (other.getRecordTime() != 0L) {
                setRecordTime(other.getRecordTime());
            }
            if (other.getLoginDaySeq() != 0) {
                setLoginDaySeq(other.getLoginDaySeq());
            }
            if (!other.getIccid().isEmpty()) {
                iccid_ = other.iccid_;
                onChanged();
            }
            if (other.getSystemCodeLength() != 0) {
                setSystemCodeLength(other.getSystemCodeLength());
            }
            if (!other.chargeableSubsystemCode_.isEmpty()) {
                if (chargeableSubsystemCode_.isEmpty()) {
                    chargeableSubsystemCode_ = other.chargeableSubsystemCode_;
                    bitField0_ = (bitField0_ & ~0x00000010);
                } else {
                    ensureChargeableSubsystemCodeIsMutable();
                    chargeableSubsystemCode_.addAll(other.chargeableSubsystemCode_);
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
            LoginRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (LoginRequest) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private long recordTime_;

        /**
         * <code>optional int64 record_time = 1;</code>
         */
        public long getRecordTime() {
            return recordTime_;
        }

        /**
         * <code>optional int64 record_time = 1;</code>
         */
        public Builder setRecordTime(long value) {

            recordTime_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int64 record_time = 1;</code>
         */
        public Builder clearRecordTime() {

            recordTime_ = 0L;
            onChanged();
            return this;
        }

        private int loginDaySeq_;

        /**
         * <code>optional int32 login_day_seq = 2;</code>
         */
        public int getLoginDaySeq() {
            return loginDaySeq_;
        }

        /**
         * <code>optional int32 login_day_seq = 2;</code>
         */
        public Builder setLoginDaySeq(int value) {

            loginDaySeq_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 login_day_seq = 2;</code>
         */
        public Builder clearLoginDaySeq() {

            loginDaySeq_ = 0;
            onChanged();
            return this;
        }

        private Object iccid_ = "";

        /**
         * <code>optional string iccid = 3;</code>
         */
        public String getIccid() {
            Object ref = iccid_;
            if (!(ref instanceof String)) {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                String s = bs.toStringUtf8();
                iccid_ = s;
                return s;
            } else {
                return (String) ref;
            }
        }

        /**
         * <code>optional string iccid = 3;</code>
         */
        public com.google.protobuf.ByteString
        getIccidBytes() {
            Object ref = iccid_;
            if (ref instanceof String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (String) ref);
                iccid_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        /**
         * <code>optional string iccid = 3;</code>
         */
        public Builder setIccid(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }

            iccid_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional string iccid = 3;</code>
         */
        public Builder clearIccid() {

            iccid_ = getDefaultInstance().getIccid();
            onChanged();
            return this;
        }

        /**
         * <code>optional string iccid = 3;</code>
         */
        public Builder setIccidBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);

            iccid_ = value;
            onChanged();
            return this;
        }

        private int systemCodeLength_;

        /**
         * <code>optional int32 system_code_length = 4;</code>
         */
        public int getSystemCodeLength() {
            return systemCodeLength_;
        }

        /**
         * <code>optional int32 system_code_length = 4;</code>
         */
        public Builder setSystemCodeLength(int value) {

            systemCodeLength_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 system_code_length = 4;</code>
         */
        public Builder clearSystemCodeLength() {

            systemCodeLength_ = 0;
            onChanged();
            return this;
        }

        private com.google.protobuf.LazyStringList chargeableSubsystemCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;

        private void ensureChargeableSubsystemCodeIsMutable() {
            if (!((bitField0_ & 0x00000010) == 0x00000010)) {
                chargeableSubsystemCode_ = new com.google.protobuf.LazyStringArrayList(chargeableSubsystemCode_);
                bitField0_ |= 0x00000010;
            }
        }

        /**
         * <code>repeated string chargeable_subsystem_code = 5;</code>
         */
        public com.google.protobuf.ProtocolStringList
        getChargeableSubsystemCodeList() {
            return chargeableSubsystemCode_.getUnmodifiableView();
        }

        /**
         * <code>repeated string chargeable_subsystem_code = 5;</code>
         */
        public int getChargeableSubsystemCodeCount() {
            return chargeableSubsystemCode_.size();
        }

        /**
         * <code>repeated string chargeable_subsystem_code = 5;</code>
         */
        public String getChargeableSubsystemCode(int index) {
            return chargeableSubsystemCode_.get(index);
        }

        /**
         * <code>repeated string chargeable_subsystem_code = 5;</code>
         */
        public com.google.protobuf.ByteString
        getChargeableSubsystemCodeBytes(int index) {
            return chargeableSubsystemCode_.getByteString(index);
        }

        /**
         * <code>repeated string chargeable_subsystem_code = 5;</code>
         */
        public Builder setChargeableSubsystemCode(
                int index, String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureChargeableSubsystemCodeIsMutable();
            chargeableSubsystemCode_.set(index, value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string chargeable_subsystem_code = 5;</code>
         */
        public Builder addChargeableSubsystemCode(
                String value) {
            if (value == null) {
                throw new NullPointerException();
            }
            ensureChargeableSubsystemCodeIsMutable();
            chargeableSubsystemCode_.add(value);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string chargeable_subsystem_code = 5;</code>
         */
        public Builder addAllChargeableSubsystemCode(
                Iterable<String> values) {
            ensureChargeableSubsystemCodeIsMutable();
            com.google.protobuf.AbstractMessageLite.Builder.addAll(
                    values, chargeableSubsystemCode_);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string chargeable_subsystem_code = 5;</code>
         */
        public Builder clearChargeableSubsystemCode() {
            chargeableSubsystemCode_ = com.google.protobuf.LazyStringArrayList.EMPTY;
            bitField0_ = (bitField0_ & ~0x00000010);
            onChanged();
            return this;
        }

        /**
         * <code>repeated string chargeable_subsystem_code = 5;</code>
         */
        public Builder addChargeableSubsystemCodeBytes(
                com.google.protobuf.ByteString value) {
            if (value == null) {
                throw new NullPointerException();
            }
            checkByteStringIsUtf8(value);
            ensureChargeableSubsystemCodeIsMutable();
            chargeableSubsystemCode_.add(value);
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


    }

    private static final LoginRequest DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new LoginRequest();
    }

    public static LoginRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LoginRequest>
            PARSER = new com.google.protobuf.AbstractParser<LoginRequest>() {
        public LoginRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new LoginRequest(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<LoginRequest> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<LoginRequest> getParserForType() {
        return PARSER;
    }

    public LoginRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

