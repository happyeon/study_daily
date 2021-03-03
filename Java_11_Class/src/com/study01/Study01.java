 package com.study01;

 // public class Study01 (extends Object)
public class Study01 {
	
	// field
	private int i;
	private int j;
		
	// constructor (생성자)
	
	// 기본 생성자
	public Study01(){
		// 생성자를 선언하지 않으면 자동으로 기본 생성자 생김
	}
	
	// 파라미터 있는 생성자
	public Study01(int i) {
		this.i = i;
	}
	public Study01(int i, int j) {}
	
	// getter & setter
	public int getStudy01() {
		// getter: 외부로 필드값 전달
		return i;
	}
	
	public void setStudy01(int i) {
		// setter: 외부의 값을 받아 필드의 값을 변경
		this.i = i;
	}
	
	// method
	public void studyHard() {
		
	}

}
