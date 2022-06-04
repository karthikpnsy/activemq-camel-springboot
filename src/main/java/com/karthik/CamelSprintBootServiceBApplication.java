package com.karthik;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CamelSprintBootServiceBApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(CamelSprintBootServiceBApplication.class, args);
	}
	/*
	 * @GetMapping("/hello") public String sayHello() { return "reached here"; }
	 */
}
