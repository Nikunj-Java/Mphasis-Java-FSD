package com.simplilearn.arrays;

public class ArrayDemo {

	
	public static void main(String[] args) {
		int array[]= {12,23,34,45,56,78};
		
		System.out.println("Element at index 4: "+ array[4]);
		
		System.out.println("Length of an Array: "+array.length);
		
		System.out.println("Access using for loopp");
		
		for (int i=0;i<array.length;i++) {
			
			System.out.println(array[i]);
			
		}
		
		System.out.println();
		
		
		for(int a: array) {
			System.out.print(a+ " ");
		}
	}
}
