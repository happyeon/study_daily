package com.study01;

public class Study02 {
	
	public static void main(String[] args) {
		
		/*
		int[] myNumbers = {1, 2, 3};
		System.out.println(myNumbers[3]);
		*/
		// myNumbers는 0부터 2 인덱스까지 존재하기 때문에 3을 넣으면 에러가 난다.
		
		try {
			int[] yourNumbers = {1, 2, 3};
			System.out.println(yourNumbers[3]);		
		} catch (Exception e) {
			System.out.println("Something went wrong.");
		} finally {
			System.out.println("The finally statement lets you execute code, after try...catch, regardless of the result");
		}
		
		
	}

}
