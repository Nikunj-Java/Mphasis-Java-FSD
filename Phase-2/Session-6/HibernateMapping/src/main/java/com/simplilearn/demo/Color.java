package com.simplilearn.demo;

public class Color {
	
	private long COLORID;
	private String name;
	
	public Color() {
		
	}

	public Color(String name) {
		
		COLORID = 0;
		this.name = name;
	}

	public long getCOLORID() {
		return COLORID;
	}

	public void setCOLORID(long cOLORID) {
		COLORID = cOLORID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
