package com.study01;

import java.util.Arrays;

public class Study01 {
	
	public static void main(String[] args) {
		
		// array
		// 같은 타입의 여러 개의 값을 효과적으로 관리하기 위한 객체
		// 참조타입 : 배열객체가 저장되어 있는 주소값을 통해 사용
		// 같은 타입의 데이터만 저장할 수 있다.
		// 한 번 생성된 배열은 길이를 늘리거나 줄일 수 없다.
		// 데이터를 연속된 공간에 나열하고 각 데이터에 인덱스(index) 부여한 자료 구조
		
		
		// 1. 선언, 정의, 초기화 다 따로
		int [] a;			// 선언
		a = new int[3];		// 정의
		
		// int [] a = new int[5]; 이렇게 한 줄로 선언할 수도 있음
		
		a[0] = 2;	// 초기화
		a[1] = 1;
		a[2] = 3;
		//a[3] = 5;	// 에러 
		
		System.out.println(a);						// 배열의 주소값 출력
		System.out.println(Arrays.toString(a));		// 배열의 내용 전체 출력
		System.out.println(a[0]);	                // 해당 인덱스의 값 출력
		
		
		// 2. 선언, 정의, 초기화 한 번에
		int [] b = new int [] {20, 30, 10, 8};		// 선언, 정의, 초기화
		
		System.out.println(b);
		System.out.println(Arrays.toString(b));
		System.out.println(b[3]);
		
		
		// 3. 배열 변수 미리 선언, 값 목록 나중에 결정
		String [] names = null;		// 참조할 배열 객체 없는 경우 배열 변수는 null 값으로 초기화
		names = new String[] {"김서형", "이보영", "김연경"};
		
		System.out.println(Arrays.toString(names));
		
		
		// 4. new 연산자를 사용하지 않아도 객체 생성 가능
		int [] c = {1, 2, 3}; 
		
		// int [] c;
		// c = {1, 2, 3};  배열 변수 선언한 뒤에는 다른 실행문에서 값 목록으로 배열 생성 불가능
		
		String [] address = {"서울특별시", "강남구", "OO동"};
		String [] addressNew = new String [] {"서울특별시", "서초구", "XX동"};
		
		System.out.println(Arrays.toString(address));
		System.out.println(Arrays.toString(addressNew));
		
	}

}
