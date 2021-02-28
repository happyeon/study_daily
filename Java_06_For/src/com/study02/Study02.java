package com.study02;

public class Study02 {
	
	public static void main(String[] args) {
		
		// star
		
		System.out.println("------2차원 배열------");
		// 1. 2차원 배열 별찍기
		for (int i = 0; i < 5; i++) {		// 5줄 생성
			for (int j = 0; j < 5; j++) {	// 빈칸 갯수 만큼 별 출력
				System.out.print("*");
			}
			System.out.println();	// 줄바꿈
		}
		
		System.out.println("------삼각형 (오른쪽)------");
		// 2. 삼각형 모양 (오른쪽 방향)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------삼각형 (왼쪽)------");
		// 3. 삼각형 모양 (왼쪽 방향)
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i+1; j--) {
				System.out.print(" ");
				}
			for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------큰 삼각형------");
		// 4. 큰 삼각형 모양
		for (int i = 0; i < 5; i++) {
			for(int j = 4 - i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int k = 0; k < 2* i + 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------역삼각형 (왼쪽)------");
		// 5. 역삼각형 모양 (왼쪽 방향)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 5- i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("------역삼각형 (오른쪽)------");
		// 6. 역삼각형 모양 (오른쪽 방향)
		for (int i = 0; i < 5; i++) {
			for(int j = 0; j < 5-i; j++) {
				System.out.print("*");
			}
			for(int k = 0; k < i; k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		System.out.println("------큰 역삼각형------");
		// 7. 큰 역삼각형 모양
		for (int i = 0; i < 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int k = 9; k >= i*2+1; k--) {		// 각행의 홀수(삼각형줄)만큼 별 출력
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("------마름모------");
		// 8. 마름모 모양
		for (int i = 0; i < 5; i++) {
			for(int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i*2+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(" ");
			}
			for(int j = 7; j >= i*2+1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}
	
	


}
