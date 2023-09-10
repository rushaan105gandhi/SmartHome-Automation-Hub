package com.smarthome.springbootproject.service.impl;

import com.smarthome.springbootproject.models.Device;
import com.smarthome.springbootproject.models.User;
import com.smarthome.springbootproject.repository.DeviceRepository;
import com.smarthome.springbootproject.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceServiceImpl implements DeviceService {

    private final DeviceRepository deviceRepository;

    @Autowired
    public DeviceServiceImpl(DeviceRepository deviceRepository) {
        this.deviceRepository = deviceRepository;
    }

    public List<Device> findByUser(User user) {
        return deviceRepository.findByUser(user);
    }
}
