package com.study01;

import java.util.StringTokenizer;

public class Study03 {
	
	public static void main(String[] args) {
		
		String s = "https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/lang/String.html";
		
		// 1. charAt(int index) : 해당 인덱스의 값을 리턴해줌
		System.out.println(s.charAt(3));
		
		// 2. compareTo(String anotherString) : 2개의 문자열을 비교하고 int형 값을 반환
		System.out.println(s.compareTo("java"));
		
		// 3. concat(String str) :
		System.out.println(s.concat("java"));
		
		// 4. toUpperCase() : 대문자
		System.out.println(s.toUpperCase());
		
		// 5. toLowerCase() : 소문자
		System.out.println(s.toLowerCase());
		
		// 6. length() : 길이
		System.out.println(s.length());
		
		// 7. indexOf() : 해당 문자열의 위치 반환
		System.out.println(s.indexOf("api"));
		System.out.println(s.indexOf("java"));
		
		// 8. replace() : 값 변경
		String target = "java";
		String replacement = "DataBase";
		
		System.out.println(s.replace("java", "DataBase"));
		System.out.println(s.replace(target, replacement));
		
		// 9. 특정 단어만 대문자로 변환
		String x = "base";
		
		int start = s.indexOf(x);
		int end = start + x.length();
		
		String upper = s.substring(start,end).toUpperCase();
		System.out.println(s.replace(x, upper));
		
		// 10. 특정 문자 갯수 구하기
		char[] cha = s.toCharArray();
		int cnt = 0;
		
		for(int i = 0; i < cha.length; i++) {
			if (cha[i] == 'j') {
				System.out.printf("%c", cha[i]);
				cnt++;
			}
		}
		System.out.println("\nj의 총 갯수 : " + cnt);
		
		// 11. 대문자 갯수 구하기
		char[] ca = s.toCharArray();
		int count = 0;
		
		for(int i = 0; i < ca.length; i++) {
			if(Character.isUpperCase(ca[i])) {
				System.out.printf("%c ", ca[i]);
				count++;
			}
		}
		System.out.println("\n대문자 총 갯수 : " + count);
		
		// 12. 거꾸로 출력
		int index = 0;
		char[] ch = new char[s.length()];
		
		for(int i =s.length()-1; i > 0; i--) {
			ch[i] = s.charAt(index);
			index++;
		}
		System.out.println(ch);
		
		// 13. substring
		System.out.println(s.substring(5,7));
		
		// 14. split
		String[] sp = s.split("/");
		for (int i = 0; i < sp.length; i++) {
			System.out.println(sp[i]);
		}
		
		// 15. StringTokenizer
		StringTokenizer token = new StringTokenizer(s,"/");
		while(token.hasMoreTokens()) {
			System.out.println(token.nextToken());
		}
		
		
		
		
		
		
		
		
	}

}
