package com.study01;

public class Study01 {
	
	public static void main(String[] args) {
		
		// 제어문
		
		System.out.println("---------switch(수식)---------");
		int score = 80;
		switch(score/10) {
		case 10:
		case 9:
			System.out.println("A학점");
			break;		// break가 없으면 해당 값 밑으로 모두 출력된다. (fall through)
		case 8:
		case 7:
			System.out.println("B학점");
			break;
		case 6:
			System.out.println("C학점");
			break;
		case 5:
			System.out.println("D학점");
			break;
		default:
			System.out.println("재시험");
		}
		
	}

}
