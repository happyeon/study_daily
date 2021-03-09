package com.study01;

public class Study02 implements Runnable {
	
	// Another way to create a thread is to implement the Runnable interface.

	@Override
	public void run() {
		System.out.println("This code is running in a thread");

	}

}
