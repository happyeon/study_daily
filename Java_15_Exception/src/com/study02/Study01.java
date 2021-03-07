package com.study02;

// resources: https://www.w3schools.com/java/java_try_catch.asp

public class Study01 {
	
	/* throw
	 *	The throw statement allows you to create a custom error.
	 *	The throw statement is used together with an exception type. There are many exception types available in Java.
	 */
	
	static void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("Access denied - You must be at least 18 years old.");
		} else {
			System.out.println("Acess granted - You are old enough!");
		}
	}
	
	public static void main(String[] args) {
		checkAge(15);
		
	}

}
