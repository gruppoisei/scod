package com.isei.scod.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class NotFoundException extends Exception{

    public NotFoundException() {
    }

    public NotFoundException(Class c, Integer id) {
        super(c.getName().toUpperCase() + "---Entity non trovata per id : " + id);
    }

    public NotFoundException(Class c, String user) {
        super(c.getName().toUpperCase() + "---Entity non trovata per il seguente user : " + user);
    }
}
