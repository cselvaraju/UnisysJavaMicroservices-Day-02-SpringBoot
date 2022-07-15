package com.unisys.JSR;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Welcome {

	private WelcomeMessage welcomeMessage;
	
//	@Autowired
//	public void setWelcomeMessage(@Qualifier("tamil") WelcomeMessage welcomeMessage) {
//		this.welcomeMessage = welcomeMessage;
//	}

	@Resource(name = "hindiWelcomeMessage")
	public void setWelcomeMessage(WelcomeMessage welcomeMessage) {
		this.welcomeMessage = welcomeMessage;
	}
	
	public void showWelcomeMessage() {
		this.welcomeMessage.showWelcomeMessage();
	}
}
