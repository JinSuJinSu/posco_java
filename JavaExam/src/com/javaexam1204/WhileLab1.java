package com.javaexam1204;

public class WhileLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[ 실습1 ]
//				1. WhileLab1 라는 클래스를 생성한다.
//				2. 5부터 10사이의 난수를 추출한다.
//				3. 1부터 추출된 숫자값까지의 각 숫자들의 제곱값을 행단위로 출력한다.
//				   (하나의 클래스안에 for 와 while 로 각각 구현한다.)
//				   ===>  7이 추출되면
//				    [ for 결과 ]
//				     1 -> 1
//				     2 -> 4
//				     3 -> 9
//				     4 -> 16
//				     5 -> 25
//				     6 -> 36
//				     7 -> 49
//				    [ while 결과 ]
//				     1 -> 1
//				     2 -> 4
//				     3 -> 9
//				     4 -> 16
//				     5 -> 25
//				     6 -> 36
//				     7 -> 49
		
		int num = (int)(Math.random()*6)+5;
		System.out.println("number : " + num);
		
		System.out.println("for문 결과");
		for(int i=1; i<=num; i++) {
			System.out.println(i +  " -> "  + (int)Math.pow(i, 2));
		}
		
		System.out.println();
		System.out.println("while문 결과");
		int startNum=1;
		while(startNum<=num) {
			System.out.println(startNum +  " -> "  + (int)Math.pow(startNum, 2));
			startNum++;
		}

	}

}
