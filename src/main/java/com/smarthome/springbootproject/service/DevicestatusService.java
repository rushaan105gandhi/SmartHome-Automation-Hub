//package com.smarthome.springbootproject.service;
//
//import com.smarthome.springbootproject.models.Device;
//import com.smarthome.springbootproject.models.Devicestatus;
//import com.smarthome.springbootproject.repository.DevicestatusRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class DevicestatusService {
//
//    private final DevicestatusRepository deviceStatusRepository;
//
//    @Autowired
//    public DevicestatusService(DevicestatusRepository deviceStatusRepository) {
//        this.deviceStatusRepository = deviceStatusRepository;
//    }
//
//    public List<Devicestatus> getDeviceStatusByDevice(Device device) {
//        return deviceStatusRepository.findByDeviceOrderByTimestampDesc(device);
//    }
//
//    // Add more methods related to device status here
//
//}
