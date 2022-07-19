package com.simplilearn.accessmodifier;

public class Accessmodifier {

	
	public void methodPublic() {
		System.out.println("This is public method");
	}
	
	private void methodPrivate() {
		System.out.println("This is private method");
	}
	
	void methodDefault() {
		System.out.println("This is default method");
	}
	
	protected void methodProtected() {
		System.out.println("This is protected method");
	}
	
	//same class able to aceess all types of modifiers
	public static void main(String [] args) {
		
		Accessmodifier obj= new  Accessmodifier();
		
		obj.methodDefault();
		obj.methodPrivate();
		obj.methodProtected();
		obj.methodPublic();
		
	
	}
}
