package com.spring.guide.di.setter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DISetterMainApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DISetterMainApplication.class);

		// get the bean from spring container
		TennisCoach theCoach = context.getBean(TennisCoach.class);

		// call the method on bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

	}
}
