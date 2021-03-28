package com.jamiewang.common.exception;

public enum LoginResult implements Result {
    SUCCESS_MESSAGE(true, 110901, "login success"),
    ERROR_MESSAGE(false, 110902, "login failed"),
    USERNAME_ERROR_MESSAGE(false, 110903, "login username error"),
    VERIFY_CODE_ERROR_MESSAGE(false, 110904, "verified code error");

    String message;

    int code;

    boolean status;

    LoginResult(boolean status, int code, String message) {
        this.message = message;
        this.code = code;
        this.status = status;
    }

    @Override
    public String message() {
        return message;
    }

    @Override
    public boolean status() {
        return status;
    }

    @Override
    public int code() {
        return code;
    }
}
