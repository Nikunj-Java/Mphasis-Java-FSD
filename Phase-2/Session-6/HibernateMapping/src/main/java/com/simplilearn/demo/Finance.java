package com.simplilearn.demo;

public class Finance {
	
	private long FINANACEID;
	private String name;
	private String ftype;
	
	
	public Finance() {
		
	}


	public Finance(String name, String ftype) {
		FINANACEID=0;
		this.name = name;
		this.ftype = ftype;
	}


	public long getFINANACEID() {
		return FINANACEID;
	}


	public void setFINANACEID(long fINANACEID) {
		FINANACEID = fINANACEID;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getFtype() {
		return ftype;
	}


	public void setFtype(String ftype) {
		this.ftype = ftype;
	}
	
	

}
