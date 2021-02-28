package com.study01;

public class Study02 {
	
	
	public static void main(String[] args) {
		
		// break, continue
		
		// 1. break : switch문이나 반복문 안에서 break가 나오면 블록을 벗어난다.
		int x = 1;
		while(true) {
			System.out.println(x);
			x++;
			if(x > 10) {
				break;
			}
		}
		
		
		// 2. continue : 반복문에서만 사용
		//			   	 continue 이후의 문장을 실행하지 않고 제어를 반복문의 처음으로 옮긴다.
		int i = 0;
		int cnt = 0;
		
		while (i < 10) {
			i++;
			if (i%3 != 0) {
				continue;
			}
			cnt++;
			System.out.println("3 X " + cnt + " = " + i);
		}
		
		
	}
	
}
