package com.study02;

public class Study01 extends Thread{
	
	// If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() mehtod
	
	public static void main(String[] args) {
		Study01 thread = new Study01();
		thread.start();
		System.out.println("This code is outside of the thread");
	}
	
	public void run() {
		System.out.println("This code is running in a thread");
	}
}
