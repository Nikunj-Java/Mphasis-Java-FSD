package com.simplilearn.accessmodanother;

import com.simplilearn.accessmodifier.Accessmodifier;

public class Child extends Accessmodifier {
	
	
	public static void main(String [] args) {
		Child obj= new Child();
	
		//default and private method outside the class and outside 
		//the package(another package) is not permissible
		//obj.methodDefault();
		//obj.methodPrivate();
		obj.methodProtected();
		obj.methodPublic();
		
		
		
		
	}

}


