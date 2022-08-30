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
@RequestMapping("/api/quiz")
public class QuizController {
	
	@Autowired
	private QuizService service;
	
	///create new record
	@PostMapping("/")
	public ResponseEntity<QuizCompetition> addUser(@RequestBody QuizCompetition u){
		QuizCompetition user= service.addUser(u);
		if(user!=null)  
			return new ResponseEntity<QuizCompetition>(user,HttpStatus.CREATED);
		else
			return new ResponseEntity<QuizCompetition>(user, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	//List of Users Or RETRIVE DATA
	@GetMapping("/")
	public  List<QuizCompetition> getAllUser(){
		return service.getAllUser();
	}
	
	 
}