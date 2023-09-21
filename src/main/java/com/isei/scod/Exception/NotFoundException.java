package com.isei.scod.Exception;


public class NotFoundException extends Exception{

    public NotFoundException() {
    }

    public NotFoundException(String c, Integer id) {
        super(c.toUpperCase() + "---Entity non trovata per id : " + id);
    }

    public NotFoundException(String c, String user) {
        super(c.toUpperCase() + "---Entity non trovata per la seguente stringa: " + user);
    }

    public NotFoundException(String c, String fk, String fkString) {
        super(c.toUpperCase() + "---Entity non trovata per FK:" + fk.toUpperCase() + " per la seguente stringa : " + fkString);
    }

    public NotFoundException(String c, String fk, Integer fkInt) {
        super(c.toUpperCase() + "---Entity non trovata per FK:" + fk.toUpperCase() + " per id : " + fkInt);
    }

}
