package com.simplilearn.exceptionhandling;

public class Handling2 {

	
	public static void main(String[] args) {
		
		
		int a=0;
		int b=0;
		
		
		try {
			int c=a/b;
			System.out.println("Result is: "+c);
			
		} catch (ArithmeticException e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
	}
}
