package com.nevt.gbt32960.message;

public final class LogoutRequest extends
        com.google.protobuf.GeneratedMessageV3 implements
        LogoutRequestOrBuilder {
    private LogoutRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private LogoutRequest() {
        recordTime_ = 0L;
        logoutDaySeq_ = 0L;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private LogoutRequest(
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

                        logoutDaySeq_ = input.readInt64();
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
        return Gbt3260.internal_static_com_ime_iov_gbt32960_LogoutRequest_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_LogoutRequest_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        LogoutRequest.class, Builder.class);
    }

    public static final int RECORD_TIME_FIELD_NUMBER = 1;
    private long recordTime_;

    /**
     * <code>optional int64 record_time = 1;</code>
     */
    public long getRecordTime() {
        return recordTime_;
    }

    public static final int LOGOUT_DAY_SEQ_FIELD_NUMBER = 2;
    private long logoutDaySeq_;

    /**
     * <code>optional int64 logout_day_seq = 2;</code>
     */
    public long getLogoutDaySeq() {
        return logoutDaySeq_;
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
        if (logoutDaySeq_ != 0L) {
            output.writeInt64(2, logoutDaySeq_);
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
        if (logoutDaySeq_ != 0L) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(2, logoutDaySeq_);
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
        if (!(obj instanceof LogoutRequest)) {
            return super.equals(obj);
        }
        LogoutRequest other = (LogoutRequest) obj;

        boolean result = true;
        result = result && (getRecordTime()
                == other.getRecordTime());
        result = result && (getLogoutDaySeq()
                == other.getLogoutDaySeq());
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
        hash = (37 * hash) + LOGOUT_DAY_SEQ_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getLogoutDaySeq());
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static LogoutRequest parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static LogoutRequest parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static LogoutRequest parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static LogoutRequest parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static LogoutRequest parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static LogoutRequest parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static LogoutRequest parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static LogoutRequest parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static LogoutRequest parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static LogoutRequest parseFrom(
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

    public static Builder newBuilder(LogoutRequest prototype) {
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
     * Protobuf type {@code LogoutRequest}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:LogoutRequest)
            LogoutRequestOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_LogoutRequest_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_LogoutRequest_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            LogoutRequest.class, Builder.class);
        }

        // Construct using LogoutRequest.newBuilder()
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
            recordTime_ = 0L;

            logoutDaySeq_ = 0L;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_LogoutRequest_descriptor;
        }

        public LogoutRequest getDefaultInstanceForType() {
            return LogoutRequest.getDefaultInstance();
        }

        public LogoutRequest build() {
            LogoutRequest result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public LogoutRequest buildPartial() {
            LogoutRequest result = new LogoutRequest(this);
            result.recordTime_ = recordTime_;
            result.logoutDaySeq_ = logoutDaySeq_;
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
            if (other instanceof LogoutRequest) {
                return mergeFrom((LogoutRequest) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(LogoutRequest other) {
            if (other == LogoutRequest.getDefaultInstance()) return this;
            if (other.getRecordTime() != 0L) {
                setRecordTime(other.getRecordTime());
            }
            if (other.getLogoutDaySeq() != 0L) {
                setLogoutDaySeq(other.getLogoutDaySeq());
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
            LogoutRequest parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (LogoutRequest) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

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

        private long logoutDaySeq_;

        /**
         * <code>optional int64 logout_day_seq = 2;</code>
         */
        public long getLogoutDaySeq() {
            return logoutDaySeq_;
        }

        /**
         * <code>optional int64 logout_day_seq = 2;</code>
         */
        public Builder setLogoutDaySeq(long value) {

            logoutDaySeq_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int64 logout_day_seq = 2;</code>
         */
        public Builder clearLogoutDaySeq() {

            logoutDaySeq_ = 0L;
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


        // @@protoc_insertion_point(builder_scope:LogoutRequest)
    }

    // @@protoc_insertion_point(class_scope:LogoutRequest)
    private static final LogoutRequest DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new LogoutRequest();
    }

    public static LogoutRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LogoutRequest>
            PARSER = new com.google.protobuf.AbstractParser<LogoutRequest>() {
        public LogoutRequest parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new LogoutRequest(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<LogoutRequest> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<LogoutRequest> getParserForType() {
        return PARSER;
    }

    public LogoutRequest getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

