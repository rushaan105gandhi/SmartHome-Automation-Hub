package com.smarthome.springbootproject.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {
	

	
	@GetMapping("/test")
	public String firstHandler() 
	{
		return "smarthome";
	}
	
}
