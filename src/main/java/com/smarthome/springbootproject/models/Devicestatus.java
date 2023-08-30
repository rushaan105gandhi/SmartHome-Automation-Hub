package com.smarthome.springbootproject.models;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Devicestatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private boolean status;
    private LocalDateTime timestamp;

    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;

    // Constructors

    public Devicestatus() {
    }

    public Devicestatus(boolean status, LocalDateTime timestamp, Device device) {
        this.status = status;
        this.timestamp = timestamp;
        this.device = device;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
