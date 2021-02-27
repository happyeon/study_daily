package com.study01;

public class Study01 {
	
	public static void main(String[] args) {
		int x = 13;
		int y = 21;
		double z = 15.8;
		
		// 제어문
		
		System.out.println("-------단순 if문-------");
		// 1. if(조건) {조건이 참일 때 실행할 문장}
		if (x <= 20) {
			System.out.println("x의 값은 20보다 작거나 같습니다.");
		}
		
		// 2. if(조건) {조건이 참일 때 실행} else {조건이 거짓일 경우 실행}
		if (x > y) {
			System.out.println("x는 y보다 크다");
		} else {
			System.out.println("x는 y보다 작다");
		}
		
		// 3. if(조건1) {조건1이 참일 때 실행} else if(조건2) {조건2가 참일 때 실행} else{앞의 조건이 모두 거짓일 때 실행}
		if(x == y) {
			System.out.println("x와 y는 같다");
		} else if (y < z) {
			System.out.println("y는 z보다 작다");
		} else {
			System.out.println("앞의 조건들은 모두 거짓이다.");
		}
		
		
		System.out.println("-------다중 if문-------");
		// 2. 다중 if문
		int kor_score = 100;
		int math_score = 95;
		
		if (kor_score > 90) {
			if(math_score > 90) {
				System.out.println("S반 클래스에 합격했습니다.");
			} else {
				System.out.println("안타깝습니다. 다음 기회에");
			}
		} else {
			System.out.println("불합격하셨습니다.");
		}
		
	}

}
