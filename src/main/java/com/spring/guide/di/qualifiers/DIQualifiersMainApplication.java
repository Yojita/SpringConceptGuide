package com.spring.guide.di.qualifiers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DIQualifiersMainApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DIQualifiersMainApplication.class);
		
		TennisCoach coach = context.getBean(TennisCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		
		System.out.println(coach.getDailyFortune());
	}

}
