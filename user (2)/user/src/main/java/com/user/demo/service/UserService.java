package com.user.demo.service;

import com.user.demo.data.User;
import com.user.demo.data.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public User updateUser(int id, User userDetails) {
        User user = userRepository.findById(id).orElseThrow();
        user.setUserName(userDetails.getUserName());
        user.setUserNic(userDetails.getUserNic());
        user.setAddress(userDetails.getAddress());
        user.setEmail(userDetails.getEmail());
        user.setRegDate(userDetails.getRegDate());
        user.setContact(userDetails.getContact());
        return userRepository.save(user);
    }

    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    public List<User> searchUser(String name) {
        return userRepository.findByUserNameContainingIgnoreCase(name);
    }
}