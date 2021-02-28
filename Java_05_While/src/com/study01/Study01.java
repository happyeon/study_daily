package com.study01;

public class Study01 {
	
	public static void main(String[] args) {
		
		// 반복문
		
		// 1. while (조건) {조건이 참일 때 반복될 명령;}
		//    조건이 거짓이면 한 번도 수행하지 않는다.
		int day = 1;
		while (day < 32) {
			System.out.println("오늘은 3월" + day + "일 입니다.");
			day++;
		}
				
		
		// 2. do {조건이 참일 때 반복될 명령} while (조건);
		//	  do~ while문은 조건을 만족하지 않아도 적어도 한 번은 출력한다.
		int i = 10;
		do {
			System.out.println("조건 만족하지 않아도 한 번은 출력");
			i++;
		} while (i < 9);
		
		
	}

}
