package ru.potatocoder228.itmo.lab8.exceptions;

public class WrongFieldException extends RuntimeException {
    public WrongFieldException(String s) {
        super(s);
    }

    public WrongFieldException() {
        super();
    }
}
