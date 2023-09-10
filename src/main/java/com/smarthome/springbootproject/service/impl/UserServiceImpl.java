package com.smarthome.springbootproject.service.impl;

import com.smarthome.springbootproject.models.User;
import com.smarthome.springbootproject.repository.UserRepository;
import com.smarthome.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
	
	private final UserRepository userRepository;
	
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

}
