package com.unisys.JSR;

import org.springframework.stereotype.Component;

//@Component(value = "hindi")
@Component
public class HindiWelcomeMessage implements WelcomeMessage {

	@Override
	public void showWelcomeMessage() {
		// TODO Auto-generated method stub
		System.out.println("Namaste");
	}

}
