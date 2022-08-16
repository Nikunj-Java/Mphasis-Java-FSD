package com.simplilearn.custom;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher  implements ApplicationEventPublisherAware{

	private ApplicationEventPublisher publisher;
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		
		this.publisher=applicationEventPublisher;
		
	}
	
	public void publish() {
		
		CustomEvent ce= new CustomEvent(this);
		publisher.publishEvent(ce);
		
	}

}
