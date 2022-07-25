package com.simplilearn.aarayrotation;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayRotattionDemo r= new ArrayRotattionDemo();
		
		int arr[]= {1,2,3,4,5,6,7};
		
		
		r.rotate(arr, 9); ///passing array and number of  times to  rotate an array
		
		for (int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		
	}

}
