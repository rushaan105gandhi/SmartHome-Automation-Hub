package com.smarthome.springbootproject.service;

import com.smarthome.springbootproject.models.User;
import com.smarthome.springbootproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Example service method to find a user by user name
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
    
    // Add more service methods here as needed
}
