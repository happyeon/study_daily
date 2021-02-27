package Package02;

public class Type_Casting_02 {
	
	public static void main(String[] args) {
		
		// 문자와 숫자도 형 변환이 될까?
		
		System.out.println("--------기본타입(정수형,실수형) -> char -------------");
		// 1. 기본타입(정수형,실수형) -> char
		byte b1 = 88;
		double d1 = 5.3;
		
		char c1 = (char) b1;
		System.out.println("65 -> " + c1);
		char c2 = (char) d1;
		System.out.println("5.3 -> " + c2);
		// 88가 아닌 X가 나오는 이유?
		// 유니코드(아스키코드)로 변환되기 때문
		
		System.out.println(" ");
		System.out.println("--------char -> 기본타입(정수형,실수형) -------------");
		// 2. char -> 기본타입(정수형,실수형)
		char c3 = '^';
		
		int i1 = (int) c2;
		System.out.println("'^' -> " + i1);
		
		System.out.println(" ");
		System.out.println("--------char -> 기본타입(정수형,실수형) ++연산 -------------");
		// 3. char -> int (+연산)
		char c4 = 'd';
		char c5 = 'D';
		int i2 = c4 + c5;		// int가 더 큰 타입이기 때문에 묵시적 형변환 가능
		byte b2 = (byte) (c4 + c5); 	// 얘는 왜 값이 -88이 나오지?
		
		
		System.out.println(i2);
		System.out.println(b2);
		
		System.out.println(" ");
		System.out.println("--------String -> 기본타입 -------------");
		// 4. String -> 기본 타입
		String s1 = "100";
		String s2 = "2021";
		String s3 = "Hello 2021";
		String s4 = "true";
		
		
		System.out.println("String → byte : Byte.parseByte(str)");
		byte b3 = Byte.parseByte(s1);
		System.out.println(b3);
		// byte b4 = Byte.parseByte(s3);  -> 숫자 이외의 요소를 포함할 경우에 예외 발생
		
		System.out.println("String → short : Short.parseShort(str)");
		Short sh1 = Short.parseShort(s2);
		System.out.println(sh1);
		
		System.out.println("String → int : Integer.parseInt(str)");
		int i3 = Integer.parseInt(s2);
		System.out.println(i3);
		
		System.out.println("String → long : Long.parseLong(str)");
		long l1 = Long.parseLong(s2);
		System.out.println(l1);
		
		System.out.println("String → float : Float.parseFloat(str)");
		float f1 = Float.parseFloat(s2);
		System.out.println(f1);
		
		System.out.println("String → double : Double.parseDouble(str)");
		double d2 = Double.parseDouble(s2);
		System.out.println(d2);
		
		System.out.println("String → boolean : Boolean.parseBoolean(str)");
		boolean boo = Boolean.parseBoolean(s2);
		System.out.println(boo);
		boolean boo1 = Boolean.parseBoolean(s4);
		System.out.println(boo1);
		
		System.out.println(" ");
		System.out.println("--------기본타입 -> String -------------");
		// 5. 기본 타입 -> String
		System.out.println("String.valueOf()");
		int i4 = 500;
		double d3 = 30.24;
		boolean boo2 = true;
		
		String s5 = String.valueOf(i4);
		System.out.println(s5);
		String s6 = String.valueOf(d3);
		System.out.println(s6);
		String s7 = String.valueOf(boo2);
		System.out.println(s7);
		
		
	}

}
