package com.example.mini_udemy_service.exceptions.handler;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class ExceptionHandlerLogger {

    public void error(String message, Throwable throwable) {
        log.error(message, throwable);
    }
}