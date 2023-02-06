package com.schfrnick.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		//load spring config
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		//retreive bean
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		
		
		
		System.out.println(theCoach.getDailyWorkout());
		
		
		context.close();
	}

}
