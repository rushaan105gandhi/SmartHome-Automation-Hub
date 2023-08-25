package com.smarthome.springbootproject.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class TestController {
	

	
	@RequestMapping("/test")
	public String firstHandler() 
	{
		return "smarthome";
	}
	
}
