package com.example.identity_service.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
@Getter
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(9999, "uncategorized errror", HttpStatus.INTERNAL_SERVER_ERROR),
    INVALID_KEY(1001, "Invalid message key", HttpStatus.BAD_REQUEST),
    USER_EXISTSED(1002, "User Existed", HttpStatus.BAD_REQUEST),
    USERNAME_INVALID(1003,"UserName must be at leat 3 characters", HttpStatus.BAD_REQUEST),
    INVALID_PASSWORD(1004,"Password must be at leat 8 characters", HttpStatus.BAD_REQUEST),
    USER_NOT_EXISTSED(1005, "User not Existed",HttpStatus.NOT_FOUND),
    UNAUTHENTICATED(1006, "Unauthenticated", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED(1007, "You do not have permission", HttpStatus.FORBIDDEN),


    ;

    ErrorCode(int code, String message, HttpStatusCode statusCode) {
        this.code = code;
        this.message = message;
        this.statusCode = statusCode;
    }

    private int code;
    private String message;

    private HttpStatusCode statusCode;

}
