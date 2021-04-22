package com.nevt.gbt32960.message;

public interface ConfigSetupRequestOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 setup_time = 1;</code>
     */
    long getSetupTime();

    /**
     * <code>repeated .Parameter parameters = 2;</code>
     */
    java.util.List<Parameter>
    getParametersList();

    /**
     * <code>repeated .Parameter parameters = 2;</code>
     */
    Parameter getParameters(int index);

    /**
     * <code>repeated .Parameter parameters = 2;</code>
     */
    int getParametersCount();

    /**
     * <code>repeated .Parameter parameters = 2;</code>
     */
    java.util.List<? extends ParameterOrBuilder>
    getParametersOrBuilderList();

    /**
     * <code>repeated .Parameter parameters = 2;</code>
     */
    ParameterOrBuilder getParametersOrBuilder(
            int index);
}
