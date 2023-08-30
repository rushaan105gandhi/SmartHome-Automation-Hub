package com.smarthome.springbootproject.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/one")
public class TestController {
	

	
	@GetMapping("/test")
	public String firstHandler() 
	{
		return "home";
	}
	
}
