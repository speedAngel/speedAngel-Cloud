package com.my.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/call")
public class CallController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/hello")
	@HystrixCommand(fallbackMethod ="hasError")
	public String hello() {
		System.err.println("/call/hello");
		return restTemplate.getForObject("http://EUREKA-CLIENT/hello", String.class);
	}
	
	@GetMapping("/hi")
	public String hi() {
		System.err.println("/call/hi");
		return restTemplate.getForObject("http://EUREKA-CLIENT/hi?name=zhangsan", String.class);
	}
	
	
	public String hasError() {
		return "Hystrix:Error";
	}
}
