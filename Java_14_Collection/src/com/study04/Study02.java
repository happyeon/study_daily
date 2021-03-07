package com.study04;

import java.util.LinkedList;

public class Study02 {
	
	public static void main(String[] args) {
		// LinkedList : 양방향 포인터 구조로 데이터의 삽입, 삭제가 빈번할 경우 데이터의 위치정보만 수정하면 되기에 유용
		
		LinkedList<String> fruits = new LinkedList<String>();
		fruits.add("pineapple");
		fruits.add("grape");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("melon");
		
		System.out.println(fruits);
		
		// addFirst
		fruits.addFirst("strawberry");
		System.out.println(fruits);
		
		// addLast
		fruits.addLast("mangosteen");
		
		// removeFirst
		fruits.removeFirst();
		
		// removeLast
		fruits.removeLast();
		
		// getFirst
		fruits.getFirst();
		
		// getLast
		fruits.getLast();
	}

}
