package com.study01;

public class Study01 {
	
	public static void main(String[] args) {
		
		// method: 명령문들의 집합
		// 접근제한자 메모리영역 리턴타입 메소드명 (파라미터) {명령;}
		// 접근제한자 : public(+)  protected(#)  default(~)  private(-)
		// 메모리영역 : static  non-static -> 호출하는 방법이 다름
		// 리턴타입 : method 내부의 명령들을 모두 수행 후 리턴되는 값의 타입, 리턴 타입 없으면 void
		// 파라미터 : method 외부에서 전달되는 값을 받아서, method 내부에서 사용하기 위한 변수
		// 아규먼트 : method 외부에서 전달되는 값
		
		Study01.publicMethod();  	// 같은 클래스 안에 있는 다른 메소드를 호출할 때는 앞에 클래스. 생략 가능
		
		publicMethod();
		protectedMethod();
		defaultMethod();
		privateMethod();
		
	}
	
	// 1. public 접근제한자
	public static void publicMethod() {
		System.out.println("public 접근제한자: 어디서나(패키지, 클래스) 접근, 참조 가능");
	}
	
	// 2. protected 접근제한자
	protected static void protectedMethod() {
		System.out.println("protected 접근제한자: 상속일 경우엔 상속된 곳에서, 상속이 아닐 경우엔 같은 패키지 내에서 접근, 참조 가능");
	}
	
	// 3. default 접근제한자 
	static void defaultMethod() {
		System.out.println("default 접근제한자: 같은 패키지 내에서만 접근, 참조 가능");
	}
	
	// 4. private 접근제한자 
	private static void privateMethod() {
		System.out.println("private 접근제한자: 같은 클래스 내에서만 접근, 참조 가능");
	}
	
	// 5. non-static 메모리영역
	protected void nonStaticMemory() {
		System.out.println("non-static : static과 호출 방법이 다름");
	}

}
