package com.simplilearn.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class SringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SringSecurityApplication.class, args);
	}

}
