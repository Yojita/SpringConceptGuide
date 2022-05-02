package com.spring.guide.di.beanLifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	public TennisCoach() {
		System.out.println("TennisCoach : Inside default constructor");
	}
	
	//define my init method
	@PostConstruct
	public void doMyStartupStuff() {
	System.out.println("TennisCoach : inside of doMyStartupStuff()");
	}
	
	//define my destroy method
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println("TennisCoach : inside of doMyCleanupStuff()");
	}
	
	@Autowired
	private FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
