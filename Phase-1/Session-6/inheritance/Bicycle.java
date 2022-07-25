package com.simplilearn.inheritance;

public class Bicycle {
	
	private int gear;
	private int speed;
	
	
	public Bicycle(int gear, int speed) {
		
		this.gear = gear;
		this.speed = speed;
	}
	
	
	//method to decrease a speed
	public void  applyBreaks(int decrement) {
		speed = --decrement;
	}
	
	//method to increase a speed
	public  void speedUp(int increament) {
		speed= ++ increament;
	}


	@Override
	public String toString() {
		return "Bicycle [No of gear=" + gear + ", speed of bike=" + speed + "]";
	}
	
	
	
	
	

}
