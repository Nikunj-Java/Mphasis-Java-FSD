package com.simplilearn.exceptionhandling;

import java.util.Scanner;

public class Handling1 {
	
	
	public static void main(String[] args) {
		 
				String a="A";
				int number;
				
			     
		 
					try {
						
						//risky code//code which is going to  throw an error
						
						number=Integer.parseInt(a);
						System.out.println("Number is "+number);
					}
					catch (Exception e) {
						// TODO: handle exception
						
						System.out.println("Exception Occured: "+e);
					}
					
					
				  
				
	}

}
