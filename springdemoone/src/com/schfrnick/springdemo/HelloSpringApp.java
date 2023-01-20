package com.schfrnick.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//load spring configuration
			ClassPathXmlApplicationContext context = 
					new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean
			Coach theCoach = context.getBean("myCoach", Coach.class);
			
			
		//call our method
			System.out.println(theCoach.getDailyWorkout());
			//below this uses our dependency injection
			System.out.println(theCoach.getDailyFortune());
		//close the context
			context.close();
	}

}
