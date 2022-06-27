package ru.potatocoder228.itmo.lab8.commands;

@FunctionalInterface
public interface Command {
    String run(String arg);
}
