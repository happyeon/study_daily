package com.study01;

public class Study02 {
	
	public static void main(String[] args) {
		
		// 값 비교
		String a = "hell, world";
		String b = "hello, world";
		String c = new String("hello, world");
		
		System.out.println(a==b);			// true	   // == : 주소값/번지값 비교
		System.out.println(a==c);			// false
		System.out.println(a.equals(b));	// true	   // .equals() : 값 비교	
		System.out.println(a.equals(c));	// true
		
	}

}
