package com.study01;

import java.util.Arrays;

public class Study02 {
	
	public static void main(String[] args) {
		
		// 이차원배열
		
		// 1.
		int [][] a = new int[2][3];
		a[0][0] = 10;
		a[0][1] = 21;
		a[0][2] = 13;
		a[1][0] = 1;
		a[1][1] = 15;
		a[1][2] = 91;
		
		System.out.println(a);
		System.out.println(Arrays.toString(a));			// 1차원 배열만 출력 가능
		System.out.println(Arrays.deepToString(a));		// 다차원 배열의 값들도 모두 출력 가능
		
		// 2. 계단식 구조 (잘 안씀)
		int [][] b = new int[2][];
		
		b[0] = new int[3];
		b[1] = new int[4];
		
		// 3. 
		String [][] name = new String[][] { {"보라돌이", "뚜비"}, {"나나", "뽀"} };
		
		System.out.println(name[1][1]);
		
		// 4. 
		int [][] c = { {2021, 03, 01}, {1999, 03, 31} };
		
		System.out.println(c[0][1]);
		
				
		
	}

}
