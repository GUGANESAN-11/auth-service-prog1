package com.doodleloginJWT.Project1.common;


public class AccessDeniedException extends RuntimeException{
    
    public AccessDeniedException(String message){
        super(message);
    }
    
}