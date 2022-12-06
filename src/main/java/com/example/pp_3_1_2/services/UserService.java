package com.example.pp_3_1_2.services;

import com.example.pp_3_1_2.models.User;

import java.util.List;

public interface UserService {

    List<User> getUsers();

    void addUser(User user);

    void deleteUsers();

    User getUserById(long id);

    void updateUser(User user);

    void deleteUser(long id);
}
