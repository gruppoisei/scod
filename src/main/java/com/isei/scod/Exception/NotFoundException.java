package com.isei.scod.Exception;


public class NotFoundException extends Exception{

    public NotFoundException() {
    }

    public NotFoundException(Class c, Integer id) {
        super(c.getName().toUpperCase() + "---Entity non trovata per id : " + id);
    }
}
