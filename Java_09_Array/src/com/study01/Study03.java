package com.study01;

public class Study03 {
	
	public static void main(String[] args) {
		
		// for문과 if문을 이용하여 배열 값 변경하기
		String a[] = new String[5];
		a[0] = "Hello. ";
		a[1] = "My ";
		a[2] = "name ";
		a[3] = "is ";
		a[4] = "nana";
		
		int b[][] = { {2, 2}, {33, 4, 77}, {13} };
		
		
		
		// 1. 1차원 배열
		dimensionalArray(a);
		
		// 2. 2차원 배열
		twoDimensionalArray(b);
		
	}
	
	public static void dimensionalArray(String[] arr) {
		// 이름을 nana에서 amy로 바꿔서 출력하자
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("nana")) {
				arr[i] = "amy";
			}
			System.out.printf("%s ", arr[i]);
		}
		System.out.println();
	}
	
	public static void twoDimensionalArray(int[][] arr) {
		// 33 -> 22, 13 -> 2020
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (arr[i][j] == 33) {
					arr[i][j] = 22;
				}
				if (arr[i][j] == 13) {
					arr[i][j] = 2020;
				}
				System.out.printf("%7d", arr[i][j]);
			}
		}
		
	}

}
