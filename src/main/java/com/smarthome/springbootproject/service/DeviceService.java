package com.smarthome.springbootproject.service;

import com.smarthome.springbootproject.models.Device;
import com.smarthome.springbootproject.models.User;

import java.util.List;

public interface DeviceService {
    List<Device> findByUser(User user);
}
