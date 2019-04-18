package com.my.controller;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserService {
	
	//http://localhost:9005/Eureka-Client/user/getUser/2
 @GetMapping("/getUser/{id}")
 public String getUserById(@PathVariable("id") Integer id ) {
	 return "user id is " + id;
	 
 }
}
