package com.my;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;


import com.my.filter.TestFilter;

@SpringBootApplication
@EnableZuulProxy
public class ZuulDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulDemoApplication.class, args);
	}
	
	//将过滤器交给Spring管理
    @Bean
    public TestFilter tokenFilter(){
        return new TestFilter();
    }

}
