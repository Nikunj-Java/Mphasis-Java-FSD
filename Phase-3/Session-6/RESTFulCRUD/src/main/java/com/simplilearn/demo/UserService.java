package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
	
	@Autowired
	private UserRepo repo;
	
	//add method or CREATE RECORD
	public User addUser(User u) {
		return repo.save(u);
	}
	
	
	//List user Method
	public List<User> getAllUser(){
		return repo.findAll();
	}
	
	//get user by id
	public User getUserById(int id) {
		if(repo.findById(id).isPresent()) 
			return repo.findById(id).get();
		else 
			return null;
		
	}
	//update user by id
	

}
