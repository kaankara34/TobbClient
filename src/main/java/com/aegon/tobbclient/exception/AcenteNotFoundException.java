package com.aegon.tobbclient.exception;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class AcenteNotFoundException extends RuntimeException{
    private String message;
    private String details;
    private Integer status;

    public AcenteNotFoundException(String message) {
        this.message = message;
    }

    public AcenteNotFoundException(String message, String details, Integer status) {
        this.message = message;
        this.details = details;
        this.status = status;
    }
}
