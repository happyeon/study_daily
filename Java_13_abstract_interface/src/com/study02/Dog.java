package com.study02;

public class Dog implements Animal {

	@Override
	public void animalSound() {
		System.out.println("The dog says: mung mung");

	}

	@Override
	public void sleep() {
		System.out.println("쿨쿨");

	}

}
