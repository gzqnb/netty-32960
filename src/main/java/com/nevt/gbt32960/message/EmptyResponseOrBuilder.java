package com.nevt.gbt32960.message;

public interface EmptyResponseOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int32 messsage_type = 1;</code>
     */
    int getMesssageType();

    /**
     * <code>optional int32 result = 2;</code>
     */
    int getResult();

    /**
     * <code>optional bool has_time = 3;</code>
     */
    boolean getHasTime();

    /**
     * <code>optional int64 time = 4;</code>
     */
    long getTime();
}
