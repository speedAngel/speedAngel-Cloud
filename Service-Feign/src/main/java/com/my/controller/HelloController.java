package com.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.interfaces.HelloClient;

@RestController
public class HelloController {
	
	@Autowired
	private HelloClient helloClient;
	
	@GetMapping("/hello")
	public String hello() {
		return helloClient.sayHello();
	}

}
