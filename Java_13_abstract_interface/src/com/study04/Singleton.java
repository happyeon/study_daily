package com.study04;

public class Singleton {
	
	// 싱글톤: 애플리케이션이 시작될 때 어떤 클래스가 최초 한 번만 메모리를 할당하고 그 메모리에 인스턴스를 만들어 사용
	// 고정된 메모리 영역을 얻으면서 한 번의 new로 인스턴스를 사용하기 때문에 메모리 낭비를 방지할 수 있음
	// 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유시킬 경우 다른 클래스의 인스턴스들 간에 결합도가 높아져 객체지향설계원칙에 어긋남.
	// 따라서 수정이 어려워지고 테스트하기 어려워짐
	
	private Singleton() {
	}
	
	private static class dd {
		public static final Singleton INSTANCE = new Singleton();
	}
	
	public static Singleton getInstance() {
		return dd.INSTANCE;
	}

}
