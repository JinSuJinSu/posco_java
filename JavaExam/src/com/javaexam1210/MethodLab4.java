package com.javaexam1210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MethodLab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		[ 실습 4 ]
//
//		1. 클래스명 : MethodLab4
//		2. 정의해야 하는 메서드  
//		   메서드명 : maxNumArray
//		   매개변수 타입 : int[]
//		   리턴값의 타입 : int
//
//		   매개변수에 전달된 배열의 원소값들 중에서 가장 큰값 리턴
//		   
//		3. main() 메서드에서 maxNumArray 를 3번 호출한다.
//		   다음 배열들을 전달하여
//		     배열 1 : 10, 20, 30
//		     배열 2 : 100, 500, 300, 200, 400
//		     배열 3 : 1, 10, 3, 4, 5, 8, 7, 6, 9, 2
//		   
//		   호출하고 리턴값을 다음과 같이 출력한다.
//		     가장 큰 값은 30 입니다.
//		     가장 큰 값은 500 입니다.
//		     가장 큰 값은 10 입니다.
		int result1;
		int result2;
		int result3;
		
		result1 = maxNumArray(new int[]{10,20,30});
		System.out.println("가장 큰 값은 " + result1 + "입니다.");
		
		result2 = maxNumArray(new int[]{100, 500, 300, 200, 400});
		System.out.println("가장 큰 값은 " + result2 + "입니다.");
		
		result3 = maxNumArray(new int[]{1, 10, 3, 4, 5, 8, 7, 6, 9, 2});
		System.out.println("가장 큰 값은 " + result3 + "입니다.");
		
		
		
		}
	
	public static int maxNumArray(int[] array) {
		Integer[] numArray = Arrays.stream(array).boxed().toArray(Integer[]::new); 
		ArrayList<Integer> numberList = new ArrayList<Integer>(Arrays.asList(numArray));
		return Collections.max(numberList);
		
	}

}
