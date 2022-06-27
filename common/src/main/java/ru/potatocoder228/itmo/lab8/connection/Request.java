package ru.potatocoder228.itmo.lab8.connection;

import ru.potatocoder228.itmo.lab8.data.Dragon;
import ru.potatocoder228.itmo.lab8.user.User;

import java.io.Serializable;

public interface Request extends Serializable {
    String getMessage();

    Dragon getDragon();

    User getUser();

    void setMessage(String msg);

    void setDragon(Dragon dragon);

    void setUser(User user);
}
