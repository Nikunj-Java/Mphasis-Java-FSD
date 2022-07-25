package com.simplilearn.diamondproblem;

public class Test implements First,Second {
	
	public void show() {
		
		First.super.show();
		Second.super.show();
	}
	
	public static void main(String[] args) {
		Test  t = new Test();
		t.show();
	}

}
