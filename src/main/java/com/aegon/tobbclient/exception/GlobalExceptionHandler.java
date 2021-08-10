package com.aegon.tobbclient.exception;

import com.aegon.cnf.support.rest.ResponseBuilder;
import com.aegon.cnf.support.rest.dto.ServiceResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(AcenteNotFoundException.class)
    public final ResponseEntity<ServiceResponse<String>> handleAcenteNotFoundExceptions(AcenteNotFoundException ex, WebRequest req){
        return ResponseBuilder.warning(null,ex.getMessage(), HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<ServiceResponse<String>> handleAnyExceptions(Exception ex, WebRequest req){
        return ResponseBuilder.warning(null, ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
