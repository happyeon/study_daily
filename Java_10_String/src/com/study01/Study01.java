package com.study01;

public class Study01 {
	
	public static void main(String[] args) {
		
		// String
		// https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html
		
		// 참조타입이지만 기본타입처럼 사용
		
		String a = null;	// String 초기값: null
		a = "Nice ";
		String b = "day";
		
		System.out.println(a+b);
		
		// String concatenation
		int i = 1;
		int j = 3;
		String s = i + j + b;
		System.out.println(s);
		s= b + j + i;
		System.out.println(s);
	}

}
