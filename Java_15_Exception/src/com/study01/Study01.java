package com.study01;

// resources: https://www.w3schools.com/java/java_try_catch.asp

public class Study01 {
	
	public static void main(String[] args) {
	
		
		/* Exception
		 *	When executing Java code, different errors can occur.
		 * 	Coding errors made by programmers, errors due to wrong input, or other unforeseeable things.
		 *  When an error occurs, Java will normally stop and generate an error message. 
		 *  The technical term for this is: Java will throw an exception (throw an error).
		 */
		
		/* try and catch
		 * 	The try statement allows you to define a block of code to be tested for errors while it is being executed.
		 * 	The catch statement allows you to define a block of code to be executed, if an error occurs in the try box.
		 * 	The try and catch keywords come in pairs.
		 */
		
		try {
			// block of code to try
		} catch(Exception e) {
			// block of code to handle errors
		}
	}

}
