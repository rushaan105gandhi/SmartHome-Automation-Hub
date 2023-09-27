package com.smarthome.springbootproject.Controllers;

import com.smarthome.springbootproject.models.Device;
import com.smarthome.springbootproject.models.User;
import com.smarthome.springbootproject.service.DeviceService;
import com.smarthome.springbootproject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devices")
public class DeviceController {

    private final DeviceService deviceService;
    private final UserService userService;

    @Autowired
    public DeviceController(DeviceService deviceService, UserService userService) {
        this.deviceService = deviceService;
        this.userService = userService;
    }

    @GetMapping("/user/{username}")
    public List<Device> getDevicesByUsername(@PathVariable String username) {
        User user = userService.findByUsername(username);
        if (user != null) {
            return deviceService.findByUser(user);
        }
        
        return null; 
    }

    

}
