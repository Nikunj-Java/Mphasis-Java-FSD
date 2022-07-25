package com.simplilearn.orderstatistics;

import java.util.Arrays;

public class  KthSmallestElementExample {
	
	
	
	public static int KthSmallest(Integer[] arr,int k) {
		
		Arrays.sort(arr);
		//will return kth smallest element in the sorted array
		
		return arr[k-1]; //this will give you the smallest element
		
	}
	
	public static void main(String[] args) {
		
		Integer arr[]= new Integer[] {28,16,46,38,55,89,83,30};
		
		int k=3; ///finding 3rd smallest element
		
		System.out.println("Kth Smallest Element is : "+ KthSmallest(arr, k) );
	}

}
