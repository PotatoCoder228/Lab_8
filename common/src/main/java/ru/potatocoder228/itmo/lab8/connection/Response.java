package ru.potatocoder228.itmo.lab8.connection;

import java.io.Serializable;

public interface Response extends Serializable {
    String getMessage();

    void setMessage(String msg);

    ClientStatus getStatus();

    void setStatus(ClientStatus status);
}
