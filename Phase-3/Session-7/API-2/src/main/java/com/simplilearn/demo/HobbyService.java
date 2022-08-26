package com.simplilearn.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbyService {
	
	@Autowired
	HobbyRepository repo;
	
	//save hobby of person 
	public HobbyEntity saveHobby(HobbyEntity hobby) {
		return  repo.save(hobby);
	}
	
	public String findByPersonId(int personId) {
		return repo.findByPersonId(personId);
	}

}
