package ru.itpark.service;

import ru.itpark.models.User;

import java.util.List;

/**
 * Created by Michael on 28.06.2017.
 */


public interface UserService  {
    User register(User user);
    void update(User user);
    //User update(User user);
    User findByLogin(String login);
    List<User> getTheoreticalTopList();
    List<User> getPracticTopList();
    boolean checkUser(String userName, String name);
    boolean checkUserName(String userName);

}
