package Com.simplilearn.encapsulation;

import java.io.Serializable;

public class Student implements  Serializable{

	private int id;
	private String name;
	private String email;
	private String password;
	private String mobile;
	private String division;
	private String std;

	// generating getter and setters

	// getting id
	public int getId() {
		return id;
	}

	// setting id
	public void setId(int id) {
		this.id = id;
	}

	// getting name
	public String getName() {
		return name;
	}

	// seeting name
	public void setName(String name) {
		this.name = name;
	}

	// getting email
	public String getEmail() {
		return email;
	}

	// setting email
	public void setEmail(String email) {
		this.email = email;
	}

	// getting password
	public String getPassword() {
		return password;
	}

	// setting password
	public void setPassword(String password) {
		this.password = password;
	}

	// getting Mobile
	public String getMobile() {
		return mobile;
	}

	// setting mobile
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	// getting division
	public String getDivision() {
		return division;
	}

	// setting division
	public void setDivision(String division) {
		this.division = division;
	}

	// getting std
	public String getStd() {
		return std;
	}

	// setting division
	public void setStd(String std) {
		this.std = std;
	}
}
