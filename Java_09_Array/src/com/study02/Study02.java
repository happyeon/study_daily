package com.study02;

public class Study02 {
	
	public static void main(String[] args) {
		
		int[] a = {1, 2, 3};
		String[][] b = { {"hello","world"}, {"안녕"} };
		
		// 향상된 for문
		// for(타입 변수 : 배열) {실행문;}
		for(int i : a) {
			System.out.println(i);
		}
		
		for(String[] s : b) {
			for(String f : s) {
				System.out.println(f);
			}
		}
	}

}
