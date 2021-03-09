package com.study02;

public class Study02 implements Runnable {
	
	// If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a 
	// Thread object's constructor and then calling the thread's start() method.
	
	public static void main(String[] args) {
		Study02 obj = new Study02();
		Thread thread = new Thread(obj);
		thread.start();
		System.out.println("This code is outside of the thread");
	}

	@Override
	public void run() {
		System.out.println("This coid is running in a thread");

	}
	
	/* Differences between "extending" and "implementing" threads
	 * 	-> The major difference is that when a class extends the Thread class, you cannot extends any other class,
	 * 	   but by implementing the Runnable interface, it is possible to extend from another class as well,
	 * 	   like: class MyClass extends OtherClass implements Runnable.
	 * 
	 */

}
