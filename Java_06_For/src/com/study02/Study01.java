package com.study02;

public class Study01 {
	
	public static void main(String[] args) {
		
		int cnt = 25;
		int sum = 0;
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				
				if ((i == j) || (i + j == 4)) {
					sum += cnt;
				}
				System.out.printf("%3d",cnt--);
			}
			System.out.println("\n------------------");
		}
		System.out.println("합계 : " + sum);
	}

}
