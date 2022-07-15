package com.unisys.JSR;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class JsrDemo {
	
	@Autowired
	private MessageGenerator messageGenerator;
	
	public void setMessageGenerator(MessageGenerator messageGenerator) {
		this.messageGenerator = messageGenerator;
	}
	
	public void showMessage() {
		this.messageGenerator.showMessage();
	}
	
	@PostConstruct
	public void init() {
		System.out.println("Post Construct of bean JsrDemo");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Pre Destroy of bean JsrDemo");
	}

}
