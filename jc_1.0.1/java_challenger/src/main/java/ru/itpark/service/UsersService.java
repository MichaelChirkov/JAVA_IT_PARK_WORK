package ru.itpark.service;

import ru.itpark.model.User;

import java.util.List;

/**
 * Created by Michael on 10.07.2017.
 */
public interface UsersService {

    User register(User user);

    void update(User user);

    User getByUsername( String username);

    boolean checkUsernameAndName( String sername, String name);

    List<User> getUsers();

    List<User> getTheoreticalTopList();

    List<User> getPracticTopList();
}
