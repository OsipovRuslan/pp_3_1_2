package com.example.pp_3_1_2.services;

import com.example.pp_3_1_2.models.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<User> getUsers();

    void saveUser(User user);

    void deleteUsers();

    Optional<User> getUserById(long id);

    void deleteUser(long id);
}
