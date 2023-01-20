package com.schfrnick.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	//static fields to be added
	
	private String emailAddress;
	private String team;
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		System.out.println("cricket coach for set email - setEmailAddress");
		this.emailAddress = emailAddress;
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		System.out.println("cricket coach for set team - setteam");
		this.team = team;
	}



	//creating a no argument constructor
	public CricketCoach() {
		System.out.println("inside no arg constructr of the circket coach");
		
	}
	
	
	
	public void setFortuneService(FortuneService fortuneService) {
		
		System.out.println("inside setter of the circket coach");
		this.fortuneService = fortuneService;
	}

	
	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice fast bowling";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

}
