package com.simplilearn.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStartedEvent;

public class StartEventHandler implements ApplicationListener<ContextStartedEvent> {

	public void onApplicationEvent(ContextStartedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Starting Event Received");
	}

	 

}
