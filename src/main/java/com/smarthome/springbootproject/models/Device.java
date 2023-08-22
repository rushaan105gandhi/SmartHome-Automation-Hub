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
	
	//getters,setters,constructors
}
