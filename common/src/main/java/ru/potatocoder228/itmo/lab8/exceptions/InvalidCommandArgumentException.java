package ru.potatocoder228.itmo.lab8.exceptions;

public class InvalidCommandArgumentException extends CommandException {
    public InvalidCommandArgumentException(String s) {
        super(s);
    }
}