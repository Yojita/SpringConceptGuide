package com.spring.guide.di.beanLifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DIBeanLifeCycleMainApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DIBeanLifeCycleMainApplication.class);
		
		TennisCoach coach = context.getBean(TennisCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
	}

}
