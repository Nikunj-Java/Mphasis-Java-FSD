package com.simplilearn.aarayrotation;

public class ArrayRotattionDemo {
	
	
	public void rotate(int num[] ,int k) {
		
		if(k> num.length) {
			
			k= k% num.length;  //10 divide by 7  will give reminder as 3
			
			int result[] = new int[num.length];//create new array with size of given array
			
			
			for(int i=0; i<k; i++) {
				
				result[i]= num[num.length-k+i]; // 7-3= 4 this will  skip 4 elements (3rd index) and rest elements  will be rotated
				
			}
			
			int j=0;
			
			for(int i=k; i<num.length;i++) {
				
				result[i]=num[j];
				j++;
			}
			
			System.arraycopy(result, 0, num, 0, num.length);
			
		}
		
		
	}

}
