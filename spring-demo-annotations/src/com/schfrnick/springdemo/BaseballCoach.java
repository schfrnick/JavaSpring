package com.schfrnick.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class BaseballCoach implements Coach {

	
	@Autowired
	@Qualifier("myFortuneService")
	private FortuneService fortuneService;
	public BaseballCoach() 
	{
		
	System.out.println("baseball defalt constructor");
	}
		
	public String getDailyWorkout() 
	{
		// TODO Auto-generated method stub
		return "get some bp in";
	}

	@Override
	public String getFortune() 
	{
		// TODO Auto-generated method stub
		return  fortuneService.getFortune();
	}

	

}
