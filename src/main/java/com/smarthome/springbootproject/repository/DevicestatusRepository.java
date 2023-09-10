package com.smarthome.springbootproject.repository;

import com.smarthome.springbootproject.models.Devicestatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DevicestatusRepository extends JpaRepository<Devicestatus, Long> {
    List<Devicestatus> findByDeviceIdOrderByTimestampDesc(Long deviceId);
}