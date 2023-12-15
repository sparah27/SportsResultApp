package com.Application.SportsResult.core.exceptions.auth;

import com.Application.SportsResult.core.exceptions.GeneralException;
import org.springframework.http.HttpStatus;

public class UnauthorizedException extends GeneralException {
    public UnauthorizedException() {
        super(HttpStatus.BAD_REQUEST.value());
    }

    public UnauthorizedException(String message) {
        super(HttpStatus.BAD_REQUEST.value(), message);
    }
}
