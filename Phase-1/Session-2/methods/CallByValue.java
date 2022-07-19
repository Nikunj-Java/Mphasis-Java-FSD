package com.simplilearn.methods;

public class CallByValue {
	//class level variable, access using this keyword
	
	int num=50;

	void operation(int num) {
		this.num=num*10/100;
		//if parameter is not passed it will take default value, but once the parameter
		// is passed it will take the value of parameter
	}
	public static void main(String[] args) {
		
		CallByValue obj= new CallByValue();
		
		System.out.println("Value of num before function call: "+obj.num);
		
		obj.operation(100);
		System.out.println("Value of num after function call: "+obj.num);
	}
}
