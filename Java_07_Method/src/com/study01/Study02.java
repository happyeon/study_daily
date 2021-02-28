package com.study01;

public class Study02 {
	
	public static void main(String[] args) {
		
		// static 호출
		// 클래스명.메소드명();
		Study01.publicMethod();
		Study01.protectedMethod();
		Study01.defaultMethod();
		System.out.println("private 메소드는 같은 클래스 내에서만 호출할 수 있다.");
		
		// non-static 호출
		// 클래스명 변수 = new 클래스명();
		// 변수.메소드명();
		Study01 nonstatic = new Study01();
		nonstatic.nonStaticMemory();
		
	}

}
