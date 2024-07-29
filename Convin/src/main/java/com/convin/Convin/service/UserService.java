package com.convin.Convin.service;

import com.convin.Convin.model.Users;
import com.convin.Convin.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Users createUser(Users user) {
        return userRepository.save(user);
    }

    public List<Users> getAllUsers() {
        return userRepository.findAll();
    }

    public Optional<Users> getUserById(int userId) {
        return userRepository.findById(userId);
    }

    // Optionally, you can add more methods like updateUser and deleteUser
}
