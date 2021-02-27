package Package02;

public class Type_Casting_03 {

	public static void main(String[] args) {
		
		System.out.println("-----------기본타입 -> 참조타입 (boxing)------------");
		// 1. 기본타입 -> 참조타입
		byte b1 = 10;
		Byte b2 = Byte.valueOf(b1);
		System.out.println(b2);
		
		short s1 = 11;
		Short s2 = Short.valueOf(s1);
		System.out.println(s2);
		
		int i1 = 12;
		Integer i2 = Integer.valueOf(i1);
		System.out.println(i2);
		
		long x = 13l;
		Long y = Long.valueOf(x);
		System.out.println(y);
		
		float f1 = 15.1f;
		Float f2 = Float.valueOf(f1);
		System.out.println(f2);
		
		double d1 = 17.3;
		Double d2 = Double.valueOf(d1);
		System.out.println(d2);
		
		char c1 = 'a';
		Character c2 = Character.valueOf(c1);
		System.out.println(c2);
		
		boolean boo = true;
		Boolean boo1 = Boolean.valueOf(boo);
		System.out.println(boo1);
		
		
		System.out.println("----------참조타입 -> 기본타입 (unboxing)------------");
		// 2. 참조타입 -> 기본타입
		byte b3 = b2.byteValue();		// 명시적
		byte b4 = b2;					// 묵시적
		System.out.println(b3);
		System.out.println(b4);
		
		double d3 = d2.doubleValue();	// 명시적
		double d4 = d2;					// 묵시적
		System.out.println(d3);
		System.out.println(d4);
		
		char c3 = c2.charValue();		// 명시적
		char c4 = c2;					// 묵시적
		System.out.println(c3);
		System.out.println(c4);
		
		boolean boo2 = boo1.booleanValue();		// 명시적
		boolean boo3 = boo1;					// 묵시적
		System.out.println(boo2);
		System.out.println(boo3);
	}
	
}
