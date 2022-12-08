package com.example.pp_3_1_2.services;

import com.example.pp_3_1_2.repository.UserRepository;
import com.example.pp_3_1_2.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public void deleteUsers() {
        userRepository.deleteAll();
    }

    @Override
    public Optional<User> getUserById(long id) {
        return userRepository.findById(id);
    }

    @Override
    public void deleteUser(long id) {
            userRepository.delete(userRepository.findById(id).get());
    }

    @Override
    public void saveUser(User user) {
        userRepository.saveAndFlush(user);
    }
}
