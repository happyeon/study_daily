package com.study02;

import java.util.Arrays;

public class Study01 {
	
	public static void main(String[] args) {
		
		// 배열 복사
		String[] original = {"배열을","복사하는","방법을","알아보자"};
		String[] copyArr = new String[10];
		
		System.out.println("-------for문-------");
		// 1. for문
		for(int i = 0; i < original.length; i++) {
			System.out.printf("%5s", original[i]);
		}
		System.out.println();
		
		System.out.println("-------System.arraycopy-------");
		// 2. System.arraycopy
		// System.arraycopy(object src, int srcPos, Object dest, int destPos, int length);
		System.arraycopy(original, 0, copyArr, 0, original.length);
		System.out.println(Arrays.toString(copyArr));
		copyArr[4] = "값 추가";
		System.out.println(Arrays.toString(copyArr));
		
		System.out.println(original.hashCode());
		System.out.println(copyArr.hashCode());
		
		System.out.println("-------ShallowCopy-------");
		// 3. ShallowCopy
		// 같은 객체의 주소값 대입 (복사본을 수정하면 원본도 수정), 주소값 복사
		String[] shallowCopy = original;
		
		System.out.println(Arrays.toString(shallowCopy));	// shallowCopy라는 빈 배열 주소값에 original 주소값을 넣는다.
		System.out.println(original == shallowCopy); 	// true (같은 주소값을 가짐)
		
		// 결과값이 같은 이유? 주소값이 같기 때문에 한 쪽이 변경되면 같이 값이 변경됨.
		shallowCopy[1] = "shallowCopy";
		System.out.println(Arrays.toString(original));
		System.out.println(Arrays.toString(shallowCopy));
		
		// 주소값
		System.out.println(original.hashCode());
		System.out.println(shallowCopy.hashCode());
		
		
		System.out.println("-------DeepCopy-------");
		// 4. DeepCopy
		// 새로운 객체 생성 (복사본을 수정해도 원본 변화 없음), 값 자체를 복사
		// 인덱스 값 하나하나 복사, 원본 객체에 복사 요청, System을 사용하여 복사
		String[] deepCopy1 = original.clone();
		System.out.println(Arrays.toString(deepCopy1));
		
		System.out.println(original.hashCode());
		System.out.println(deepCopy1.hashCode());
		
		// for문을 사용하여 인덱스 값 하나하나 복사
		String[] deepCopy2 = new String[original.length];
		for (int i = 0; i < deepCopy2.length; i++) {
			deepCopy2[i] = original[i];
		}
		System.out.println(Arrays.toString(deepCopy2));
		
		System.out.println(original.hashCode());
		System.out.println(deepCopy2.hashCode());
		
		// Array.fill 값초기화
		String[] deepCopy3 = new String[original.length];
		System.out.println(Arrays.toString(deepCopy3));
		Arrays.fill(deepCopy3, "deepCopy");      // 값 초기화
		System.out.println(Arrays.toString(deepCopy3));
		
		System.out.println(original.hashCode());
		System.out.println(deepCopy3.hashCode());
		
		// arraycopy -> 원하는 만큼 인덱스 복사 할 수 있다.
		System.arraycopy(original, 0, deepCopy3, 0, 2);
		System.out.println(Arrays.toString(deepCopy3));
		
	}

}
