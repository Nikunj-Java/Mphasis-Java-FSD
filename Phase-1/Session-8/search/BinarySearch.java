package com.simplilearn.search;

public class BinarySearch {
	
	public static void main(String[] args) {
		int arr[] = {3,6,9,12,15};
		
		int key=25;
		
		int arrLength=arr.length;
		
		try {
			binarySearch(arr,0,key,arrLength);
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO: handle exception
			System.out.println("Error: "+e);
		}
		
	}

	private static void binarySearch(int[] arr, int lb, int key, int ub) {
		
		int midValue= (lb+ub)/2;
		
		while(lb<=ub) {
			
			if(arr[midValue]<key)
			{
				lb= midValue+1;
			}
			else if(arr[midValue]==key)
			{
				System.out.println("Element found at index: "+midValue);
				break;
			}
			else {
				ub=midValue-1;
			}
			midValue=(lb+ub)/2;
		}
		if(lb>ub) {
			System.out.println("Element Not Found");
		}
		
	}

}
