package com.study01;

// resources: https://www.w3schools.com/java/java_threads.asp

public class Study01 extends Thread {
	
	// Threads allows a program to operate more efficiently by doing multiple things at the same time.
	// Threads can be used to perform complicated tasks in the background without interrupting the main program.
	
	// create a thread
	// It can be created by extending the Thread class and overriding its run() method
	public void run() {
		System.out.println("This code is running in a thread.");
	}

}
