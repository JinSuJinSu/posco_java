package com.javaexam1206;

public class WhileLab3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[ 실습1 ] - while 문으로 무한루프 처리
//		1. WhileLab3 라는 클래스를 생성한다.
//		2. 0부터 30사이의 난수를 추출한다.
//		    추출된 숫자가 1이면 'A', 2 이면 'B', ... 26이면 'Z' 를 출력하는데
//		    계속 난수 추출과 출력을 반복하다가 난수가 0이 추출되거나
//		    27~30이 추출되면 반복을 끝낸다.
//
//		    반복하는 동안 출력형식 :  	B(2)
//		    			A(1)
//					D(4)
//					  :
//		    마지막에는 "수행횟수는 x 번입니다"를 출력하고 종료한다.
		int num;
		int count=0;
		while(true) {
			 num = (int)(Math.random()*31);
			 if(num==0 || num==27 || num==28 || num==29 || num==30) {
				 count++;
				 System.out.println("수행횟수는 " + count + "번입니다.");
				 break;
			 }
			 else {
				 count++;
				 System.out.println((char)(num+64) + "(" + num + ")");
				 // 65를 char로 바꾸면 A가 되므로 num이 1이면 'A'를 출력하게 된다.
			 }
			 
		}
		

	}

}
