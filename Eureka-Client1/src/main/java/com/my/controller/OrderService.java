package com.my.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderService {
	@GetMapping("/count/{num}")
	 public String Count(@PathVariable("num") Integer num ) {
		 return "Count id is " + num;
		 
	 }
}
