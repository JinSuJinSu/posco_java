package com.javaex.basic;

import java.util.Scanner;

public class LoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		whileEx();
//		gugudan();
//		doWhileEx();
//		forGugu();
//		continueEx();
//		breakEx();
		diceEx();
	}
	private static void diceEx() {
		// 주사위 10번 굴리기
		for(int i=0; i<10; i++) {
			int dice = (int)(Math.random()*6) + 1; // 정수난수 생성
			System.out.print(dice + " ");
		}
		System.out.println();
	}
	
	private static void breakEx() {
		int num = 1;
		
		while(true) {// 무한루프		
			if(num%6==0 && num%14==0) {
				break; // 루프 중료
			}
			num++;
		}
		System.out.println(num);
	}
	
	private static void continueEx() {
		for(int i=1; i<=20; i++) {
			if(i%2==0 || i%3==0) {
				continue;
			}
			else {
				System.out.print(i + "\t");
			}			
		}
		System.out.println();
	}
	
	private static void forGugu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하세요:");
		int dan = scanner.nextInt();
		
		for(int num=1; num<=9; num++) {
			System.out.println(dan + "*" + num + "=" + (dan*num));
		}
		scanner.close();
	}
	
	private static void doWhileEx(){
		// 최소 1번 반복 수행할 경우 : do while
		int total = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("숫자를 입력[0이면 종료]:");
			num = scanner.nextInt();
			total += num;
		} while(num != 0);
		
		System.out.println("총합:" + total);
		scanner.close();
	}
	
	
	private static void whileEx() {
		// 1 ~ 10 반복
		int num = 1;
		
		while(num<=10) {
			System.out.println("I Like Java " + num);
			// 반복 조건 변수를 적절히 조절
			num++;
		}
	}
	
//	숫자를 입력받아 입력한 숫자(단)의
//	구구단을 출력하세요
	private static void gugudan() {
		System.out.println("단을 입력해주세요");
		System.out.print("단 : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		int startNum = 1;
		while(startNum<=9) {
			System.out.println(number + " * " + startNum + " = " + number*startNum);
			startNum++;
		}
		
		scanner.close();
	}
	
	
	

}
