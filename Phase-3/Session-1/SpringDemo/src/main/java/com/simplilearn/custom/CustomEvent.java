package com.simplilearn.custom;

import org.springframework.context.ApplicationEvent;

public class CustomEvent extends ApplicationEvent {

	public CustomEvent(Object source) {
		super(source);
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "From CustomEvent";
	}
	
	

	 
}
