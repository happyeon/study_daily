package com.study02;

import com.study01.Study01;

public class Study03 {
	
	public static void main(String[] args) {
		
		// 다른 패키지에 있는 메소드 호출
		Study01.publicMethod();
		// public 접근제한자인 메소드만 호출 가능
		// protected 접근제한자는 상속일 경우에는 호출 가능
	}

}
