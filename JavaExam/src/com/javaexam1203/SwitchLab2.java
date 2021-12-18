package com.javaexam1203;

public class SwitchLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		[ 실습 2 ] switch 문 사용 실습 
//		1. ConditionOperLab.java를 복사해서 SwitchLab2.java를 생성한다.
//		2. 다음 기능을 if 문이 아닌 switch 문으로 변경하여 구현한다.
//		    추출된 값이 1이면 300 과 50 의 덧셈 연산을 처리한다.
//		    추출된 값이 2이면 300 과 50 의 뺄셈 연산을 처리한다.
//		    추출된 값이 3이면 300 과 50 의 곱센 연산을 처리한다.
//		    추출된 값이 4이면 300 과 50 의 나눗셈 연산을 처리한다.
//		    추출된 값이 5이면 300 과 50 의 나머지 연산을 처리한다.
//		3. 출력 형식(단, 결과를 출력하는 수행문장은 한 번만 구현한다.)
//		    결과값 : XX
		
		int number =(int)(Math.random()*5)+1;
		int result = 0;
		
		switch(number) {
		case 1:
			result = 300+50;
			break;
			
		case 2:
			result = 300-50;
			break;
			
		case 3:
			result = 300*50;
			break;
			
		case 4:
			result = 300/50;
			break;
			
		case 5:
			result = 300%50;
			break;
		default:
			System.out.println("숫자 범위를 다시 지정하세요");
			break; //default에서는 break 생략해도 된다.
			
		}
		
		System.out.println("number : " + number + ",  " + "result : " + result);

	}

}
