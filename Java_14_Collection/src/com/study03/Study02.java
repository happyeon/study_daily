package com.study03;

import java.util.ArrayList;
import java.util.Collections;

public class Study02 {
	
	public static void main(String[] args) {
		
		// other types -> wrapper class
		
		ArrayList<Integer> myNumbers = new ArrayList<Integer>();
		myNumbers.add(3);
		myNumbers.add(31);
		myNumbers.add(43);
		myNumbers.add(25);
		myNumbers.add(45);
		myNumbers.add(96);
		myNumbers.add(41);
		
		// sort
		Collections.sort(myNumbers);
		for (Integer i : myNumbers) {
			System.out.println(i);
		}
		
		
		
		
	}

}
