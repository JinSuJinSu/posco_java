package com.javaex.basic;

public class OperatorEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		arithOperEx();
//		prefixIncrEx();
//		suffixIncrEx();
//		logicalOperEx();
//		bitOperEx();
//		bitShiftOperEx();
		conditionOperEx();

	}
	//3항 연산자
	private static void conditionOperEx() {
		int a = 10;
		//a가 짝수면 짝수, 홀수면 홀수 출력
		System.out.println(a + "는 " + (a%2==0 ? "짝수": "홀수"));
		
		int score = 85;
		String message;
		// 점수가 80점 이상이면 Good, 50점 미만이면 Fails, 그렇지 않으면 Pass
		message = score>=90 ? "Good" : score < 50 ? "Fail" : "Pass";
		System.out.println(message);
	}
	// 비트 시프트
	private static void bitShiftOperEx() {
		int val = 1;
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val<< 3));
		
		val = 0b1000;
		System.out.println(Integer.toBinaryString(val));
		System.out.println(Integer.toBinaryString(val>> 2)); //2비트 우측 시프트
		
	}
	// 비트 연산자
	private static void bitOperEx() {
		// int 에서만
		// 비트 단위의 미세한 제어에 이용
		int b1 = 0b11011101;
		int mask = 0b10101010;
		
		System.out.println(Integer.toBinaryString(b1));
		System.out.println(Integer.toBinaryString(mask));
		
		System.out.println(Integer.toBinaryString(b1 & mask)); // 비트 논리곱
		System.out.println(Integer.toBinaryString(b1 | mask)); // 비트 논리합
		System.out.println(Integer.toBinaryString(~b1)); // 비트 논리부정
	}
	
	//비교 논리 연산자
	private static void logicalOperEx() {
		// 비교연산자 : >, >=, <, <=, ==(equal), !=(not equal)
		// 논리연산자 : 논리곱(AND, &&), 논리합(OR, ||), 논리부정(NOT, !)
		int a = 5;
		// a가 0초과, 10 미만의 값?
		// 조건1 : a > 0
		// 조건2 : a < 10
		// 결과 : 조건1 AND 조건2
		boolean b1 = a > 0; // true
		boolean b2 = a < 10; // true
		boolean r = b1 && b2; //논리곱
		System.out.println("b1 && b2 == " + r);
		
		//a가 0이하이거나 10이상의 값?
		// 조건1 : a <= 0
		// 조건2 : a >= 10
		// 결과 : 조건1 OR 조건2
		b1 = a <=0;
		b2 = a >=10;
		
		r = b1 || b2;
		System.out.println("b1 || b2 == " + r);
		
		// 논리 부정(NOT !)
		System.out.println("!r == " + !r);
		}
	

	
	
	
	// 후위증감
	private static void suffixIncrEx() {
		int a = 7;
		int b = 0;
		
		b =a++;
		System.out.println("b:" + b);
		System.out.println("a:" + a);
		
	}
	
	// 전위증감
	private static void prefixIncrEx() {
		int a = 7;
		int b = 0;
		
		b =++a;
		System.out.println("b:" + b);
		System.out.println("a:" + a);
		
	}
	// 산술연산자
	private static void arithOperEx() {
		int a = 7;
		int b = 3;
		
		// 부호 연산자(+, -)
		System.out.println(-a); // -> -1 * a
		
		// 산술 연산(+, -, *, /)
		System.out.println(a / b); // int / int -> int(나눗셈의 몫)
		System.out.println(a % b); // 정수 나눗셈의 나머지
		
//		System.out.println(a / 0); // int / 0
		System.out.println(7.0 / 0); // Infinity
		System.out.println(7.0 / 0 + 100); // Infinity가 포함된 산술식 -> Infinity
		
		//Infinity 체크
		System.out.println(Double.isInfinite(7.0/0)); // Infinity 체크
		// 데이터가 NaN인지 확인
		System.out.println(0.0 / 0.0);
		System.out.println(Double.isNaN(0.0 / 0.0));
		System.out.println(Double.isNaN(7.0 / 0.0)); // Infinity는 NaN체크에 포함되지 않는다. false
		
	}

}
