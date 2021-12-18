package com.javaexam1206;

public class ArrayLab3 {
	
	public static void main(String[] args) {
//		1. ArrayLab3 라는 클래스를 하나 만든다.
//		2. 'J', 'a', 'v', 'a' 라는 원소들로 구성되는 char 타입의 배열을
//		   만든다.
//		3. 각 원소들의 값에서 대문자는 소문자로 소문자는 대문자로 
//		    변환한다.
//		4. 수행 결과 :
//
//		    변환된 배열 : j,A,V,A
		char[] array = {'J','a','v','a'};
		
		for(int i=0; i<array.length; i++) {
			if(Character.isUpperCase(array[i])) {
				array[i] = String.valueOf(array[i]).toLowerCase().charAt(0);
			}
			else if(Character.isLowerCase(array[i])) {
				array[i] = String.valueOf(array[i]).toUpperCase().charAt(0);
			}
			else {
				continue;
			}
		}
		
		System.out.print("반환된 배열 : ");
		for(int i=0; i<array.length; i++) {
			if(i!=array.length-1) {
				System.out.print(array[i] + ",");
			}
			else {
				System.out.print(array[i]);
			}
			
		}
	}

}
