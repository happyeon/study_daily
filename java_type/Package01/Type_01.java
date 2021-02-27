package Package01;

public class Type_01 {
	
	public static void main(String[] args) {
		
		// 정수형 type
		// byte, short, int, long
		
		System.out.println("---------byte---------");
		// 1. byte : 1byte, -128 ~ 127
		byte b1 = -128;
		System.out.println(b1);
		
		byte b2 = 0;
		System.out.println(b2);
		
		byte b3 = 127;
		System.out.println(b3);
		
		// 아래와 같이 범위를 초과한 값을 넣으면 에러남
		//byte b4 = 128;
		//System.out.println(b4);
		
		
		
		System.out.println("---------short---------");
		// 2. short : 2byte, -32768 ~ 32767
		short s1 = -32768;
		System.out.println(s1);
		
		short s2 = 11;
		System.out.println(s2);
		
		short s3 = 32767;
		System.out.println(s3);
		
		short sSum = (short) (s2 + s3);
		System.out.println(sSum);
		// sSum의 값은 32778일까? 아닐까?
		// 정답 -> 아님! 값은 -32758이 나옴
		// 이유는 2진법과 관련이 있음!
		
		
		System.out.println("---------int---------");
		// 3. int: 4byte, -2147483648 ~ 2147483647, Java 정수 연산의 기본 타입
		int i1 = -2147483648;
		System.out.println(i1);
		
		int i2 = 2147483647;
		System.out.println(i2);
		
		
		System.out.println("---------long---------");
		// 4. long : 8byte, -9223372036854775808 ~ 9223372036854775807
		long l1 = -9223372036854775808l;
		System.out.println(l1);
		/* 숫자 뒤에 l(L)을 붙여주는 이유?
		 * 정수 연산의 기본 타입은 int이기 때문에 기본적으로 int의 범위 내에서 인식을 한다. 
		 * 하지만 long의 범위가 int보다 넓기 때문에 뒤에 l을 붙여줌으로써 값이 long타입인 것을 확인시켜 준다.
		*/ 
		
		long l2 = 9223372036854775807L;
		System.out.println(l2);
		
		System.out.println("---------2진수, 8진수, 16진수---------");
		
		// 2진수 : ob
		System.out.println("2진수: " + 0b111);
		// 8진수 : 00
		System.out.println("8진수: " + 00111);
		// 16진수 : 0x
		System.out.println("16진수: " + 0x111);
		
	}


}
