package com.javaex.basic;

public class Quiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Q1
//		핸드폰 번호(- 포함)를 저장하는 변수를 작성하고자 합니다. phoneNumber 라는 이름의 변수를 작성하고 자신의 핸드폰 번호를 변수에 할당해 봅시다.
		String phoneNumber = "010-1111-3456";
		
//		Q2
//		이자율을 저장하는 float형 변수 interestRate를 만들고 이자율 0.031 을 할당해 봅시다
		float interseRate = 0.031f;
		
//		Q3
//		다음 문장의 출력 결과를 각각 확인해 봅시다. 오류가 난다면 그 이유를 생각해 봅시다.
//		System.out.println("1" + "3");
//		System.out.println(true + "Java");
//		System.out.println('A' + 'B');
//		System.out.println('1' + 2);
//		System.out.println('J' + "ava");
//		System.out.println(false + null); => boolean과 null 관계 때문에 컴파일 에러가 발생한다.
		
//		Q4
//		다음과 같은 변수 선언 코드가 있습니다
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
//		아래 형 변환 코드 중에서 명시적 형 변환이 필요 없는 코드는 무엇입니까?
		byte b2 = (byte)i;
		char ch2 = (char)b;
		short s = (short)ch;
		float f = (float)l;
		int i2 = (int)ch;
		
		// i2=> char는 2바이트고 int는 4바이트로 더 크기 때문에 자동으로 형변환이 된다.
		

	}

}
