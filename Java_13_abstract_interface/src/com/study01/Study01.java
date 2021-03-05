package com.study01;

public class Study01 {
	
	public static void main(String[] args) {
		
		// abstract class와 abstract interface의 차이
		
		/* 1. Abstraction
		 * 	- Data abstraction is the process of hiding certain details and showing only essential information to the user.
		 * 	- Abstraction can be achieved with either abstract classes or interfaces.
		 * 	- Abstract class: is a restricted class that cannot be used to create objects. (To access it, it must be inherited from another class.)
		 *  - Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
		 */
		
		
		/* 2. INTERFACE
		 * 	- An interface is a completely "abstract class" that is used to group related methods with empty bodies.
		 * 	- To achieve security : Hide certain details and only show the important details of an object (interface).
		 * 	- Java does not support "multiple inheritance". A class can only inherit from one superclass.
		 * 	- However, it can be achieved with interfaces, because the class can implement multiple interfaces.
		 * 	- To implement multiple interfaces, separate them with a comma.
		 */
		
	}
	

}
