package com.Application.SportsResult.core.exceptions.auth;

import com.Application.SportsResult.core.exceptions.GeneralException;
import org.springframework.http.HttpStatus;

public class InvalidParametersSentException extends GeneralException {
    public InvalidParametersSentException(){
        super(HttpStatus.BAD_REQUEST.value());
    }
    public InvalidParametersSentException(String message){
        super(HttpStatus.BAD_REQUEST.value(), message);
    }
}
