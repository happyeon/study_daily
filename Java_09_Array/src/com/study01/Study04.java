package com.study01;

public class Study04 {
	
	public static void main(String[] args) {
		
		// 값 비교
		String[] name = new String[5];
		name[0] = "김연경";
		name[1] = "김혜수";
		name[2] = "고현정";
		name[3] = "김연경";
		name[4] = new String("김연경");
	
		System.out.println(name[0] == name[1]);		  // false(값이 다름)
		System.out.println(name[0] == name[3]);		  // true(같은 객체를 참조)
		System.out.println(name[0] == name[4]);		  // false(다른 객체를 참조)
		System.out.println(name[3].equals(name[4]));  // true(문자열이 동일)
		
	}

}
