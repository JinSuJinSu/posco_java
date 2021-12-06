package com.javaex.oop.staticmamber;


// 어떤 상황에서든 단 1개의 인스턴스만 유지
public class Singleton {
	// static 블록에서 생성자 호출
	private static Singleton insatance = new Singleton();
	// 생성자
	private Singleton() {
		
	}
	
	
	//getter
	public static Singleton getInsatance() {
		return insatance;
	}

}
