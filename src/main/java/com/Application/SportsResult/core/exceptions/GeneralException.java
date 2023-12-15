package com.Application.SportsResult.core.exceptions;

public class GeneralException extends  RuntimeException{
    private int httpCode =500;
    public GeneralException(int httpCode){
        this.httpCode = httpCode;
    }
    public GeneralException(int httpCode, String message){
        super(message);
        this.httpCode = httpCode;
    }
    public GeneralException(Exception e){
        super(e);
    }
    public GeneralException(String message){
        super(message);
    }
}
