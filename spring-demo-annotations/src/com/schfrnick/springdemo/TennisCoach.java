package com.schfrnick.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component

//we can use @component to create an id based on our class name in lowcase or we can use (".....") 
//to create a custom bean id
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	/*
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	//default constructor
	public TennisCoach() {
		
	System.out.println("tennis defalt constructor");
	}
	//define init method
	@PostConstruct
	public void startUp() {
		
		System.out.println("start up location");
	}
	
	//define destroy method
	@PreDestroy
	public void onDestroy() {
		
		System.out.println("we are destroying");
	}
	
	
	
	
	/*
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println("inside setter method");
		fortuneService = theFortuneService;
	}
	
	*/
	@Override
	public String getDailyWorkout() {
		
		return "Practice your backhand";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
