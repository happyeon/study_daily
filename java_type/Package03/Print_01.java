package Package03;

public class Print_01 {
	
	public static void main(String[] args) {
		
		// 시스템 입출력
		
		System.out.println("-----------System.out.print();--------------");
		// 1. System.out.print();
		System.out.print("hello");		// console에 출력
		System.out.print("이스케이프 문자 사용하면 줄바꿈 가능\n");    // \n : 줄바꿈
		
		System.out.println("-----------System.out.println();--------------");
		// 2. System.out.println();
		System.out.println("hello");	// console에 출력 + enter
		System.out.println("글자 사이에 \t공간을 만들어 볼까?");	 // \t : 탭만큼 띄움
		
		
		System.out.println("-----------System.out.printf();--------------");
		// 3. System.out.printf();
		System.out.printf("hello. my name is %s", "suyeon\n");	// formatter, 형식화된 문자열 출력
		System.out.println("An interpreter for printf-style format strings.");       // java.base.util.Formatter
		System.out.println("This class provides support for layout justification and alignment, common formats for numeric, string, and date/time data, and locale-specific output.");
		System.out.printf("안녕. 내 이름은 %s야. 나이는 %d살이고, 집에서 학교까지의 거리는 %2.1fkm야.", "영희", 8, 1.2);
		
		
	}

}
