package com.study05;

import java.util.HashMap;

// 출처: https://www.w3schools.com/java/java_hashmap.asp

public class Study01 {
	
	public static void main(String[] args) {
		// HashMap : 중복과 순서가 허용되지 않으며, null값이 올 수 있다.
		
		// A HashMap store items in "key/value" pairs, and you can access them by an index of another type.
		// One object is used as a key(index) to another object(value).
		// It can store different types: String keys and Integer values, or the same type.
		
		// create a HashMap object called capitalCities
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		
		// Add keys and values (country, city)
		capitalCities.put("korea", "Seoul");
		capitalCities.put("Russia", "Moscow");
		capitalCities.put("England", "London");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		System.out.println(capitalCities);
		
		// get
		capitalCities.get("USA");
		
		// remove
		capitalCities.remove("England");
		
		// size
		capitalCities.size();
		
		// print keys
		for (String i : capitalCities.keySet()) {
			System.out.println(i);
		}
		
		// print values
		for (String i : capitalCities.values()) {
		  System.out.println(i);
		}
		
		// print keys and values
		for (String i : capitalCities.keySet()) {
		  System.out.println("key: " + i + " value: " + capitalCities.get(i));
		}
		
		// clear
		capitalCities.clear();
		
	}

}
