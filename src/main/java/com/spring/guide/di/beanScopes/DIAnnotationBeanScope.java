package com.spring.guide.di.beanScopes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DIAnnotationBeanScope {
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(DIAnnotationBeanScope.class);
		
		Coach coach = context.getBean(Coach.class);
		
		Coach alphaCoach = context.getBean(Coach.class);
		
		//check if they are same
		
		boolean result = (coach == alphaCoach);
		
		//print the results
		
		System.out.println("Pointing to the same object :" + result);
		
		System.out.println("Memory location for coach : " + coach);
		
		System.out.println("Memory location for alphaCoach : " + alphaCoach);
		
	}
}
