package com.javaexam1210;

public class MethodLab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		[ 실습 1 ]
//		1. 클래스명 : MethodLab1
//
//		2. 구현해야 하는 추가 메서드 (static 붙여서)
//		   매개변수 : char 타입 1개, int 타입 1 개 
//		   리턴값 : 없음
//		   메서드명 : 임의로
//		   기능 : 첫번째 아규먼트로 전달된 문자를 
//		            두번째 아규먼트로 전달된 숫자의 갯수만큼 
//		            한 행에 출력한다.
//		3. main() 메서드에서는 다음과 같이 아규먼트를 전달하면서
//		    위에 정의한 메서드를 호출한다.
//
//		     xxxx('@', 3)
//		     xxxx('%', 4)
//		     xxxx('A', 5)
//		     xxxx('가', 3)
//
//
//		    결과
//		         @@@
//		         %%%%
//		         AAAAA  
//		         가가가
		
		print('@', 3);
		print('%', 4);
		print('A', 5);
		print('가', 3);
		 

	}
	
	public static void print(char ch, int number) {
		for(int i=0; i<number; i++) {
			System.out.print(ch);	
		}
		System.out.println();
		
	}

}
