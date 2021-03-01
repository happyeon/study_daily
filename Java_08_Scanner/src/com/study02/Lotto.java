package com.study02;

import java.util.Scanner;

public class Lotto {
	
	public static void main(String[] args) {
		
		// 1에서 20 사이의 숫자 중 5개를 뽑는 로또 게임 만들어보자.
		Scanner sc = new Scanner(System.in);
		System.out.println("1에서 20사이 숫자 5개를 입력하세요.");
		int i = sc.nextInt();
		
		System.out.println("당첨 번호는 바로....!");
		randomNumber();
		randomNumber();
		randomNumber();
		randomNumber();
		randomNumber();
	}
	
	public static void randomNumber() {
		int i = (int) (Math.random() * (20 - 1 + 1)) + 1;
		System.out.print(i+ "\t");
	}

}
