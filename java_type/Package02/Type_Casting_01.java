package Package02;

public class Type_Casting_01 {
	
	public static void main(String[] args) {
		
		// 형변환
		
		// 1. 묵시적 형 변환(upCasting) : 작은 타입 -> 큰 타입
		// byte < short < int < long
		byte b1 = 33;
		short s1 = b1;
		int i1 = s1;
		long l1 = i1;
	
		System.out.println("byte(1) -> short(2) -> int(4) -> long(8) 묵시적 형변환");
		
		
		
		// 2. 명시적 형 변환(downCasting) : 큰 타입 -> 작은 타입
		// float < double
		double d1 = 3.8;
		float f1 = (float) d1;
		
		System.out.println("double(8) -> float(4) 명시적 형변환");
	
		
		
	}


}
