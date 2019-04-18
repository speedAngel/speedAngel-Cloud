package com.my.hystrix;

import org.springframework.stereotype.Component;

import com.my.interfaces.HelloClient;

@Component
public class HystrixClient implements HelloClient {

	@Override
	public String sayHello() {
		
		return "ERROR!!!";
	}

}
