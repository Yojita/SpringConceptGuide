package com.spring.guide.di.constructor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DIConstructorMainApplication {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(DIConstructorMainApplication.class);

		// get the bean from spring container
		Coach theCoach = context.getBean(TennisCoach.class);

		// call the method on bean
		System.out.println(theCoach.getDailyWorkout());

		// call method to get daily fortune
		System.out.println(theCoach.getDailyFortune());

	}

}
