package com.javaexam1204;

public class ForLab8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[ 실습3 ] 모양 출력(중첩 for)
//		1. ForLab8 라는 클래스를 생성한다.
//		2. 다음과 같은 결과가 되도록 구현한다.
//
//		    A
//			BC
//			DEF
//			GHIJ
//			KLMNO
		int startNum=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print((char)('A'+ startNum));
				startNum+=1;
			}
			System.out.println();
		}

	}

}
