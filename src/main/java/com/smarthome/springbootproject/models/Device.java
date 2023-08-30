package com.smarthome.springbootproject.models;

import javax.persistence.*;
import java.util.List;
import java.util.ArrayList;

@Entity
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private String type;
    private String location;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "device", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Devicestatus> statuses = new ArrayList<>();

    // Constructors

    public Device() {
    }

    public Device(String name, String type, String location, User user) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.user = user;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Devicestatus> getStatuses() {
        return statuses;
    }

    public void setStatuses(List<Devicestatus> statuses) {
        this.statuses = statuses;
    }
}
