package com.study01;

import java.util.Scanner;

public class Study02 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// next() 와 nextLine() 의 차이
		
		// next() : Finds and returns the next complete token from this scanner.
		// nextLine() : Advances this scanner past the current line and returns the input that was skipped.
		
		
		System.out.println("----nextLine()----");
		String x = sc.nextLine();		// enter를 치기 전까지 쓴 문자열을 모두 리턴
		System.out.println("----next()----");
		String y = sc.next();			// 공백(space) 전까지 입력받은 문자열을 리턴
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
