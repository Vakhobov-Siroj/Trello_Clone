package com.example.trelloApi.exceptions;


public class GenericNotFoundException extends RuntimeException{
    public GenericNotFoundException(String message) {
        super(message);
    }

    public GenericNotFoundException(String message, Throwable throwable) {
        super(message, throwable);
    }

}
