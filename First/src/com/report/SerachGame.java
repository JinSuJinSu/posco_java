package com.report;

import java.util.ArrayList;
import java.util.Scanner;

public class SerachGame {
	
	private static int totalCount = 0; // 조건에 맞는 개수
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("숫자 2개를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt(); // 첫번째 값
		int num2 = scanner.nextInt(); // 두번째 값
		System.out.println("Input start number : " + num1);
		System.out.println("Input end number : "  + num2);
		
		// 모든 결과를 담을 arrayList
		ArrayList<Integer> numberList = new ArrayList<>();
		
		for(int i=num1; i<=num2; i++) {
			String value = String.valueOf(i);
			int length = value.length();
			int[] array = new int[length]; // 또하나의 for문을 위한 배열 출력
			for(int j=0; j < length; j++) {
				array[j] = Integer.valueOf(String.valueOf(value.charAt(j))); // 배열에 한개씩 정수 값을 넣어준다.
			}
			int count=0; // 값 비교를 위해 시작 전 0으로 초기화한다.
			
			for(int j=0; j<length-1; j++) {
				// 값을 비교하면서 조건이 만족하는지 확인한다.
				if(array[j+1]>array[j]) { // 연속적으로 숫자가 계속 커지는지 체크
					count+=1;
				}
			}
			
			if(count==length-1) { // ex) 123 => 3개가 연속된 숫자라면 count는 2가된다.
				totalCount+=1;
				numberList.add(i);
			}
		}
		
		// 최종 결과물 출력
		for(int value : numberList) {
			System.out.print(value + "  ");
		}
		System.out.println();
		System.out.println("Count : " + totalCount);
		
		scanner.close();
		
		
	}

}
