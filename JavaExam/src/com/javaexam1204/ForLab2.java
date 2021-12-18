package com.javaexam1204;

public class ForLab2 {
	
	public void judgement(int num) {
		if(num%2==0) {
			System.out.println(num + " : 짝수");
		}
		else {
			System.out.println(num + " : 홀수");
		}
	}

	public static void main(String[] args) {
		
//		[ 실습 2 ]
//				1. ForLab2 이라는 클래스를 만든다.
//				2. 다음과 같은 결과가 출력되도록 구현한다.
				
		// TODO Auto-generated method stub
		ForLab2 object = new ForLab2();
		for(int i=9; i>=4; i--) {
			object.judgement(i);
		}

	}

}
