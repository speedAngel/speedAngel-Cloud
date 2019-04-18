package com.my.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.my.hystrix.HystrixClient;

@FeignClient(name="EUREKA-CLIENT",fallback = HystrixClient.class)
public interface HelloClient {

	@GetMapping("/hello")
	public String sayHello();
}
