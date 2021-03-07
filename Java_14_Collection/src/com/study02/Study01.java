package com.study02;

// 출처: https://www.w3schools.com/java/java_hashset.asp

import java.util.HashSet;

public class Study01 {
	
	public static void main(String[] args) {
		
		// HashSet : 가장 빠른 임의 접근 속도, 순서를 예측할 수 없음
		// A HashSet is a collection of items where every item is unique.
		
		// HashSet
		HashSet<String> cars = new HashSet<String>();
		
		// Add Items
		cars.add("hyundai");
		cars.add("kia");
		cars.add("tesla");
		cars.add("ford");
		cars.add("cooper");
		
		// 출력 -> 순서대로 출력이 되지 않는 것을 알 수 있음
		System.out.println(cars);
		
		// contains (HashSet 안에 해당 아이템이 들어 있는지 확인)
		cars.contains("kia");
		System.out.println(cars.contains("kia"));
		
		// remove (원하는 아이템 제거)
		cars.remove("ford");
		System.out.println(cars);
		
		// size (HashSet안에 아이템이 얼마나 들어있는지 확인)
		cars.size();
		System.out.println(cars.size());
		
		// Loop through a HashSet
		for(String i : cars) {
			System.out.println(i);
		}
		
		// clear (모두 제거)
		cars.clear();
		System.out.println(cars);
		
		
		
		
	}

}
