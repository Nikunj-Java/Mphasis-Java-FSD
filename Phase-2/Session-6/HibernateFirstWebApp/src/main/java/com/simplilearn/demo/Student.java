package com.simplilearn.demo;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private String password;
	
	public Student() {
		
	}
	
	
	public Student(String name, String email, String password) {
		this.name = name;
		this.email = email;
		this.password = password;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
