package com.nevt.gbt32960.message;

/**
 * Protobuf type {@code ConfigQueryResponse}
 */
public final class ConfigQueryResponse extends
        com.google.protobuf.GeneratedMessageV3 implements
        ConfigQueryResponseOrBuilder {
    private ConfigQueryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ConfigQueryResponse() {
        responseTime_ = 0L;
        parameters_ = java.util.Collections.emptyList();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private ConfigQueryResponse(
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

                        responseTime_ = input.readInt64();
                        break;
                    }
                    case 18: {
                        if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
                            parameters_ = new java.util.ArrayList<Parameter>();
                            mutable_bitField0_ |= 0x00000002;
                        }
                        parameters_.add(
                                input.readMessage(Parameter.parser(), extensionRegistry));
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
                parameters_ = java.util.Collections.unmodifiableList(parameters_);
            }
            makeExtensionsImmutable();
        }
    }

    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_ConfigQueryResponse_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_ConfigQueryResponse_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        ConfigQueryResponse.class, Builder.class);
    }

    private int bitField0_;
    public static final int RESPONSE_TIME_FIELD_NUMBER = 1;
    private long responseTime_;

    /**
     * <code>optional int64 response_time = 1;</code>
     */
    public long getResponseTime() {
        return responseTime_;
    }

    public static final int PARAMETERS_FIELD_NUMBER = 2;
    private java.util.List<Parameter> parameters_;

    /**
     * <code>repeated .Parameter parameters = 2;</code>
     */
    public java.util.List<Parameter> getParametersList() {
        return parameters_;
    }

    /**
     * <code>repeated .Parameter parameters = 2;</code>
     */
    public java.util.List<? extends ParameterOrBuilder>
    getParametersOrBuilderList() {
        return parameters_;
    }

    /**
     * <code>repeated .Parameter parameters = 2;</code>
     */
    public int getParametersCount() {
        return parameters_.size();
    }

    /**
     * <code>repeated .Parameter parameters = 2;</code>
     */
    public Parameter getParameters(int index) {
        return parameters_.get(index);
    }

    /**
     * <code>repeated .Parameter parameters = 2;</code>
     */
    public ParameterOrBuilder getParametersOrBuilder(
            int index) {
        return parameters_.get(index);
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
        if (responseTime_ != 0L) {
            output.writeInt64(1, responseTime_);
        }
        for (int i = 0; i < parameters_.size(); i++) {
            output.writeMessage(2, parameters_.get(i));
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (responseTime_ != 0L) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt64Size(1, responseTime_);
        }
        for (int i = 0; i < parameters_.size(); i++) {
            size += com.google.protobuf.CodedOutputStream
                    .computeMessageSize(2, parameters_.get(i));
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
        if (!(obj instanceof ConfigQueryResponse)) {
            return super.equals(obj);
        }
        ConfigQueryResponse other = (ConfigQueryResponse) obj;

        boolean result = true;
        result = result && (getResponseTime()
                == other.getResponseTime());
        result = result && getParametersList()
                .equals(other.getParametersList());
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + RESPONSE_TIME_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                getResponseTime());
        if (getParametersCount() > 0) {
            hash = (37 * hash) + PARAMETERS_FIELD_NUMBER;
            hash = (53 * hash) + getParametersList().hashCode();
        }
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static ConfigQueryResponse parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ConfigQueryResponse parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ConfigQueryResponse parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static ConfigQueryResponse parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static ConfigQueryResponse parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static ConfigQueryResponse parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static ConfigQueryResponse parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static ConfigQueryResponse parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static ConfigQueryResponse parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static ConfigQueryResponse parseFrom(
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

    public static Builder newBuilder(ConfigQueryResponse prototype) {
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
     * Protobuf type {@code ConfigQueryResponse}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:ConfigQueryResponse)
            ConfigQueryResponseOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ConfigQueryResponse_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ConfigQueryResponse_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            ConfigQueryResponse.class, Builder.class);
        }

        // Construct using ConfigQueryResponse.newBuilder()
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
                getParametersFieldBuilder();
            }
        }

        public Builder clear() {
            super.clear();
            responseTime_ = 0L;

            if (parametersBuilder_ == null) {
                parameters_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
            } else {
                parametersBuilder_.clear();
            }
            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_ConfigQueryResponse_descriptor;
        }

        public ConfigQueryResponse getDefaultInstanceForType() {
            return ConfigQueryResponse.getDefaultInstance();
        }

        public ConfigQueryResponse build() {
            ConfigQueryResponse result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public ConfigQueryResponse buildPartial() {
            ConfigQueryResponse result = new ConfigQueryResponse(this);
            int from_bitField0_ = bitField0_;
            int to_bitField0_ = 0;
            result.responseTime_ = responseTime_;
            if (parametersBuilder_ == null) {
                if (((bitField0_ & 0x00000002) == 0x00000002)) {
                    parameters_ = java.util.Collections.unmodifiableList(parameters_);
                    bitField0_ = (bitField0_ & ~0x00000002);
                }
                result.parameters_ = parameters_;
            } else {
                result.parameters_ = parametersBuilder_.build();
            }
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
            if (other instanceof ConfigQueryResponse) {
                return mergeFrom((ConfigQueryResponse) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(ConfigQueryResponse other) {
            if (other == ConfigQueryResponse.getDefaultInstance()) return this;
            if (other.getResponseTime() != 0L) {
                setResponseTime(other.getResponseTime());
            }
            if (parametersBuilder_ == null) {
                if (!other.parameters_.isEmpty()) {
                    if (parameters_.isEmpty()) {
                        parameters_ = other.parameters_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                    } else {
                        ensureParametersIsMutable();
                        parameters_.addAll(other.parameters_);
                    }
                    onChanged();
                }
            } else {
                if (!other.parameters_.isEmpty()) {
                    if (parametersBuilder_.isEmpty()) {
                        parametersBuilder_.dispose();
                        parametersBuilder_ = null;
                        parameters_ = other.parameters_;
                        bitField0_ = (bitField0_ & ~0x00000002);
                        parametersBuilder_ =
                                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                                        getParametersFieldBuilder() : null;
                    } else {
                        parametersBuilder_.addAllMessages(other.parameters_);
                    }
                }
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
            ConfigQueryResponse parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (ConfigQueryResponse) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int bitField0_;

        private long responseTime_;

        /**
         * <code>optional int64 response_time = 1;</code>
         */
        public long getResponseTime() {
            return responseTime_;
        }

        /**
         * <code>optional int64 response_time = 1;</code>
         */
        public Builder setResponseTime(long value) {

            responseTime_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int64 response_time = 1;</code>
         */
        public Builder clearResponseTime() {

            responseTime_ = 0L;
            onChanged();
            return this;
        }

        private java.util.List<Parameter> parameters_ =
                java.util.Collections.emptyList();

        private void ensureParametersIsMutable() {
            if (!((bitField0_ & 0x00000002) == 0x00000002)) {
                parameters_ = new java.util.ArrayList<Parameter>(parameters_);
                bitField0_ |= 0x00000002;
            }
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
                Parameter,Parameter.Builder,ParameterOrBuilder> parametersBuilder_;

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public java.util.List<Parameter> getParametersList() {
            if (parametersBuilder_ == null) {
                return java.util.Collections.unmodifiableList(parameters_);
            } else {
                return parametersBuilder_.getMessageList();
            }
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public int getParametersCount() {
            if (parametersBuilder_ == null) {
                return parameters_.size();
            } else {
                return parametersBuilder_.getCount();
            }
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Parameter getParameters(int index) {
            if (parametersBuilder_ == null) {
                return parameters_.get(index);
            } else {
                return parametersBuilder_.getMessage(index);
            }
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Builder setParameters(
                int index, Parameter value) {
            if (parametersBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureParametersIsMutable();
                parameters_.set(index, value);
                onChanged();
            } else {
                parametersBuilder_.setMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Builder setParameters(
                int index, Parameter.Builder builderForValue) {
            if (parametersBuilder_ == null) {
                ensureParametersIsMutable();
                parameters_.set(index, builderForValue.build());
                onChanged();
            } else {
                parametersBuilder_.setMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Builder addParameters(Parameter value) {
            if (parametersBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureParametersIsMutable();
                parameters_.add(value);
                onChanged();
            } else {
                parametersBuilder_.addMessage(value);
            }
            return this;
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Builder addParameters(
                int index, Parameter value) {
            if (parametersBuilder_ == null) {
                if (value == null) {
                    throw new NullPointerException();
                }
                ensureParametersIsMutable();
                parameters_.add(index, value);
                onChanged();
            } else {
                parametersBuilder_.addMessage(index, value);
            }
            return this;
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Builder addParameters(
                Parameter.Builder builderForValue) {
            if (parametersBuilder_ == null) {
                ensureParametersIsMutable();
                parameters_.add(builderForValue.build());
                onChanged();
            } else {
                parametersBuilder_.addMessage(builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Builder addParameters(
                int index, Parameter.Builder builderForValue) {
            if (parametersBuilder_ == null) {
                ensureParametersIsMutable();
                parameters_.add(index, builderForValue.build());
                onChanged();
            } else {
                parametersBuilder_.addMessage(index, builderForValue.build());
            }
            return this;
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Builder addAllParameters(
                Iterable<? extends Parameter> values) {
            if (parametersBuilder_ == null) {
                ensureParametersIsMutable();
                com.google.protobuf.AbstractMessageLite.Builder.addAll(
                        values, parameters_);
                onChanged();
            } else {
                parametersBuilder_.addAllMessages(values);
            }
            return this;
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Builder clearParameters() {
            if (parametersBuilder_ == null) {
                parameters_ = java.util.Collections.emptyList();
                bitField0_ = (bitField0_ & ~0x00000002);
                onChanged();
            } else {
                parametersBuilder_.clear();
            }
            return this;
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Builder removeParameters(int index) {
            if (parametersBuilder_ == null) {
                ensureParametersIsMutable();
                parameters_.remove(index);
                onChanged();
            } else {
                parametersBuilder_.remove(index);
            }
            return this;
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Parameter.Builder getParametersBuilder(
                int index) {
            return getParametersFieldBuilder().getBuilder(index);
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public ParameterOrBuilder getParametersOrBuilder(
                int index) {
            if (parametersBuilder_ == null) {
                return parameters_.get(index);
            } else {
                return parametersBuilder_.getMessageOrBuilder(index);
            }
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public java.util.List<? extends ParameterOrBuilder>
        getParametersOrBuilderList() {
            if (parametersBuilder_ != null) {
                return parametersBuilder_.getMessageOrBuilderList();
            } else {
                return java.util.Collections.unmodifiableList(parameters_);
            }
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Parameter.Builder addParametersBuilder() {
            return getParametersFieldBuilder().addBuilder(
                    Parameter.getDefaultInstance());
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public Parameter.Builder addParametersBuilder(
                int index) {
            return getParametersFieldBuilder().addBuilder(
                    index, Parameter.getDefaultInstance());
        }

        /**
         * <code>repeated .Parameter parameters = 2;</code>
         */
        public java.util.List<Parameter.Builder>
        getParametersBuilderList() {
            return getParametersFieldBuilder().getBuilderList();
        }

        private com.google.protobuf.RepeatedFieldBuilderV3<
                Parameter,Parameter.Builder,ParameterOrBuilder>
        getParametersFieldBuilder() {
            if (parametersBuilder_ == null) {
                parametersBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
                        Parameter,Parameter.Builder,ParameterOrBuilder>(
                        parameters_,
                        ((bitField0_ & 0x00000002) == 0x00000002),
                        getParentForChildren(),
                        isClean());
                parameters_ = null;
            }
            return parametersBuilder_;
        }

        public final Builder setUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }

        public final Builder mergeUnknownFields(
                final com.google.protobuf.UnknownFieldSet unknownFields) {
            return this;
        }


        // @@protoc_insertion_point(builder_scope:ConfigQueryResponse)
    }

    // @@protoc_insertion_point(class_scope:ConfigQueryResponse)
    private static final ConfigQueryResponse DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new ConfigQueryResponse();
    }

    public static ConfigQueryResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ConfigQueryResponse>
            PARSER = new com.google.protobuf.AbstractParser<ConfigQueryResponse>() {
        public ConfigQueryResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new ConfigQueryResponse(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<ConfigQueryResponse> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<ConfigQueryResponse> getParserForType() {
        return PARSER;
    }

    public ConfigQueryResponse getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

