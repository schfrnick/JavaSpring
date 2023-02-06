package com.schfrnick.springdemo;

import java.util.Random;
import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	
	//create array of fortunes
	private String[]	data = {"beware the wolf", "whos on first", "broken clocks right twice a day"};
	

	private Random myRandom = new Random();
	
	
	
	@Override
	public String getFortune() {
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}
	


}
