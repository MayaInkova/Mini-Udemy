package com.example.mini_udemy_service.exceptions.handler.model;

public class BadRequestException extends  RuntimeException {
    public  BadRequestException(String message) {
        super(message);
    }
}
