package com.javaex.api.information;

public class WrapperEx {
	
	public static void main(String[] args) {
		Integer i = new Integer(10); // deprecated
		Integer i2 = Integer.valueOf(10);
		Integer i3 = Integer.valueOf("10");
		
		// 자동 박싱
		Integer i4 = 10;  // Integer i4 = Integer.valueOf(10);
		
		// 자동 언박싱
		int value = i4;   // int value = i4.intValue();
		
		// 포장된 값의 비교
		System.out.println(i==i2); // 어디까지나 객체이다.(false)
		System.out.println(i.intValue() == i2.intValue()); // 정수 비교다(true)
		System.out.println(i.equals(i2)); // true
		
		
		
		
	}

}
