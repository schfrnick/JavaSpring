package com.schfrnick.springdemo;

public class BaseballCoach implements Coach{
	
	//define private field for dependency and constructor
	private FortuneService fortuneService;
	
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "spend 30 min on BP";
		
	}

	@Override
	public String getDailyFortune() {
		
		
		//use our fortune service
		return fortuneService.getFortune();
	}
}
