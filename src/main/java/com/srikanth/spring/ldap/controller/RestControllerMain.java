package com.srikanth.spring.ldap.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerMain {
	
	
	@GetMapping("/")
	public String index(){
		return "Welcome to the home page ...!!!!!";
	}

}
