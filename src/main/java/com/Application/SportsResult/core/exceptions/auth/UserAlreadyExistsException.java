package com.Application.SportsResult.core.exceptions.auth;

import com.Application.SportsResult.core.exceptions.GeneralException;
import org.springframework.http.HttpStatus;

public class UserAlreadyExistsException extends GeneralException {
    public UserAlreadyExistsException(){
        super(HttpStatus.BAD_REQUEST.value());
    }
    public UserAlreadyExistsException(String message){
        super(HttpStatus.BAD_REQUEST.value(), message);
    }
}
