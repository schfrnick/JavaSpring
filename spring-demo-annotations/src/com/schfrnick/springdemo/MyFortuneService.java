package com.schfrnick.springdemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class MyFortuneService implements FortuneService {
	private Random myRandom = new Random();
	@Override
	public String getFortune(){
		// TODO Auto-generated method stub
		List<String> listOfStrings
        = new ArrayList<String>();
   
	    // load data from file
	    BufferedReader bf = null;
		try {
			bf = new BufferedReader(
			    new FileReader("Fortunes.txt"));
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	   
	    // read entire line as string
	    String line = null;
		try {
			line = bf.readLine();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	   
	    // checking for end of file
	    while (line != null) 
	    {
	        listOfStrings.add(line);
	        try {
				line = bf.readLine();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	    }
	   
	    // closing buffer reader object
	    try {
			bf.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   
	    // storing the data in array list to array
	    String[] array
	        = listOfStrings.toArray(new String[0]);
	   
	    int index = myRandom.nextInt(array.length);
		
		String theFortune = array[index];
		
		return theFortune;
	    
		
	}
	
	
	


}
