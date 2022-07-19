package com.simplilearn.accessmodifier;

public class TestMethods {

	//accessing Accessmodifier methods in different class with samepackage name
	public static void main(String [] args) {
		
Accessmodifier obj= new  Accessmodifier();
		
		obj.methodDefault();
		//obj.methodPrivate(); private method we can't access out side of class, its scope is within the class
		obj.methodProtected();
		obj.methodPublic();
	}
}
