package com.unisys.JSR;

import org.springframework.stereotype.Component;

@Component
public class MessageGenerator {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void showMessage() {
		System.out.println("Message is: " + this.message);
	}
}
