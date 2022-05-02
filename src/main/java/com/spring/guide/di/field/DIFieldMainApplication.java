package com.spring.guide.di.field;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DIFieldMainApplication {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(DIFieldMainApplication.class);
		
		Coach coach = context.getBean(Coach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
		
	}
	}
	
	
