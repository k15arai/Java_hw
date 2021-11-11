package com.kenjiarai.hellohuman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Importing Dependencies
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication

// Annotation
//@RestController
public class HelloHumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloHumanApplication.class, args);
	}
	
//	// Annotation
//	@RequestMapping("/")
//	// Methods that map to the request route above
//	public String hello() {
//		return "Hello World";
//	}

}
