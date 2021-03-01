package com.study01;

import java.util.Scanner;

public class Study01 {
	
	public static void main(String[] args) {
		
		// Scanner
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Scanner.html
		
		// A simple text scanner which can parse primitive types and strings using regular expressions.
		// A Scanner breaks its input into tokens using a delimiter pattern, which by default matches whitespace. 
		// The resulting tokens may then be converted into values of different types using the various next methods.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		String s = sc.next();		// Finds and returns the next complete token from this scanner.
		System.out.println("당신의 이름은 " + s + "입니다.");

		
		System.out.println("나이를 입력해주세요.");
		//int i = sc.nextInt();		// Scans the next token of the input as an int.
		//System.out.println("당신의 나이는 " + i + "살 입니다.");
		
		
		
		
	}

}
