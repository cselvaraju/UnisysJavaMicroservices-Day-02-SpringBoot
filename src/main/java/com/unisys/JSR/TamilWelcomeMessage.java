package com.unisys.JSR;

import org.springframework.stereotype.Component;

//@Component(value = "tamil")
@Component
public class TamilWelcomeMessage implements WelcomeMessage {

	@Override
	public void showWelcomeMessage() {
		// TODO Auto-generated method stub
		System.out.println("Vanakkam");
	}

}
