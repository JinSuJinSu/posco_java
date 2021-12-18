package com.javaexam1209;

public class TwoArrayLab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. TwoArrayLab2 라는 클래스를 만든다.
//		2. 다음의 내용대로 char 타입의 2차원 배열을 생성한다.
//		 
//		         'B', 'C', 'A', 'A'
//		         'C', 'C', 'B', 'B'
//		         'D', 'A', 'A', 'D'
//
//		3. 4개의 원소를 갖는 int 타입의 배열을 생성한다.
//		    첫번째 원소에는 'A' 문자의 개수    
//		    두번째 원소에는 'B' 문자의 개수    
//		    세번째 원소에는 'C' 문자의 개수    
//		    네번째 원소에는 'D' 문자의 개수    
//		    를 저장한다.
//
//		4. 출력형식
//		    A 는 x개 입니다.
//		    B 는 x개 입니다.
//		    C 는 x개 입니다.
//		    D 는 x개 입니다.
		
		char[][] array= {{'B', 'C', 'A', 'A'},
				{'C', 'C', 'B', 'B'},
				{'D', 'A', 'A', 'D'}};
		
		int[] countArray = new int[4];
		
		for(char[] values : array) {
			for(char value : values) {
				switch(value) {
				case 'A':
					countArray[0]++;
					break;
				case 'B':
					countArray[1]++;
					break;
				case 'C':
					countArray[2]++;
					break;
				case 'D':
					countArray[3]++;
					break;
				default:
					break;		
				}
			}
		}
		
		for(int i=0; i<countArray.length; i++) {
			System.out.println((char)(65+i) + "는 " + countArray[i] + "개입니다.");
		}
				
				    
		

	}

}
