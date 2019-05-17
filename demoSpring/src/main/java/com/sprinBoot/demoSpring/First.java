package com.sprinBoot.demoSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class First {
	
	@GetMapping("/hello")
	public String Hello() {
		return "Hello world";
	}
	
	

}
