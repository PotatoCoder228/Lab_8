package ru.potatocoder228.itmo.lab8.exceptions;

public class DatabaseException extends RuntimeException {
    public DatabaseException(String str) {
        super(str);
        System.out.println(str);
    }

    public DatabaseException() {
        super();
    }
}
