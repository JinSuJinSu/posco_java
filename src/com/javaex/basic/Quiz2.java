package com.javaex.basic;
import java.lang.Math;

public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q1
//		다음과 같이 변수를 선언했습니다.
		int a = 3;
		int b = 6;
		char c = 'A';
		
//		a는 짝수입니까? true or false로 출력하세요.
		boolean b1;
		b1 = (a%2==0 ? true : false);
		System.out.println(b1);
//		b는 3의 배수입니까? true or false로 출력하세요.
		boolean b2;
		b2 = (b%3==0 ? true : false);
		System.out.println(b2);

//		'a는 짝수이다'와 'b는 3의 배수이다'를 논리곱(AND)으로 연산하여 해당 진위값을 r1 변수에 저장해 봅시다.	
		boolean a10 = (a%2==0 ? true : false);
		boolean b10 = (b%3==0 ? true : false);
		boolean r1 = a10 & b10;
		
		
//		결과값 r1을 출력해 봅시다.
		System.out.println(r1);
//		c의 4글자 뒤의 문자는 무엇입니까? 결과값을 r2 변수에 저장해 봅시다.
		char r2 = (char)'c' + 4;
//		결과값 r2를 출력해 봅시다
		System.out.println(r2);
		
		
		// Q2
		// 다음과 같이 변수를 선언했습니다.
		int balls = 136;
		int cap = 10;
		
//		변수 설명
	//
//		balls는 보유하고 있는 공의 갯수입니다.
//		cap는 하나의 상자당 담을 수 있는 공의 개수입니다
//		balls를 상자에 나눠 담으려면 최소 몇 개의 상자가 필요합니까? 결과를 출력해 봅시다.
	//
//		삼항 연산자를 활용해 계산해 봅니다
		
		int num = balls%cap>0 ? balls/cap + 1: balls/cap;
		System.out.println(num);
		
		// Q3
		
//		num의 100자리 미만을 버리는 코드를 작성해 봅시다.
//
//		num이 456이라면 결과는 400
//		num이 12345라면 결과는 12300이 됩니다.
//		결과를 화면에 출력해 봅시다
		
		int number = 12345;
		int newNumber = (int)Math.floor((double)number/100)*100;
		System.out.println(newNumber);
		
		// Q4
//		char형 변수 ch에 알파벳 대문자가 담겨 있습니다. 이 변수에 담긴 알파벳을 소문자로 변환해 봅시다.
		char ch = 'A';
		System.out.println((char)ch + 32);
		
		// Q5
		int num1 = 13579;
		int num2 = 13579;
		
//		다음 두 값이 같은지 확인하는 코드를 작성해 봅시다. 같다면 "같음" 다르다면 "다름"을 출력하세요.
//		++num1 + 1
//		num2++ + 1
		if(++num1 + 1==num2++ + 1) {
			System.out.println("같음");
		}
		else {
			System.out.println("다름");
		}
		
//		최종 num1과 num2의 값을 출력해 봅시다.
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);



	}
	

}
