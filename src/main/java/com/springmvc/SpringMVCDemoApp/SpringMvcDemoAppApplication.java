package com.springmvc.SpringMVCDemoApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMvcDemoAppApplication {

	public static final String rest_url = "www.google.com";

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcDemoAppApplication.class, args);
	}

}
