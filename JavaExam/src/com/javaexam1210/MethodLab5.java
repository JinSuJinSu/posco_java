package com.javaexam1210;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class MethodLab5 {
	
	public static void main(String[] args) {
//		[ 실습 5 ]
//
//		1. 클래스명 : MethodLab5
//		2. 정의해야 하는 메서드  
//		   메서드명 : powerArray
//		   매개변수 타입 : int
//		   리턴값의 타입 : int[]
//
//		   10개의 크기를 배열을 만들어서
//		   각각의 원소를 매개변수에 전달된 값만큼 배수로 만들어
//		   리턴한다.
//
//		3. main() 메서드에서 powerArray 를 3번 호출한다.
//		   
//			int r1[] = powerArray(2);
//			int r2[] = powerArray(3);
//			int r3[] = powerArray(4);
//
//		             [ 결과 출력 ]
//			2,4,6,8,10,12,14,16,18,20
//		 	3,6,9,12,15,18,21,24,27,30
//			4,8,12,16,20,24,28,32,36,40
		
		int[] resultArray;
		for(int i=0; i<3; i++) {
			resultArray = powerArray(i+2);
			for(int value : resultArray) {
				System.out.print(value + ",");
			}
			System.out.println();
		}

	}
	public static int[] powerArray(int num) {
		int[] array = new int[10];
		for(int i=0; i<array.length; i++) {
			array[i] = num*(i+1);
		}
		return array;
	}
//		
//	}

}
