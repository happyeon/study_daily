package Package01;

public class Type_03 {
	
	public static void main(String[] args) {
		
		// 문자형, 문자열, 논리열
		// char, double, boolean
		
		System.out.println("---------char---------");
		// 1. char
		char c1 = 'a';
		char c2 = 'ㄱ';
		//char c3 = 'aa'; char은 문자 1개만 가질 수 있다.
		char c4 = '가';
		char c5 = '1';
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println("---------double---------");
		// 2. double
		String s1 = "a";
		String s2 = "hello";
		String s3 = "안녕하세요";
		
		System.out.println(s1);
		System.out.println(s2 + " " + s3);
		
		System.out.println("---------boolean---------");
		// 3. boolean
		boolean b1 = true;
		boolean b2 = false;
		System.out.println(b1);
		System.out.println(b2);
		
	}

}
