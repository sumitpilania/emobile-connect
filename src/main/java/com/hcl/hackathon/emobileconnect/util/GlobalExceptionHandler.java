package com.hcl.hackathon.emobileconnect.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<ExceptionResponse> handleException(Exception e){
        ExceptionResponse response = new ExceptionResponse();
        response.setErrorCode("BAD_REQUEST");
        response.setErrorMessage(e.getMessage());
        response.setTimestap(LocalDateTime.now());
        return new ResponseEntity<ExceptionResponse>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
