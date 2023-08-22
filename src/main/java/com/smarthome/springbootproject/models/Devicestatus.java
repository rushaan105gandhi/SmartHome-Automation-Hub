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
    
    // Getters, setters, constructors
}
