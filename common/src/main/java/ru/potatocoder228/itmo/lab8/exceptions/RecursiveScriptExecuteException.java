package ru.potatocoder228.itmo.lab8.exceptions;

public class RecursiveScriptExecuteException extends CommandException {
    public RecursiveScriptExecuteException() {
        super("Попытка рекурсивного выполнения скрипта.");
    }
}