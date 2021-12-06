package com.javaex.oop.goods.v4;

// v4: this
// this : 현재 인스턴스 자체
// this() : 현재 클래스 내의 다른 생성자 호출
public class Goods {
	// 필드
	private String name;
	private int price;
	
	// 생성자1
	public Goods(String name) {
		this.name = name;
	}
	
	// 생성자2
	public Goods(String name, int price) {
		this(name); // 다른 생성자 호출
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	// setter가 없으면 readOnly
//	public void setName(String name) {
//		this.name = name;
//	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.println("상품명:" + name);
		System.out.println("가격:" + price);
	}
}
