package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/questions")
public class QuestionController {
	
	@Autowired
	private QuestionService service;
	
	///create new record
	@PostMapping("/")
	public ResponseEntity<Questions> addUser(@RequestBody Questions u){
		Questions user= service.addUser(u);
		if(user!=null)  
			return new ResponseEntity<Questions>(user,HttpStatus.CREATED);
		else
			return new ResponseEntity<Questions>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//List of Users Or RETRIVE DATA
	@GetMapping("/")
	public  List<Questions> getAllUser(){
		return service.getAllUser();
	}
	
	//get user by id
	@GetMapping("/{id}")
	public ResponseEntity<Questions> getUserById(@PathVariable int id){
		  Questions user= service.getUserById(id);
		  
		  if(user!=null)
			  return new ResponseEntity<Questions>(user,HttpStatus.FOUND);
		  else
			  return new  ResponseEntity<Questions>(user,HttpStatus.NOT_FOUND);
	}
	
	//update user by id
	@PutMapping("/{id}")
	public ResponseEntity<Object> updateUser(@RequestBody Questions user,@PathVariable int id){
		Questions data= service.updateUser(user, id);
		
		if(data!=null)
			return new ResponseEntity<Object>(data,HttpStatus.OK);
		else
			return new ResponseEntity<Object>("User is Not Available",HttpStatus.NOT_FOUND);
	}
	///DELETE USER BY ID
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable  int id ){
		
		if(service.deleteUser(id))
			return new ResponseEntity<Object>("User Deleted", HttpStatus.OK);
		else
			return new ResponseEntity<Object>("No User Found",HttpStatus.NOT_FOUND);
	}
	 

}