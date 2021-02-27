package Package01;

public class Types_of_Operator {
	
	public static void main(String[] args) {
		
		System.out.println("---------사칙연산---------");
		// 1. 사칙연산
		System.out.println("+:덧셈  -:뺄셈  *:곱셈  /:나눗셈  %:나머지");
		int a = 13;
		double b = 2.1;
		System.out.printf("%d + %f = %f\n", a, b, a+b);
		System.out.printf("%f - %d = %f\n", b, a, b-a);
		System.out.printf("%d * %f = %f\n", a, b, a*b);
		System.out.printf("%d / %f = %f\n", a, b, a/b);
		System.out.printf("%d %% %f = %f\n", a, b, a%b);
		
		System.out.println("---------대입연산---------");
		// 2. 대입연산
		System.out.println("+= : 'x = x + 1',  -= : 'x = x - 1',  *= : 'x = x * 1',  /= : x = x / 1,  %= : 'x = x % 1'");
		int x = 3;
		double y = 3.8;
		System.out.println("x = " + x);
		x += 1;
		System.out.println("x = " + x);
		x *= y;			// 15.2가 아닌 15가 출력되는 이유?
		System.out.println("x = " + x);
		y *= x;
		System.out.println(y);
		
		System.out.println("---------증감연산---------");
		// 3. 증감연산
		System.out.println("전위 연산자(++x, --y): 연산 first, return later  후위 연산자(x++, y--): return first, 연산 later");
		int c = 8;
		double z = 1.7;
		System.out.println(c);
		System.out.println(c++);
		System.out.println(z);
		System.out.println(++z);
		
		
		System.out.println("---------논리연산---------");
		// 4. 논리연산
		System.out.println("&: and,  |: or");
		System.out.println(true & true);
		System.out.println(false && true);		// 앞의 값이 false면, 뒤의 조건을 확인하지 않고 바로 false 출력
		System.out.println(false | true);
		System.out.println(true || false);		// 앞의 값이 true면, 뒤의 조건을 확인하지 않고 바로 true 출력
		System.out.println(false | false);
		
		
		System.out.println("---------관계연산---------");
		// 5. 관계연산
		System.out.println("== : 같다,  != : 같지 않다,  > : 크다,  >= : 크거나 같다,  < : 작다,  <= : 작거나 같다");
		int a1 = 23;
		int a2 = 12;
		double b1 = 12.3;
		double b2 = 23.0;
		
		System.out.println(a1 == b2);
		System.out.println(a2 != b1);
		System.out.println(a1 > a2);
		System.out.println(b1 <= b2);
		
		System.out.println("---------삼항연산---------");
		// 6. 삼항연산
		System.out.println("type 변수 = (조건)? 참일 때 리턴값 : 거짓일 때 리턴값");
		int kor_score = 80;
		String grade = (kor_score > 90)? "A" : "B";
		System.out.println(grade);
		
		System.out.println("---------비트연산---------");
		// 7. 비트연산
		System.out.println("&: and  ^: xor  |: or  ~: not  <<: 왼쪽 시프트  >>: 오른쪽 시프트");
		// int -> 4byte -> 32bit
		int aa = 10;
		//  0000 0000 0000 0000 0000 0000 0000 1010
		
		int bb = 2;
		//  0000 0000 0000 0000 0000 0000 0000 0010
		
		System.out.println(aa & bb);
		//  0000 0000 0000 0000 0000 0000 0000 1010
		//  0000 0000 0000 0000 0000 0000 0000 0010
		// &------------------------------------------
		//  0000 0000 0000 0000 0000 0000 0000 0010
		
		System.out.println(aa | bb);
		//  0000 0000 0000 0000 0000 0000 0000 1010
		//  0000 0000 0000 0000 0000 0000 0000 0010
		// &------------------------------------------
		//  0000 0000 0000 0000 0000 0000 0000 1010
		
		System.out.println(~aa);
		//  0000 0000 0000 0000 0000 0000 0000 1010
		//  1111 1111 1111 1111 1111 1111 1111 0101
		
		int cc = 10;
		//  0000 0000 0000 0000 0000 0000 0000 1010
		// Integer.toBinaryString() : 2진수 변환
		System.out.println(Integer.toBinaryString(cc));    // 1010
		System.out.println(cc);    // 10
		
		System.out.println(Integer.toBinaryString(c >> 2));    // 10
		//  00 0000 0000 0000 0000 0000 0000 0000 10			
		System.out.println(cc >> 2);    // 2
			
		System.out.println(Integer.toBinaryString(cc << 1));    //10100
		//  000 0000 0000 0000 0000 0000 0000 1010 0
		System.out.println(cc << 1);    // 20
	}

}
