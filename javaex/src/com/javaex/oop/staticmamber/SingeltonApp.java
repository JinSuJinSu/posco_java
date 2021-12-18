package com.javaex.oop.staticmamber;

public class SingeltonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Singleton s1 = new Singleton();
		Singleton s1 = Singleton.getInsatance();
		Singleton s2 = Singleton.getInsatance();
		
		// 객체 주소가 같으면 같은 객체다.
		System.out.println("s1, s2 값은 같은 객체?" + (s1==s2));

	}

}
