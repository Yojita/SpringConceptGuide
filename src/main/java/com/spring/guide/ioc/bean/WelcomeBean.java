package com.spring.guide.ioc.bean;

import org.springframework.stereotype.Component;

@Component
public class WelcomeBean {
	private static final String WELCOME_MSG = "Welcome to Spring";

	public String printWelcome() {
		return WELCOME_MSG;
	}
}
