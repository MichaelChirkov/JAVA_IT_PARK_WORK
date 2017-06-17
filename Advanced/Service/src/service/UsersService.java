package service;


import models.User;

public interface UsersService {
    boolean hasName(int userId, String name);
    void register(User user);
}