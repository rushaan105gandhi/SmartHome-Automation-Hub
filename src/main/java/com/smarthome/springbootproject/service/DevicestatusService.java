package com.smarthome.springbootproject.service;

import com.smarthome.springbootproject.models.Devicestatus;
import java.util.List;

public interface DevicestatusService {
    List<Devicestatus> findByDeviceIdOrderByTimestampDesc(Long deviceId);
}