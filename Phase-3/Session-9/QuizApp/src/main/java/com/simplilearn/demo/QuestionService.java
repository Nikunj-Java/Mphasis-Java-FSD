package com.simplilearn.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepo repo;
	
	//add method or CREATE RECORD
	public Questions addUser(Questions u) {
		return repo.save(u);
	}
	
	
	//List user Method
	public List<Questions> getAllUser(){
		return repo.findAll();
	}
	
	//get user by id
	public Questions getUserById(int id) {
		if(repo.findById(id).isPresent()) 
			return repo.findById(id).get();
		else 
			return null;
		
	}
	//update user by id
	public  Questions updateUser(Questions user, int id) {
		
		if(repo.findById(id).isPresent())
		{
			Questions old= repo.findById(id).get();
			old.setOptionA(user.getOptionA());
			old.setOptionB(user.getOptionB());
			old.setOptionC(user.getOptionC());
			old.setOptionD(user.getOptionD());
			old.setAnswer(user.getAnswer());
			
			
			return repo.save(old);
		}
		else
		{
			return null;
		}
		
	}
	
	///DELETE USER BY ID
	public boolean deleteUser(int id) {
		
		if(repo.findById(id).isPresent())
		{
			repo.deleteById(id);
			return true;
		}
		else
			return false;
	}

}
