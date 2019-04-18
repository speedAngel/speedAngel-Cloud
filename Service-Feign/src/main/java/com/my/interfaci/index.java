package com.my.interfaci;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-index")
public interface index {
	 @RequestMapping(value = "/", method = RequestMethod.GET)
	 String index();
}
