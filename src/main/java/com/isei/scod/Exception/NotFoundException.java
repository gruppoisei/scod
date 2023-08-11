package com.isei.scod.Exception;


public class NotFoundException extends Exception{

    public NotFoundException() {
    }

    public NotFoundException(Class c, Integer id) {
        super(c.getName().toUpperCase() + "---Entity non trovata per id : " + id);
    }

    public NotFoundException(Class c, String user) {
        super(c.getName().toUpperCase() + "---Entity non trovata per la seguente stringa: " + user);
    }

    public NotFoundException(Class c, Class fk, String fkString) {
        super(c.getName().toUpperCase() + "---Entity non trovata per FK:" + fk.getName().toUpperCase() + " per la seguente stringa : " + fkString);
    }

    public NotFoundException(Class c, Class fk, Integer fkInt) {
        super(c.getName().toUpperCase() + "---Entity non trovata per FK:" + fk.getName().toUpperCase() + " per id : " + fkInt);
    }

}
