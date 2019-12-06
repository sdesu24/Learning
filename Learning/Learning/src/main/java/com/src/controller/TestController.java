package com.src.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//add RestController
@RestController
@RequestMapping("/demo")
public class TestController {

	@GetMapping("/test")
	public String test()
	{
	System.out.println("test initiated");	
	return "working";
	
	
	
	}
	
}
