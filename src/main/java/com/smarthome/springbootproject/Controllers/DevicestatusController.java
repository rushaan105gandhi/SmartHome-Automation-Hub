package com.smarthome.springbootproject.Controllers;

import com.smarthome.springbootproject.models.Devicestatus;
import com.smarthome.springbootproject.service.DevicestatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/devicestatus")
public class DevicestatusController {

    private final DevicestatusService devicestatusService;

    @Autowired
    public DevicestatusController(DevicestatusService devicestatusService) {
        this.devicestatusService = devicestatusService;
    }

    @GetMapping("/{deviceId}")
    public List<Devicestatus> getDeviceStatusByDeviceId(@PathVariable Long deviceId) {
        return devicestatusService.findByDeviceIdOrderByTimestampDesc(deviceId);
    }

    // Add more controller methods for device status-related operations as needed

}
