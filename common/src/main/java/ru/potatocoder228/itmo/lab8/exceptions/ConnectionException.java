package ru.potatocoder228.itmo.lab8.exceptions;

public class ConnectionException extends Exception {
    public ConnectionException(String s) {
        super(s);
        System.out.println(s);
    }

    public ConnectionException() {
        super();
    }
}
