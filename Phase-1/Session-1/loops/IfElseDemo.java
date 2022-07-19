package com.simplilearn.demo;
import java.util.Scanner;
public class IfElseDemo {

	public static void main(String [] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Your Percentage");
		
		
		 
		
		int p= sc.nextInt();
		
		if(p>=70 && p<=100)
			System.out.println("Distinction");
			
		else if (p>=60 && p<70)
			System.out.println("First Class");
		else if (p>50 && p<60)
			System.out.println("Second class");
		else if (p>=35 && p<50)
			System.out.println("Pass class");
		else if (p>=00 && p<35)
			System.out.println("Fail");
		else
			System.out.println("Enter Correct Percentage");
		
	}
	
}
