package com.study01;

public class Study01 {
	
	public static void main(String[] args) {
		
		// 반복문 for
		// for (초기값; 조건식; 증감식) {실행할 문장}
		
		// 1. for문
		for(int i = 10; i <24; i++) {
			System.out.println("i = " + i);
		}
		
		
		// 2. 중첩된 for문
		for(int x = 2; x < 10; x++) {
			for(int y = 1; y < 10; y++) {
				System.out.println(x + " X " + y + " = " + x*y);
			}
		}
	}

}
