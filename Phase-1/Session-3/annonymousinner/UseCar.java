package com.simplilearn.annonymousinner;

public class UseCar {
	
	public static void main(String[] args) {
		Car car1= new CarImp();
		Car car2= new CarImp();
		
		car1.start();
		car2.start();
		
		car1.stop();
		car2.stop();;
	}

}
