package com.simplilearn.event;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextStoppedEvent;

public class StopEventHandler implements ApplicationListener<ContextStoppedEvent> {

	public void onApplicationEvent(ContextStoppedEvent event) {
		// TODO Auto-generated method stub
		System.out.println("Stop Event Received");
		
	}

}
