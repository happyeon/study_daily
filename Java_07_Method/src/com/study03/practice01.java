package com.study03;

public class practice01 {
	
	public static void amy_score(int i, int j, int k) {
		int sum = i + j + k;
		double avg = sum /3;
		System.out.printf("amy의 중간고사 점수의 총 합은 %d이고 평균은 %f이다.\n", sum, avg);
	}
	
	public void fruit(String i, String j) {
		System.out.printf("내가 좋아하는 과일은 %s와 %s 입니다.\n",i,j);
	}
	
	public static int sum(int i, int j, int k) {
		int result = i + j + k;
		System.out.println("총합은 " + result + " 입니다.");
		return result;
	}

}
