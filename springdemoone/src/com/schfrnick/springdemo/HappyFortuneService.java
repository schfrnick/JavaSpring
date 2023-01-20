package com.schfrnick.springdemo;

import java.util.Random;

public class HappyFortuneService implements FortuneService {
	//array of fortunes
	private String[] Fortune = {"tough luck sport", "at a boy","way to hang in there"};
	@Override
	public String getFortune() {
		//generate a random number generator
		Random generator = new Random();
		//get a random number from length of the array
		int randomIndex = generator.nextInt(Fortune.length);
		
		
		//print the fortune at that location in the array
		return Fortune[randomIndex] ;
	}

}
