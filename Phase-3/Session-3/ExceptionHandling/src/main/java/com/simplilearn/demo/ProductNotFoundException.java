package com.simplilearn.demo;

public class ProductNotFoundException extends Exception {
	
	public ProductNotFoundException(String msg) {
	
		super(msg);
	}

	@Override
	public String toString() {
		return "ProductNotFoundException [NOT FOUND With ID 0]";
	}
	
	

}
