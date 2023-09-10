package com.smarthome.springbootproject.service;

import com.smarthome.springbootproject.models.User;

public interface UserService {
    User findByUsername(String username);
}