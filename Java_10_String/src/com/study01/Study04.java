package com.study01;

public class Study04 {
	
	public static void main(String[] args) {
		
		// String		  : 문자열 연산이 적고 멀티쓰레드 환경일 경우
		// StringBuffer	  : 문자열 연산이 많고 멀티쓰레드 환경일 경우
		// StringBuilder  : 문자열 연산이 많고 단일쓰레드이거나 동기화를 고려하지 않아도 되는 경우
		
		// 공통점 : mutable
		
		// 1. StringBuffer
		// 동기화 지원, 멀티쓰레드 환경에서 안전
		String s = "Hello. Nice to meet you.";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb);
		System.out.println(s.hashCode());
		System.out.println(sb.hashCode());
		
		System.out.println(sb.append("My name is nana"));
		System.out.println(sb);
		System.out.println(sb.hashCode());  // 값이 바꼈는데 여전히 주소값이 동일
		
		
		// 2. StringBuilder
		// 동기화 지원 X, 
		StringBuilder si = new StringBuilder(s);
		System.out.println(s.hashCode());
		System.out.println(si.hashCode());
		
		System.out.println(si.append("Bye"));
		System.out.println(si);
		System.out.println(si.hashCode());
		
	}

}
