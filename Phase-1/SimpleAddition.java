package com.simplilearn.demo;
import java.util.Scanner;
public class SimpleAddition {
	
	
	public static void main(String[] args) {
		
		
		Scanner  sc = new Scanner(System.in);
		
		int num1,num2;
		
		System.out.println("Enter First Number");
		num1=sc.nextInt();
		
		System.out.println("Enter Second Number");
		num2=sc.nextInt();
		
		int result=num1+num2;
		
		System.out.println("Addition is: "+result);
		
	}

}
