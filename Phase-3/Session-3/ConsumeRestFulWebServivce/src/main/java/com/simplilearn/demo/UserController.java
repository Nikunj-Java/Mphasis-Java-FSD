package com.simplilearn.demo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class UserController {
	
	@GetMapping("/users")
	public String getAllUsers() {
		
		RestTemplate template= new RestTemplate();
		UserModel users= template.getForObject("https://jsonplaceholder.typicode.com/users/1", UserModel.class);
		return users.toString();
		 
	}
	
	
	@GetMapping("/users/{id}")
	public String getAllUsers(@PathVariable int id) {
		
		RestTemplate template= new RestTemplate();
		UserModel users= template.getForObject("https://jsonplaceholder.typicode.com/users/"+id, UserModel.class);
		return users.toString();
		 
	}
	
	 

}
