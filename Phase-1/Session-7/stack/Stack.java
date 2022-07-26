package com.simplilearn.stack;

public class Stack {
	static final int MAX=1000;
	int  top;
	int a[]= new int[MAX];
	
	boolean isEmpty() {
		
		return top<0;
		
	}
	
	public Stack() {
		//constructor
		top=-1;//default  stckas an empty;
	}
	
	//add an element to stack
	boolean push(int x) {
		if(top>=(MAX-1)) {
			System.out.println("Stackis Overflow");
			return false;
		}
		else {
			a[++top]=x;
			System.out.println(x+" Pushed insto stack");
			return true;
		}
	}
	
	//deletion of  elements

	int pop() {
		
		if(top<0) {
			System.out.println("Statck  is UNDERFLOW");
			return 0;
		}
		else {
			int x= a[top--];
			return x;
		}
		
	}
	
	public static void main(String[] args) {
		Stack s=  new Stack();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s.pop()+ " : Poped Out from stack");
	}

}
