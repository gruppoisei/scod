package com.isei.scod.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class NotFoundException extends Exception{

    public NotFoundException() {
    }

    public NotFoundException(String message, Integer id) {
        super(message + id);
    }
}
