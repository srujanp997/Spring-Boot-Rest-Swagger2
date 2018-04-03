package com.springboottest.springboot_hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class SpringbootHelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootHelloApplication.class, args);
	}
	
	
}
