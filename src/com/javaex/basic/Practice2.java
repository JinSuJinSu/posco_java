package com.javaex.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		problem1();
//		problem2();
//		problem3();
//		problem4();
		problem5();

	}
		
	//문제1. 다음 주어진 배열 데이터를 이용하여 3의 배수의 개수와 배수의 합을 아래와 같이 출력하는 프로그램을 작성하세요
	public static void problem1() {
		int[] data = { 1, 3, 5, 8, 9, 11, 15, 19, 18, 20, 30, 33, 31 };
		int count = 0;
		int sum = 0;
		
		for(int number: data) {
			if(number%3==0) {
				count+=1;
				sum+=number;
			}		
		}
		System.out.println("주어진 배열에서 3의 배수의 개수=>" + count);
		System.out.println("주어진 배열에서 3의 배수의 합=>" + sum);
		
	}
	//문제2 . 5개의 숫자를 키보드로 입력받아 배열에 저장한 후, 평균을 구하는 프로그램을 작성하세요.
	public static void problem2() {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> numberList = new ArrayList<>();
		int sum=0;
		for(int i=0; i<5; i++) {
			int number = scanner.nextInt();
			numberList.add(number);
			sum+=number;
		}
		scanner.close();
		System.out.println("평균은 " + (double)sum/numberList.size() +" 입니다.");
	}
	
	// 문제3. 주어진 문자열의 공백을 ‘,’(콤마) 로 변경 후 출력하세요
	public static void problem3() {
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		String language = new String(c);
		language= language.replace(" ", ",");
		System.out.println(language);
		}
	
	
	// 문제4. 배열을 사용하여 1~45까지의 숫자 중 임의의 6개의 숫자를 출력하세요-미니로또
	public static void problem4() {
		ArrayList<Integer> numberList = new ArrayList<>();
		while(numberList.size()!=6) {
			int number = (int)(Math.random()*45)+1;
			if(!numberList.contains(number)) {
				numberList.add(number);
			}		
		}
		for(int i=0; i<numberList.size(); i++) {
		System.out.print(numberList.get(i) + "  ");
		}
	}
	
	// 문제5. 다음과 같이 scoreboard 배열이 선언되어 있다
	// 배열 내에서 85점 이상인 점수만 뽑아, 총 합과 평균값을 산출하세요.
	public static void problem5() {
		int scoreboard[][] = {
				{ 80, 75, 90, 95, 78 },
				{ 92, 88, 89, 92, 70 },
				{ 78, 80, 85, 86, 63 },
				{ 83, 84, 89, 87, 75 },
				{ 89, 83, 93, 94, 78 }
				};
		
		ArrayList<Integer> scoreList = new ArrayList<>();
		int sum=0;
		for(int[] scores: scoreboard) {
			for(int score : scores) {
				if(score>=85) {
					sum+=score;
					scoreList.add(score);
				}
			}
		}
		System.out.println((double)sum/scoreList.size());		
	}
}
