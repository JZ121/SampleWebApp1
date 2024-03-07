package com.example.samplewebproj2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@RequestMapping("/hello")  
	public String hello()   
	{  
		return "Web App 2";  
	}

}
