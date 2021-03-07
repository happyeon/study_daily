package com.study03;

// 출처: https://www.w3schools.com/java/java_arraylist.asp

import java.util.ArrayList;
import java.util.Collections;

public class Study01 {
	
	public static void main(String[] args) {
		
		// ArrayList : 단방향 포인터 구조로 각 데이터에 대한 인덱스를 가지고 있어 조회 기능에 성능이 뛰어남
		
		// create an ArrayList object
		ArrayList<String> cars = new ArrayList<String>();
		
		// add items
		cars.add("tesla");
		cars.add("kia");
		cars.add("hyundai");
		cars.add("BMW");
		cars.add("Mazda");
		
		// sort
		Collections.sort(cars);
		for(String i : cars) {
			System.out.println(i);
		}
		
		// get - 순서가 있기 때문에 가능
		cars.get(3);
		System.out.println(cars.get(3));
		
		// set - change an Item
		System.out.println(cars.get(0));
		cars.set(0, "opel");
		System.out.println(cars.get(0));
		
		// remove
		cars.remove(0);
		
		// size
		cars.size();
		
		// loop through an arraylist
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		for (String i : cars) {
			System.out.println(i);
		}
		
		// clear
		cars.clear();
		
	}

}
