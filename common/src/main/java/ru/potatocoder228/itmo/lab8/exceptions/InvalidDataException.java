package ru.potatocoder228.itmo.lab8.exceptions;

public class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
        System.out.println(message);
    }
}