package com.simplilearn.typecasting;

public class ImplicitTypecasting {
	
	public static void main(String[] args) {
		
		
		byte a=10;
		System.out.println("Byte: "+a);
		
		short b=a;
		System.out.println("Byte to Short Conversion: "+b);
		
		int c =b;
		System.out.println("Short to Int Conversion: "+c);
		
		int d=a;
		System.out.println("Byte to Int Conversion: "+d);
		
		float e=d;
		System.out.println("Int to Float Conversion: "+e);
		
		double f=e;
		System.out.println("Float to double Conversion: "+f);
		
		double g=d;
		System.out.println("Int to double Conversion: "+g);
		
		
	}

}
