package com.simplilearn.demo;

public class NestedIfDemo {
	
	 
	
	public static void main(String[] args) {
		
		//use scanner class to take input from user
		
		int a,b,c;
		a=34;
		b=67;
		c=23;
		
		//if within if
		
		if(a==34) {
			
			if(b==67) 
			    {
					if(c==23) {
						System.out.println("If within if working");
					}
				
				}
		}
		else {
			System.out.println("error in program");
		}
		
	}

}
