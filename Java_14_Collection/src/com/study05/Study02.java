package com.study05;

import java.util.HashMap;

public class Study02 {
	
	public static void main(String[] args) {
		
		HashMap<String, Integer> people = new HashMap<String, Integer>();
		
		people.put("anne", 16);
		people.put("amy", 22);
		people.put("jaja", 31);
		
		for (String i : people.keySet()) {
			System.out.println("key : " + i + ", value : " + people.get(i));
		}
	}

}
