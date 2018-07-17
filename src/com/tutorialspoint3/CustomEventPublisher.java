package com.tutorialspoint3;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

public class CustomEventPublisher implements ApplicationEventPublisherAware{
	
	private ApplicationEventPublisher publisher;

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		// TODO Auto-generated method stub
		this.publisher = publisher;
	}
	
	public void publish() {
		CustomEvent customEvent = new CustomEvent(this);
		publisher.publishEvent(customEvent);
	}
	
	public void publish2() {
		System.out.println("s");
	}
}
