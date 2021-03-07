package com.study02;

import java.util.HashSet;

//출처: https://www.w3schools.com/java/java_hashset.asp

public class Study02 {
	
	public static void main(String[] args) {
		
		// HashSet String 이외의 타입 경우
		
		// Items in an HashSet are actually objects. In the example Study01, we created items (objects) of type "String".
		// Remember that a String in Java is an object (not a primitive type).
		// To use other types, such as int, you must specify an equivalent wrapper class.
		// For primitive types, use: Integer for int, Boolean for boolean, Character for char, Double for double, etc.
		
		// create a HashSet object called numbers
		HashSet<Integer> numbers = new HashSet<Integer>();
		
		// Add values to the Set
		numbers.add(3);
		numbers.add(1);
		numbers.add(9);
		
		// show which numbers between 1 and 10 are in the set
		for(int i = 1; i <= 10; i++) {
			if(numbers.contains(i)) {
				System.out.println(i + " was found in the set.");
			} else {
				System.out.println(i + " was not found in the set");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
