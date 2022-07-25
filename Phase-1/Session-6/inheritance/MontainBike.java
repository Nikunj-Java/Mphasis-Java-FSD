package com.simplilearn.inheritance;

public class MontainBike extends Bicycle {
	
	//extends keyword indicated that you are making a new class that is 
	//derived from an existing class
	//meaning of 'extends' means increasing functionality
	
	
	//here the class which is inherited is called parent class or superclass
	//and new class is  called child class  or subclass 
	
	private  int seatHeight;
	
	public MontainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		// TODO Auto-generated constructor stub
		this.seatHeight=  seatHeight;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	@Override
	public String toString() {
		return "MontainBike [" + super.toString()+"\nSeatHeight="+seatHeight+ "]";
	}

	
	
	
	
	

}
