package com.simplilearn.exceptionhandling;

public class Handling3 {
	
	static void waitFor() {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		waitFor();
	}
}
