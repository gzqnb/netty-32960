// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbt3260.proto

package com.nevt.gbt32960.message;

public interface WarningOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.ime.iov.gbt32960.Warning)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional int64 request_time = 1;</code>
   */
  long getRequestTime();

  /**
   * <code>optional int32 level = 2;</code>
   */
  int getLevel();

  /**
   * <code>optional string content = 3;</code>
   */
  String getContent();
  /**
   * <code>optional string content = 3;</code>
   */
  com.google.protobuf.ByteString
      getContentBytes();
}