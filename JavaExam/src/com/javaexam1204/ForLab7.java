package com.javaexam1204;

public class ForLab7 {
	
	public static void main(String[] args) {
//		[ 실습2 ] 모양 출력(중첩 for)
//		1. ForLab7 라는 클래스를 생성한다.
//		2. STAR 라는 상수를 만든고 '*'으로 초기화 한다.
//		3. 다음과 같은 결과가 되도록 구현한다.
	//
//		    *******
//		    ******
//		    *****
//		    ****
//		    ***
//		    **
//		    *
		
		String star = "*";
		for(int i=7; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	

}
