package com.study02;

public class Study03 {
	
	public static void main(String[] args) {
		
		// 열거타입
		// 한정된 값을 갖는 타입
		
		month thismonth = month.JANUARY;
		month nextmonth = month.FEBRUARY;
		month n;
		n = month.OCTOBER;
		
		month s = null;
		s = month.DECEMBER;
	}
	
	public enum month {
		// 열거상수 -> 관례적으로 대문자 사용
		JANUARY, FEBRUARY, MARCH, APRIL, MAY, JUNE, JULY, AUGUST, SEPTEMBER, OCTOBER, NOVEMBER, DECEMBER 
	}

}
