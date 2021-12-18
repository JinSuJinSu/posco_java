package com.javaexam1210;

public class MethodLab3 {
	
	public static void main(String[] args) {
		
//		[ 실습 3 ]
//		1. 클래스명 : MethodLab3
//
//		2. 구현해야 하는 메서드
//		    public static int getRandom(int n) 
//			1 부터 n 까지 범위의 난수 리턴
//		    public static int getRandom(int n1, int n2) 
//			n1 부터 n2 범위의 난수 리턴
//
//		3. main() 메서드
//		       getRandom(10) 을 5번 호출하고 리턴값을 하나의 행에 출력
//			x, x, x, x, x
//
//		       getRandom(10, 20) 을 5번 호출하고 리턴값을 하나의 행에 출력
//			x, x, x, x, x
		
		int result1;
		int result2;
		
		for(int i=0; i<5; i++) {
			result1=getRandom(10);
			System.out.print(result1 + " ");
		}
		System.out.println();
		for(int i=0; i<5; i++) {
			result2=getRandom(10,20);
			System.out.print(result2+ " ");
		}
		
	}
	
	public static int getRandom(int n) {
		return (int)(Math.random()*n)+1;
	}
	
	public static int getRandom(int n1, int n2) {
		return (int)(Math.random()*(n2-n1+1))+n1;
	}

}
