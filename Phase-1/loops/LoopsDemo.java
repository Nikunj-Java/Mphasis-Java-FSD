package com.simplilearn.demo;

public class LoopsDemo {

	public static void main(String[] args) {
		
		int i=0;
		
		//while loop
		while(i<=5) {
			System.out.println("using while "+i);
			i++;
		}
		
		
		///do while loop
		do {
			System.out.println("using do while "+i);
			i++;
		}
		while(i<=10);
		
		
		//for loop
		for(i=1; i<5 ;i++) {
			System.out.println("using for loop "+i);
		}
		
		System.out.println(i);
		
	}
}
