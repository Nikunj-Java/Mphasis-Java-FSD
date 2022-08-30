package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuizService {
	
	@Autowired
	private QuizRepo repo;
	
	//add method or CREATE RECORD
	public QuizCompetition addUser(QuizCompetition u) {
		return repo.save(u);
	}
	
	
	//List user Method
	public List<QuizCompetition> getAllUser(){
		return repo.findAll();
	}
	
	 

}
