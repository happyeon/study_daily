package Package01;

public class Type_02 {
	
	public static void main(String[] args) {
		
		// 실수형 Type
		// float, double
		
		
		System.out.println("----------float---------");
		// 1. float : 4byte, 1.4E-45 ~ 3.4028235E38
		float f1 = 5.5f;
		//float f2 = 7.1;  -> 에러 뜨는 이유? 실수형의 기본 타입은 double이기 때문에 숫자 뒤에 f(F)를 붙여줘야 함
		float f3 = 3.7F;
		
		System.out.println(f1);
		System.out.println(f3);
		
		System.out.println("----------double---------");
		// 2. double : 8byte, 4.9E-324 ~ 1.7976931348623157E308, 실수 연산의 기본 타입
		double d1 = -11.3;
		double d2 = 132.4d;
		double d3 = 33.33D;
		// double은 뒤에 d(D)를 붙여줘도 안붙여도 상관없음!
		System.out.println(d1 + d2 * d3);
		
		
	}

}
