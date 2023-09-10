package com.smarthome.springbootproject.service.impl;

import com.smarthome.springbootproject.models.Devicestatus;
import com.smarthome.springbootproject.repository.DevicestatusRepository;
import com.smarthome.springbootproject.service.DevicestatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DevicestatusServiceImpl implements DevicestatusService {

    private final DevicestatusRepository DevicestatusRepository;

    @Autowired
    public DevicestatusServiceImpl(DevicestatusRepository DevicestatusRepository) {
        this.DevicestatusRepository = DevicestatusRepository;
    }

    @Override
    public List<Devicestatus> findByDeviceIdOrderByTimestampDesc(Long deviceId) {
        return DevicestatusRepository.findByDeviceIdOrderByTimestampDesc(deviceId);
    }
}