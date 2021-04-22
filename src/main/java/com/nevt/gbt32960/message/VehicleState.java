package com.nevt.gbt32960.message;

/**
 * Protobuf type {@code VehicleState}
 */
public final class VehicleState extends
        com.google.protobuf.GeneratedMessageV3 implements
        VehicleStateOrBuilder {
    private VehicleState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private VehicleState() {
        operatingState_ = 0;
        chargingState_ = 0;
        operationMode_ = 0;
        speed_ = 0F;
        mileage_ = 0D;
        voltage_ = 0F;
        current_ = 0F;
        stateOfCharge_ = 0;
        dcInverterState_ = 0;
        gearPosition_ = 0;
        insulance_ = 0;
        acceleratorTravel_ = 0;
        brakeTravel_ = 0;
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
        return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
    }

    private VehicleState(
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
                        int rawValue = input.readEnum();

                        operatingState_ = rawValue;
                        break;
                    }
                    case 16: {
                        int rawValue = input.readEnum();

                        chargingState_ = rawValue;
                        break;
                    }
                    case 24: {
                        int rawValue = input.readEnum();

                        operationMode_ = rawValue;
                        break;
                    }
                    case 37: {

                        speed_ = input.readFloat();
                        break;
                    }
                    case 41: {

                        mileage_ = input.readDouble();
                        break;
                    }
                    case 53: {

                        voltage_ = input.readFloat();
                        break;
                    }
                    case 61: {

                        current_ = input.readFloat();
                        break;
                    }
                    case 64: {

                        stateOfCharge_ = input.readInt32();
                        break;
                    }
                    case 72: {
                        int rawValue = input.readEnum();

                        dcInverterState_ = rawValue;
                        break;
                    }
                    case 80: {

                        gearPosition_ = input.readInt32();
                        break;
                    }
                    case 88: {

                        insulance_ = input.readInt32();
                        break;
                    }
                    case 96: {

                        acceleratorTravel_ = input.readInt32();
                        break;
                    }
                    case 104: {

                        brakeTravel_ = input.readInt32();
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
        return Gbt3260.internal_static_com_ime_iov_gbt32960_VehicleState_descriptor;
    }

    protected FieldAccessorTable
    internalGetFieldAccessorTable() {
        return Gbt3260.internal_static_com_ime_iov_gbt32960_VehicleState_fieldAccessorTable
                .ensureFieldAccessorsInitialized(
                        VehicleState.class, Builder.class);
    }

    /**
     * Protobuf enum {@code VehicleState.OperatingState}
     */
    public enum OperatingState
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
         * <code>RUN = 1;</code>
         */
        RUN(1),
        /**
         * <code>CLOSE = 2;</code>
         */
        CLOSE(2),
        /**
         * <code>OTHER = 3;</code>
         */
        OTHER(3),
        /**
         * <code>OP_EXCEPTION = 254;</code>
         */
        OP_EXCEPTION(254),
        /**
         * <code>OP_INVALID = 255;</code>
         */
        OP_INVALID(255),
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
         * <code>RUN = 1;</code>
         */
        public static final int RUN_VALUE = 1;
        /**
         * <code>CLOSE = 2;</code>
         */
        public static final int CLOSE_VALUE = 2;
        /**
         * <code>OTHER = 3;</code>
         */
        public static final int OTHER_VALUE = 3;
        /**
         * <code>OP_EXCEPTION = 254;</code>
         */
        public static final int OP_EXCEPTION_VALUE = 254;
        /**
         * <code>OP_INVALID = 255;</code>
         */
        public static final int OP_INVALID_VALUE = 255;


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
        public static OperatingState valueOf(int value) {
            return forNumber(value);
        }

        public static OperatingState forNumber(int value) {
            switch (value) {
                case 0:
                    return _1;
                case 1:
                    return RUN;
                case 2:
                    return CLOSE;
                case 3:
                    return OTHER;
                case 254:
                    return OP_EXCEPTION;
                case 255:
                    return OP_INVALID;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<OperatingState>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                OperatingState> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<OperatingState>() {
                    public OperatingState findValueByNumber(int number) {
                        return OperatingState.forNumber(number);
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
            return VehicleState.getDescriptor().getEnumTypes().get(0);
        }

        private static final OperatingState[] VALUES = values();

        public static OperatingState valueOf(
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

        private OperatingState(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:VehicleState.OperatingState)
    }

    /**
     * Protobuf enum {@code VehicleState.ChargeState}
     */
    public enum ChargeState
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <pre>
         * unused
         * </pre>
         *
         * <code>_2 = 0;</code>
         */
        _2(0),
        /**
         * <code>PARKING = 1;</code>
         */
        PARKING(1),
        /**
         * <code>DRIVING = 2;</code>
         */
        DRIVING(2),
        /**
         * <code>OUTAGE = 3;</code>
         */
        OUTAGE(3),
        /**
         * <code>COMPLETED = 4;</code>
         */
        COMPLETED(4),
        /**
         * <code>CHARGE_EXCEPTION = 254;</code>
         */
        CHARGE_EXCEPTION(254),
        /**
         * <code>CHARGE_INVALID = 255;</code>
         */
        CHARGE_INVALID(255),
        UNRECOGNIZED(-1),
        ;

        /**
         * <pre>
         * unused
         * </pre>
         *
         * <code>_2 = 0;</code>
         */
        public static final int _2_VALUE = 0;
        /**
         * <code>PARKING = 1;</code>
         */
        public static final int PARKING_VALUE = 1;
        /**
         * <code>DRIVING = 2;</code>
         */
        public static final int DRIVING_VALUE = 2;
        /**
         * <code>OUTAGE = 3;</code>
         */
        public static final int OUTAGE_VALUE = 3;
        /**
         * <code>COMPLETED = 4;</code>
         */
        public static final int COMPLETED_VALUE = 4;
        /**
         * <code>CHARGE_EXCEPTION = 254;</code>
         */
        public static final int CHARGE_EXCEPTION_VALUE = 254;
        /**
         * <code>CHARGE_INVALID = 255;</code>
         */
        public static final int CHARGE_INVALID_VALUE = 255;


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
        public static ChargeState valueOf(int value) {
            return forNumber(value);
        }

        public static ChargeState forNumber(int value) {
            switch (value) {
                case 0:
                    return _2;
                case 1:
                    return PARKING;
                case 2:
                    return DRIVING;
                case 3:
                    return OUTAGE;
                case 4:
                    return COMPLETED;
                case 254:
                    return CHARGE_EXCEPTION;
                case 255:
                    return CHARGE_INVALID;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<ChargeState>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                ChargeState> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<ChargeState>() {
                    public ChargeState findValueByNumber(int number) {
                        return ChargeState.forNumber(number);
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
            return VehicleState.getDescriptor().getEnumTypes().get(1);
        }

        private static final ChargeState[] VALUES = values();

        public static ChargeState valueOf(
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

        private ChargeState(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:VehicleState.ChargeState)
    }

    /**
     * Protobuf enum {@code VehicleState.OperationMode}
     */
    public enum OperationMode
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <pre>
         * unused
         * </pre>
         *
         * <code>_3 = 0;</code>
         */
        _3(0),
        /**
         * <code>ELECTRIC_ONLY = 1;</code>
         */
        ELECTRIC_ONLY(1),
        /**
         * <code>MIXED = 2;</code>
         */
        MIXED(2),
        /**
         * <code>FUEL_ONLY = 3;</code>
         */
        FUEL_ONLY(3),
        /**
         * <code>OM_EXCEPTION = 254;</code>
         */
        OM_EXCEPTION(254),
        /**
         * <code>OM_INVALID = 255;</code>
         */
        OM_INVALID(255),
        UNRECOGNIZED(-1),
        ;

        /**
         * <pre>
         * unused
         * </pre>
         *
         * <code>_3 = 0;</code>
         */
        public static final int _3_VALUE = 0;
        /**
         * <code>ELECTRIC_ONLY = 1;</code>
         */
        public static final int ELECTRIC_ONLY_VALUE = 1;
        /**
         * <code>MIXED = 2;</code>
         */
        public static final int MIXED_VALUE = 2;
        /**
         * <code>FUEL_ONLY = 3;</code>
         */
        public static final int FUEL_ONLY_VALUE = 3;
        /**
         * <code>OM_EXCEPTION = 254;</code>
         */
        public static final int OM_EXCEPTION_VALUE = 254;
        /**
         * <code>OM_INVALID = 255;</code>
         */
        public static final int OM_INVALID_VALUE = 255;


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
        public static OperationMode valueOf(int value) {
            return forNumber(value);
        }

        public static OperationMode forNumber(int value) {
            switch (value) {
                case 0:
                    return _3;
                case 1:
                    return ELECTRIC_ONLY;
                case 2:
                    return MIXED;
                case 3:
                    return FUEL_ONLY;
                case 254:
                    return OM_EXCEPTION;
                case 255:
                    return OM_INVALID;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<OperationMode>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                OperationMode> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<OperationMode>() {
                    public OperationMode findValueByNumber(int number) {
                        return OperationMode.forNumber(number);
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
            return VehicleState.getDescriptor().getEnumTypes().get(2);
        }

        private static final OperationMode[] VALUES = values();

        public static OperationMode valueOf(
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

        private OperationMode(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:VehicleState.OperationMode)
    }

    /**
     * Protobuf enum {@code VehicleState.DcInverterState}
     */
    public enum DcInverterState
            implements com.google.protobuf.ProtocolMessageEnum {
        /**
         * <pre>
         * unused
         * </pre>
         *
         * <code>_4 = 0;</code>
         */
        _4(0),
        /**
         * <code>ON = 1;</code>
         */
        ON(1),
        /**
         * <code>OFF = 2;</code>
         */
        OFF(2),
        /**
         * <code>DC_EXCEPTION = 254;</code>
         */
        DC_EXCEPTION(254),
        /**
         * <code>DC_INVALID = 255;</code>
         */
        DC_INVALID(255),
        UNRECOGNIZED(-1),
        ;

        /**
         * <pre>
         * unused
         * </pre>
         *
         * <code>_4 = 0;</code>
         */
        public static final int _4_VALUE = 0;
        /**
         * <code>ON = 1;</code>
         */
        public static final int ON_VALUE = 1;
        /**
         * <code>OFF = 2;</code>
         */
        public static final int OFF_VALUE = 2;
        /**
         * <code>DC_EXCEPTION = 254;</code>
         */
        public static final int DC_EXCEPTION_VALUE = 254;
        /**
         * <code>DC_INVALID = 255;</code>
         */
        public static final int DC_INVALID_VALUE = 255;


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
        public static DcInverterState valueOf(int value) {
            return forNumber(value);
        }

        public static DcInverterState forNumber(int value) {
            switch (value) {
                case 0:
                    return _4;
                case 1:
                    return ON;
                case 2:
                    return OFF;
                case 254:
                    return DC_EXCEPTION;
                case 255:
                    return DC_INVALID;
                default:
                    return null;
            }
        }

        public static com.google.protobuf.Internal.EnumLiteMap<DcInverterState>
        internalGetValueMap() {
            return internalValueMap;
        }

        private static final com.google.protobuf.Internal.EnumLiteMap<
                DcInverterState> internalValueMap =
                new com.google.protobuf.Internal.EnumLiteMap<DcInverterState>() {
                    public DcInverterState findValueByNumber(int number) {
                        return DcInverterState.forNumber(number);
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
            return VehicleState.getDescriptor().getEnumTypes().get(3);
        }

        private static final DcInverterState[] VALUES = values();

        public static DcInverterState valueOf(
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

        private DcInverterState(int value) {
            this.value = value;
        }

        // @@protoc_insertion_point(enum_scope:VehicleState.DcInverterState)
    }

    public static final int OPERATING_STATE_FIELD_NUMBER = 1;
    private int operatingState_;

    /**
     * <code>optional .VehicleState.OperatingState operating_state = 1;</code>
     */
    public int getOperatingStateValue() {
        return operatingState_;
    }

    /**
     * <code>optional .VehicleState.OperatingState operating_state = 1;</code>
     */
    public OperatingState getOperatingState() {
        OperatingState result = OperatingState.valueOf(operatingState_);
        return result == null ? OperatingState.UNRECOGNIZED : result;
    }

    public static final int CHARGING_STATE_FIELD_NUMBER = 2;
    private int chargingState_;

    /**
     * <code>optional .VehicleState.ChargeState charging_State = 2;</code>
     */
    public int getChargingStateValue() {
        return chargingState_;
    }

    /**
     * <code>optional .VehicleState.ChargeState charging_State = 2;</code>
     */
    public ChargeState getChargingState() {
        ChargeState result = ChargeState.valueOf(chargingState_);
        return result == null ? ChargeState.UNRECOGNIZED : result;
    }

    public static final int OPERATION_MODE_FIELD_NUMBER = 3;
    private int operationMode_;

    /**
     * <code>optional .VehicleState.OperationMode operation_mode = 3;</code>
     */
    public int getOperationModeValue() {
        return operationMode_;
    }

    /**
     * <code>optional .VehicleState.OperationMode operation_mode = 3;</code>
     */
    public OperationMode getOperationMode() {
        OperationMode result = OperationMode.valueOf(operationMode_);
        return result == null ? OperationMode.UNRECOGNIZED : result;
    }

    public static final int SPEED_FIELD_NUMBER = 4;
    private float speed_;

    /**
     * <code>optional float speed = 4;</code>
     */
    public float getSpeed() {
        return speed_;
    }

    public static final int MILEAGE_FIELD_NUMBER = 5;
    private double mileage_;

    /**
     * <code>optional double mileage = 5;</code>
     */
    public double getMileage() {
        return mileage_;
    }

    public static final int VOLTAGE_FIELD_NUMBER = 6;
    private float voltage_;

    /**
     * <code>optional float voltage = 6;</code>
     */
    public float getVoltage() {
        return voltage_;
    }

    public static final int CURRENT_FIELD_NUMBER = 7;
    private float current_;

    /**
     * <code>optional float current = 7;</code>
     */
    public float getCurrent() {
        return current_;
    }

    public static final int STATE_OF_CHARGE_FIELD_NUMBER = 8;
    private int stateOfCharge_;

    /**
     * <code>optional int32 state_of_charge = 8;</code>
     */
    public int getStateOfCharge() {
        return stateOfCharge_;
    }

    public static final int DC_INVERTER_STATE_FIELD_NUMBER = 9;
    private int dcInverterState_;

    /**
     * <code>optional .VehicleState.DcInverterState dc_inverter_state = 9;</code>
     */
    public int getDcInverterStateValue() {
        return dcInverterState_;
    }

    /**
     * <code>optional .VehicleState.DcInverterState dc_inverter_state = 9;</code>
     */
    public DcInverterState getDcInverterState() {
        DcInverterState result = DcInverterState.valueOf(dcInverterState_);
        return result == null ? DcInverterState.UNRECOGNIZED : result;
    }

    public static final int GEAR_POSITION_FIELD_NUMBER = 10;
    private int gearPosition_;

    /**
     * <code>optional int32 gear_position = 10;</code>
     */
    public int getGearPosition() {
        return gearPosition_;
    }

    public static final int INSULANCE_FIELD_NUMBER = 11;
    private int insulance_;

    /**
     * <code>optional int32 insulance = 11;</code>
     */
    public int getInsulance() {
        return insulance_;
    }

    public static final int ACCELERATOR_TRAVEL_FIELD_NUMBER = 12;
    private int acceleratorTravel_;

    /**
     * <pre>
     * 加速踏板行程
     * </pre>
     *
     * <code>optional int32 accelerator_travel = 12;</code>
     */
    public int getAcceleratorTravel() {
        return acceleratorTravel_;
    }

    public static final int BRAKE_TRAVEL_FIELD_NUMBER = 13;
    private int brakeTravel_;

    /**
     * <pre>
     * 刹车踏板行程
     * </pre>
     *
     * <code>optional int32 brake_travel = 13;</code>
     */
    public int getBrakeTravel() {
        return brakeTravel_;
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
        if (operatingState_ != OperatingState._1.getNumber()) {
            output.writeEnum(1, operatingState_);
        }
        if (chargingState_ != ChargeState._2.getNumber()) {
            output.writeEnum(2, chargingState_);
        }
        if (operationMode_ != OperationMode._3.getNumber()) {
            output.writeEnum(3, operationMode_);
        }
        if (speed_ != 0F) {
            output.writeFloat(4, speed_);
        }
        if (mileage_ != 0D) {
            output.writeDouble(5, mileage_);
        }
        if (voltage_ != 0F) {
            output.writeFloat(6, voltage_);
        }
        if (current_ != 0F) {
            output.writeFloat(7, current_);
        }
        if (stateOfCharge_ != 0) {
            output.writeInt32(8, stateOfCharge_);
        }
        if (dcInverterState_ != DcInverterState._4.getNumber()) {
            output.writeEnum(9, dcInverterState_);
        }
        if (gearPosition_ != 0) {
            output.writeInt32(10, gearPosition_);
        }
        if (insulance_ != 0) {
            output.writeInt32(11, insulance_);
        }
        if (acceleratorTravel_ != 0) {
            output.writeInt32(12, acceleratorTravel_);
        }
        if (brakeTravel_ != 0) {
            output.writeInt32(13, brakeTravel_);
        }
    }

    public int getSerializedSize() {
        int size = memoizedSize;
        if (size != -1) return size;

        size = 0;
        if (operatingState_ != OperatingState._1.getNumber()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(1, operatingState_);
        }
        if (chargingState_ != ChargeState._2.getNumber()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(2, chargingState_);
        }
        if (operationMode_ != OperationMode._3.getNumber()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(3, operationMode_);
        }
        if (speed_ != 0F) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(4, speed_);
        }
        if (mileage_ != 0D) {
            size += com.google.protobuf.CodedOutputStream
                    .computeDoubleSize(5, mileage_);
        }
        if (voltage_ != 0F) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(6, voltage_);
        }
        if (current_ != 0F) {
            size += com.google.protobuf.CodedOutputStream
                    .computeFloatSize(7, current_);
        }
        if (stateOfCharge_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(8, stateOfCharge_);
        }
        if (dcInverterState_ != DcInverterState._4.getNumber()) {
            size += com.google.protobuf.CodedOutputStream
                    .computeEnumSize(9, dcInverterState_);
        }
        if (gearPosition_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(10, gearPosition_);
        }
        if (insulance_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(11, insulance_);
        }
        if (acceleratorTravel_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(12, acceleratorTravel_);
        }
        if (brakeTravel_ != 0) {
            size += com.google.protobuf.CodedOutputStream
                    .computeInt32Size(13, brakeTravel_);
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
        if (!(obj instanceof VehicleState)) {
            return super.equals(obj);
        }
        VehicleState other = (VehicleState) obj;

        boolean result = true;
        result = result && operatingState_ == other.operatingState_;
        result = result && chargingState_ == other.chargingState_;
        result = result && operationMode_ == other.operationMode_;
        result = result && (
                Float.floatToIntBits(getSpeed())
                        == Float.floatToIntBits(
                        other.getSpeed()));
        result = result && (
                Double.doubleToLongBits(getMileage())
                        == Double.doubleToLongBits(
                        other.getMileage()));
        result = result && (
                Float.floatToIntBits(getVoltage())
                        == Float.floatToIntBits(
                        other.getVoltage()));
        result = result && (
                Float.floatToIntBits(getCurrent())
                        == Float.floatToIntBits(
                        other.getCurrent()));
        result = result && (getStateOfCharge()
                == other.getStateOfCharge());
        result = result && dcInverterState_ == other.dcInverterState_;
        result = result && (getGearPosition()
                == other.getGearPosition());
        result = result && (getInsulance()
                == other.getInsulance());
        result = result && (getAcceleratorTravel()
                == other.getAcceleratorTravel());
        result = result && (getBrakeTravel()
                == other.getBrakeTravel());
        return result;
    }

    @Override
    public int hashCode() {
        if (memoizedHashCode != 0) {
            return memoizedHashCode;
        }
        int hash = 41;
        hash = (19 * hash) + getDescriptorForType().hashCode();
        hash = (37 * hash) + OPERATING_STATE_FIELD_NUMBER;
        hash = (53 * hash) + operatingState_;
        hash = (37 * hash) + CHARGING_STATE_FIELD_NUMBER;
        hash = (53 * hash) + chargingState_;
        hash = (37 * hash) + OPERATION_MODE_FIELD_NUMBER;
        hash = (53 * hash) + operationMode_;
        hash = (37 * hash) + SPEED_FIELD_NUMBER;
        hash = (53 * hash) + Float.floatToIntBits(
                getSpeed());
        hash = (37 * hash) + MILEAGE_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
                Double.doubleToLongBits(getMileage()));
        hash = (37 * hash) + VOLTAGE_FIELD_NUMBER;
        hash = (53 * hash) + Float.floatToIntBits(
                getVoltage());
        hash = (37 * hash) + CURRENT_FIELD_NUMBER;
        hash = (53 * hash) + Float.floatToIntBits(
                getCurrent());
        hash = (37 * hash) + STATE_OF_CHARGE_FIELD_NUMBER;
        hash = (53 * hash) + getStateOfCharge();
        hash = (37 * hash) + DC_INVERTER_STATE_FIELD_NUMBER;
        hash = (53 * hash) + dcInverterState_;
        hash = (37 * hash) + GEAR_POSITION_FIELD_NUMBER;
        hash = (53 * hash) + getGearPosition();
        hash = (37 * hash) + INSULANCE_FIELD_NUMBER;
        hash = (53 * hash) + getInsulance();
        hash = (37 * hash) + ACCELERATOR_TRAVEL_FIELD_NUMBER;
        hash = (53 * hash) + getAcceleratorTravel();
        hash = (37 * hash) + BRAKE_TRAVEL_FIELD_NUMBER;
        hash = (53 * hash) + getBrakeTravel();
        hash = (29 * hash) + unknownFields.hashCode();
        memoizedHashCode = hash;
        return hash;
    }

    public static VehicleState parseFrom(
            com.google.protobuf.ByteString data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static VehicleState parseFrom(
            com.google.protobuf.ByteString data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static VehicleState parseFrom(byte[] data)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data);
    }

    public static VehicleState parseFrom(
            byte[] data,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
        return PARSER.parseFrom(data, extensionRegistry);
    }

    public static VehicleState parseFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static VehicleState parseFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static VehicleState parseDelimitedFrom(java.io.InputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input);
    }

    public static VehicleState parseDelimitedFrom(
            java.io.InputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }

    public static VehicleState parseFrom(
            com.google.protobuf.CodedInputStream input)
            throws java.io.IOException {
        return com.google.protobuf.GeneratedMessageV3
                .parseWithIOException(PARSER, input);
    }

    public static VehicleState parseFrom(
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

    public static Builder newBuilder(VehicleState prototype) {
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
     * Protobuf type {@code VehicleState}
     */
    public static final class Builder extends
            com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
            // @@protoc_insertion_point(builder_implements:VehicleState)
            VehicleStateOrBuilder {
        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_VehicleState_descriptor;
        }

        protected FieldAccessorTable
        internalGetFieldAccessorTable() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_VehicleState_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            VehicleState.class, Builder.class);
        }

        // Construct using VehicleState.newBuilder()
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
            operatingState_ = 0;

            chargingState_ = 0;

            operationMode_ = 0;

            speed_ = 0F;

            mileage_ = 0D;

            voltage_ = 0F;

            current_ = 0F;

            stateOfCharge_ = 0;

            dcInverterState_ = 0;

            gearPosition_ = 0;

            insulance_ = 0;

            acceleratorTravel_ = 0;

            brakeTravel_ = 0;

            return this;
        }

        public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
            return Gbt3260.internal_static_com_ime_iov_gbt32960_VehicleState_descriptor;
        }

        public VehicleState getDefaultInstanceForType() {
            return VehicleState.getDefaultInstance();
        }

        public VehicleState build() {
            VehicleState result = buildPartial();
            if (!result.isInitialized()) {
                throw newUninitializedMessageException(result);
            }
            return result;
        }

        public VehicleState buildPartial() {
            VehicleState result = new VehicleState(this);
            result.operatingState_ = operatingState_;
            result.chargingState_ = chargingState_;
            result.operationMode_ = operationMode_;
            result.speed_ = speed_;
            result.mileage_ = mileage_;
            result.voltage_ = voltage_;
            result.current_ = current_;
            result.stateOfCharge_ = stateOfCharge_;
            result.dcInverterState_ = dcInverterState_;
            result.gearPosition_ = gearPosition_;
            result.insulance_ = insulance_;
            result.acceleratorTravel_ = acceleratorTravel_;
            result.brakeTravel_ = brakeTravel_;
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
            if (other instanceof VehicleState) {
                return mergeFrom((VehicleState) other);
            } else {
                super.mergeFrom(other);
                return this;
            }
        }

        public Builder mergeFrom(VehicleState other) {
            if (other == VehicleState.getDefaultInstance()) return this;
            if (other.operatingState_ != 0) {
                setOperatingStateValue(other.getOperatingStateValue());
            }
            if (other.chargingState_ != 0) {
                setChargingStateValue(other.getChargingStateValue());
            }
            if (other.operationMode_ != 0) {
                setOperationModeValue(other.getOperationModeValue());
            }
            if (other.getSpeed() != 0F) {
                setSpeed(other.getSpeed());
            }
            if (other.getMileage() != 0D) {
                setMileage(other.getMileage());
            }
            if (other.getVoltage() != 0F) {
                setVoltage(other.getVoltage());
            }
            if (other.getCurrent() != 0F) {
                setCurrent(other.getCurrent());
            }
            if (other.getStateOfCharge() != 0) {
                setStateOfCharge(other.getStateOfCharge());
            }
            if (other.dcInverterState_ != 0) {
                setDcInverterStateValue(other.getDcInverterStateValue());
            }
            if (other.getGearPosition() != 0) {
                setGearPosition(other.getGearPosition());
            }
            if (other.getInsulance() != 0) {
                setInsulance(other.getInsulance());
            }
            if (other.getAcceleratorTravel() != 0) {
                setAcceleratorTravel(other.getAcceleratorTravel());
            }
            if (other.getBrakeTravel() != 0) {
                setBrakeTravel(other.getBrakeTravel());
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
            VehicleState parsedMessage = null;
            try {
                parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                parsedMessage = (VehicleState) e.getUnfinishedMessage();
                throw e.unwrapIOException();
            } finally {
                if (parsedMessage != null) {
                    mergeFrom(parsedMessage);
                }
            }
            return this;
        }

        private int operatingState_ = 0;

        /**
         * <code>optional .VehicleState.OperatingState operating_state = 1;</code>
         */
        public int getOperatingStateValue() {
            return operatingState_;
        }

        /**
         * <code>optional .VehicleState.OperatingState operating_state = 1;</code>
         */
        public Builder setOperatingStateValue(int value) {
            operatingState_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional .VehicleState.OperatingState operating_state = 1;</code>
         */
        public OperatingState getOperatingState() {
            OperatingState result = OperatingState.valueOf(operatingState_);
            return result == null ? OperatingState.UNRECOGNIZED : result;
        }

        /**
         * <code>optional .VehicleState.OperatingState operating_state = 1;</code>
         */
        public Builder setOperatingState(OperatingState value) {
            if (value == null) {
                throw new NullPointerException();
            }

            operatingState_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <code>optional .VehicleState.OperatingState operating_state = 1;</code>
         */
        public Builder clearOperatingState() {

            operatingState_ = 0;
            onChanged();
            return this;
        }

        private int chargingState_ = 0;

        /**
         * <code>optional .VehicleState.ChargeState charging_State = 2;</code>
         */
        public int getChargingStateValue() {
            return chargingState_;
        }

        /**
         * <code>optional .VehicleState.ChargeState charging_State = 2;</code>
         */
        public Builder setChargingStateValue(int value) {
            chargingState_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional .VehicleState.ChargeState charging_State = 2;</code>
         */
        public ChargeState getChargingState() {
            ChargeState result = ChargeState.valueOf(chargingState_);
            return result == null ? ChargeState.UNRECOGNIZED : result;
        }

        /**
         * <code>optional .VehicleState.ChargeState charging_State = 2;</code>
         */
        public Builder setChargingState(ChargeState value) {
            if (value == null) {
                throw new NullPointerException();
            }

            chargingState_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <code>optional .VehicleState.ChargeState charging_State = 2;</code>
         */
        public Builder clearChargingState() {

            chargingState_ = 0;
            onChanged();
            return this;
        }

        private int operationMode_ = 0;

        /**
         * <code>optional .VehicleState.OperationMode operation_mode = 3;</code>
         */
        public int getOperationModeValue() {
            return operationMode_;
        }

        /**
         * <code>optional .VehicleState.OperationMode operation_mode = 3;</code>
         */
        public Builder setOperationModeValue(int value) {
            operationMode_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional .VehicleState.OperationMode operation_mode = 3;</code>
         */
        public OperationMode getOperationMode() {
            OperationMode result = OperationMode.valueOf(operationMode_);
            return result == null ? OperationMode.UNRECOGNIZED : result;
        }

        /**
         * <code>optional .VehicleState.OperationMode operation_mode = 3;</code>
         */
        public Builder setOperationMode(OperationMode value) {
            if (value == null) {
                throw new NullPointerException();
            }

            operationMode_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <code>optional .VehicleState.OperationMode operation_mode = 3;</code>
         */
        public Builder clearOperationMode() {

            operationMode_ = 0;
            onChanged();
            return this;
        }

        private float speed_;

        /**
         * <code>optional float speed = 4;</code>
         */
        public float getSpeed() {
            return speed_;
        }

        /**
         * <code>optional float speed = 4;</code>
         */
        public Builder setSpeed(float value) {

            speed_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional float speed = 4;</code>
         */
        public Builder clearSpeed() {

            speed_ = 0F;
            onChanged();
            return this;
        }

        private double mileage_;

        /**
         * <code>optional double mileage = 5;</code>
         */
        public double getMileage() {
            return mileage_;
        }

        /**
         * <code>optional double mileage = 5;</code>
         */
        public Builder setMileage(double value) {

            mileage_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional double mileage = 5;</code>
         */
        public Builder clearMileage() {

            mileage_ = 0D;
            onChanged();
            return this;
        }

        private float voltage_;

        /**
         * <code>optional float voltage = 6;</code>
         */
        public float getVoltage() {
            return voltage_;
        }

        /**
         * <code>optional float voltage = 6;</code>
         */
        public Builder setVoltage(float value) {

            voltage_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional float voltage = 6;</code>
         */
        public Builder clearVoltage() {

            voltage_ = 0F;
            onChanged();
            return this;
        }

        private float current_;

        /**
         * <code>optional float current = 7;</code>
         */
        public float getCurrent() {
            return current_;
        }

        /**
         * <code>optional float current = 7;</code>
         */
        public Builder setCurrent(float value) {

            current_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional float current = 7;</code>
         */
        public Builder clearCurrent() {

            current_ = 0F;
            onChanged();
            return this;
        }

        private int stateOfCharge_;

        /**
         * <code>optional int32 state_of_charge = 8;</code>
         */
        public int getStateOfCharge() {
            return stateOfCharge_;
        }

        /**
         * <code>optional int32 state_of_charge = 8;</code>
         */
        public Builder setStateOfCharge(int value) {

            stateOfCharge_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 state_of_charge = 8;</code>
         */
        public Builder clearStateOfCharge() {

            stateOfCharge_ = 0;
            onChanged();
            return this;
        }

        private int dcInverterState_ = 0;

        /**
         * <code>optional .VehicleState.DcInverterState dc_inverter_state = 9;</code>
         */
        public int getDcInverterStateValue() {
            return dcInverterState_;
        }

        /**
         * <code>optional .VehicleState.DcInverterState dc_inverter_state = 9;</code>
         */
        public Builder setDcInverterStateValue(int value) {
            dcInverterState_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional .VehicleState.DcInverterState dc_inverter_state = 9;</code>
         */
        public DcInverterState getDcInverterState() {
            DcInverterState result = DcInverterState.valueOf(dcInverterState_);
            return result == null ? DcInverterState.UNRECOGNIZED : result;
        }

        /**
         * <code>optional .VehicleState.DcInverterState dc_inverter_state = 9;</code>
         */
        public Builder setDcInverterState(DcInverterState value) {
            if (value == null) {
                throw new NullPointerException();
            }

            dcInverterState_ = value.getNumber();
            onChanged();
            return this;
        }

        /**
         * <code>optional .VehicleState.DcInverterState dc_inverter_state = 9;</code>
         */
        public Builder clearDcInverterState() {

            dcInverterState_ = 0;
            onChanged();
            return this;
        }

        private int gearPosition_;

        /**
         * <code>optional int32 gear_position = 10;</code>
         */
        public int getGearPosition() {
            return gearPosition_;
        }

        /**
         * <code>optional int32 gear_position = 10;</code>
         */
        public Builder setGearPosition(int value) {

            gearPosition_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 gear_position = 10;</code>
         */
        public Builder clearGearPosition() {

            gearPosition_ = 0;
            onChanged();
            return this;
        }

        private int insulance_;

        /**
         * <code>optional int32 insulance = 11;</code>
         */
        public int getInsulance() {
            return insulance_;
        }

        /**
         * <code>optional int32 insulance = 11;</code>
         */
        public Builder setInsulance(int value) {

            insulance_ = value;
            onChanged();
            return this;
        }

        /**
         * <code>optional int32 insulance = 11;</code>
         */
        public Builder clearInsulance() {

            insulance_ = 0;
            onChanged();
            return this;
        }

        private int acceleratorTravel_;

        /**
         * <pre>
         * 加速踏板行程
         * </pre>
         *
         * <code>optional int32 accelerator_travel = 12;</code>
         */
        public int getAcceleratorTravel() {
            return acceleratorTravel_;
        }

        /**
         * <pre>
         * 加速踏板行程
         * </pre>
         *
         * <code>optional int32 accelerator_travel = 12;</code>
         */
        public Builder setAcceleratorTravel(int value) {

            acceleratorTravel_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 加速踏板行程
         * </pre>
         *
         * <code>optional int32 accelerator_travel = 12;</code>
         */
        public Builder clearAcceleratorTravel() {

            acceleratorTravel_ = 0;
            onChanged();
            return this;
        }

        private int brakeTravel_;

        /**
         * <pre>
         * 刹车踏板行程
         * </pre>
         *
         * <code>optional int32 brake_travel = 13;</code>
         */
        public int getBrakeTravel() {
            return brakeTravel_;
        }

        /**
         * <pre>
         * 刹车踏板行程
         * </pre>
         *
         * <code>optional int32 brake_travel = 13;</code>
         */
        public Builder setBrakeTravel(int value) {

            brakeTravel_ = value;
            onChanged();
            return this;
        }

        /**
         * <pre>
         * 刹车踏板行程
         * </pre>
         *
         * <code>optional int32 brake_travel = 13;</code>
         */
        public Builder clearBrakeTravel() {

            brakeTravel_ = 0;
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

    private static final VehicleState DEFAULT_INSTANCE;

    static {
        DEFAULT_INSTANCE = new VehicleState();
    }

    public static VehicleState getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VehicleState>
            PARSER = new com.google.protobuf.AbstractParser<VehicleState>() {
        public VehicleState parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return new VehicleState(input, extensionRegistry);
        }
    };

    public static com.google.protobuf.Parser<VehicleState> parser() {
        return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<VehicleState> getParserForType() {
        return PARSER;
    }

    public VehicleState getDefaultInstanceForType() {
        return DEFAULT_INSTANCE;
    }

}

