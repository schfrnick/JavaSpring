package com.schfrnick.springdemo;

public class TrackCoach implements Coach {

		private FortuneService fortuneService;
		public TrackCoach() {
			
		}
	public TrackCoach(FortuneService fortuneService) {
			super();
			this.fortuneService = fortuneService;
		}

	@Override
	public String getDailyWorkout() {
		return "run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "just Do it: " + fortuneService.getFortune();
	}
	public void doMyStartupStuff() {
		
		System.out.println("inside track coach start up");
	}
	
	public void doMyCleanUpStuff() {
		
		System.out.println("Track coach delete content");
	}
}
