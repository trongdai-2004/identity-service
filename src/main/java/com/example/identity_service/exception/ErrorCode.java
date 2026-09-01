package com.example.identity_service.exception;

public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "uncategorized errror"),
    INVALID_KEY(1001, "Invalid message key"),
    USER_EXISTSED(1002, "User Existed"),
    USERNAME_INVALID(1003,"UserName must be at leat 3 characters"),
    INVALID_PASSWORD(1004,"Password must be at leat 8 characters")
    ;

    ErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    private int code;
    private String message;

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
