package com.nevt.gbt32960.message;

public interface AccessRegistrationOrBuilder extends
        com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional string vin = 1;</code>
     */
    String getVin();

    /**
     * <code>optional string vin = 1;</code>
     */
    com.google.protobuf.ByteString
    getVinBytes();

    /**
     * <code>optional .LoginRequest login = 2;</code>
     */
    LoginRequest getLogin();

    /**
     * <code>optional .LoginRequest login = 2;</code>
     */
    LoginRequestOrBuilder getLoginOrBuilder();

    /**
     * <code>optional .LogoutRequest logout = 3;</code>
     */
    LogoutRequest getLogout();

    /**
     * <code>optional .LogoutRequest logout = 3;</code>
     */
    LogoutRequestOrBuilder getLogoutOrBuilder();

    public AccessRegistration.MessageCase getMessageCase();
}
