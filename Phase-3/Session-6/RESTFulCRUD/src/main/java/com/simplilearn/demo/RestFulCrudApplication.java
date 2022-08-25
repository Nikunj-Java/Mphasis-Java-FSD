package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.simplilearn.demo")
public class RestFulCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestFulCrudApplication.class, args);
	}

}
