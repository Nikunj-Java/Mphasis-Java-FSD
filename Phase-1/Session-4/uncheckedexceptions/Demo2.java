package com.simplilearn.uncheckedexceptions;

import java.util.Scanner;
//runtime: NumberFormatException: 
public class Demo2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		
		String num1=sc.next();
		
		//let's  convert string to number
		
		int number= Integer.parseInt(num1);
		System.out.println("Number is: "+number);
		System.out.println("End of program");
	}

}
