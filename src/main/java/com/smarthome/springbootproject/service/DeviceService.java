//package com.smarthome.springbootproject.service;
//
//import com.smarthome.springbootproject.models.Device;
//import com.smarthome.springbootproject.repository.DeviceRepository;
//import com.smarthome.springbootproject.models.User;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class DeviceService {
//    private final DeviceRepository deviceRepository;
//
//    @Autowired
//    public DeviceService(DeviceRepository deviceRepository) {
//        this.deviceRepository = deviceRepository;
//    }
//
//    // Save a new device
//    public Device saveDevice(Device device) {
//        return deviceRepository.save(device);
//    }
//
//    // Retrieve all devices owned by a user
//    public List<Device> getDevicesByUser(User user) {
//        return deviceRepository.findByUser(user);
//    }
//
//    // Retrieve a device by its ID
//    public Device getDeviceById(Long deviceId) {
//        return deviceRepository.findById(deviceId).orElse(null);
//    }
//
//    // Update a device
//    public Device updateDevice(Device device) {
//        return deviceRepository.save(device);
//    }
//
//    // Delete a device by its ID
//    public void deleteDeviceById(Long deviceId) {
//        deviceRepository.deleteById(deviceId);
//    }
//
//    // You can add more service methods based on your application's requirements
//
//}
