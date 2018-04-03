package com.springboottest.springboot_hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Restsample {

	@RequestMapping("/Hi")
	public String Display()
	{
		return"<b>Welcome to Jersey</b>";
	}
}
