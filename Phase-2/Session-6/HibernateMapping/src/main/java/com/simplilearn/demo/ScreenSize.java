package com.simplilearn.demo;

public class ScreenSize {
	
	private long SCREENID;
	private String size;
	
	public ScreenSize() {
		
	}

	public ScreenSize(String size) {
		
		SCREENID = 0;
		this.size = size;
	}

	public long getSCREENID() {
		return SCREENID;
	}

	public void setSCREENID(long sCREENID) {
		SCREENID = sCREENID;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	

}
