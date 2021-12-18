package com.javaex.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		problem1();
//		problem2();
//		problem3();
//		problem4();
//		problem5();
//		problem6();
//		problem7();
		problem8();
	}
		
	//문제1. 1에서 100까지의 수에서 5의배수 이면서 7의 배수인 수를 출력하세요
	public static void problem1() {
		int startNum = 35;
		while(true) {
			if(startNum>100) {
				break;
			}
			else {
				System.out.println(startNum);
				startNum+=35;
			}
			
		}
		
	}
	//문제2 . 숫자를 입력받아 아래와 같이 출력하세요
	public static void problem2() {
		System.out.println("숫자를 입력하세요");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		for(int i=1; i<=number; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
		scanner.close();
	}
	
	// 문제3. 다음과 같이 구구단을 출력하세요
	public static void problem3() {
		for(int i=1; i<=9; i++) {			
			for(int j=2; j<=9; j++) {
				System.out.print(j + "*" + i + "=" + i*j + "\t");
			}
			
			System.out.println();
		}
	}
	
	// 문제4. 다음과 같이 출력하세요
	public static void problem4() {
		for(int i=1; i<=10; i++) {			
			for(int j=0; j<10; j++) {
				System.out.print(i+j + "\t");
			}
			
			System.out.println();
		}
	}
	
	// 문제5. 정수 다섯개를 입력받아 가장 큰 수를 출력하세요.
	public static void problem5() {
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		for(int i=1; i<=5; i++) {	
			System.out.println("숫자 : ");
			int number = scanner.nextInt();
			arrayList.add(number);
		}
		int maxNumber = Collections.max(arrayList);
		System.out.println("최댓값은 " + maxNumber + "입니다.");
		
		scanner.close();
		
	}
//	문제6. 다음과 같은 프로그램을 작성하세요 
//	a. 입력 받은 숫자가 홀수인 경우에는, 입력 값까지 홀수의 합을 출력합니다. 
//	- 예) 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 = 16 ) 
//	b. 입력 받은 숫자가 짝수인 경우에는, 입력 값까지 짝수의 합을 출력합니다. 
//	 - 예) 입력이 10 이면 30을 출력 ( 2 + 4 + 6 + 8 + 10 = 30 ) 
	public static void problem6() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int number = scanner.nextInt();
		int numberResult = 0;
		if(number%2==0) {
			while(number >=2) {
				numberResult+=number;
				number-=2;
			}
		}
		else {
			while(number >=1) {
				numberResult+=number;
				number-=2;
			}				
			}
		
		System.out.println("결과값 :" + numberResult);
		scanner.close();
	}
	
//	문제7. 아래와 같이 숫자 맞추기 프로그램을 작성하세요 
//	숨겨진 숫자를 맞추는 게임입니다. 
//	프로그램이 실행되면 1~100 사이의 숫자가 결정됩니다. 
//	사용자가 입력한 숫자가 결정된 숫자보다 높으면 “더 낮
//	게” 출력 
//	사용자가 입력한 숫자가 결정된 숫자보다 낮으면 “더 높
//	게” 출력 되며 
//	정답을 맞춘경우 “맞았습니다.” 출력됩니다. 
//	게임을 반복하기 위해 y/n이라 묻고 n인 경우 종료됩니
//	다. 
//	(y 인경우 다시 게임이 시작됩니다.) 
	
	public static void problem7() {
	    for(int i=0; i<2; i++) {
		for(int j=0; j<20; j++) {
			System.out.print("-");
		}
		System.out.println();
	    }
	    System.out.println(" [숫자 맞추기 게임 시작]  ");	    
	    for(int i=0; i<2; i++) {
		for(int j=0; j<20; j++) {
			System.out.print("-");
		}
		System.out.println();
	    }
		Scanner scanner = new Scanner(System.in);
		int myNumber = (int)(Math.random()*100) + 1;
		System.out.println(myNumber);
		while(true) {
			System.out.print(">>");
			int targetNumber = scanner.nextInt();
			if(myNumber>targetNumber) {
				System.out.println("더 높게");
			}
			else if(myNumber<targetNumber) {
				System.out.println("더 낮게");
			}
			else {
				System.out.println("맞았습니다.");
				System.out.println("게임을 종료하시겠습니까?(y/n) >>");
				String choice = scanner.next();
				if(choice.equals("y")) {
					for(int i=0; i<2; i++) {
						for(int j=0; j<20; j++) {
							System.out.print("-");
						}
						System.out.println();
					    }
					    System.out.println(" [숫자 맞추기 게임 종료]  ");	    
					    for(int i=0; i<2; i++) {
					    	for(int j=0; j<20; j++) {
					    		System.out.print("-");
						}
				    	System.out.println();
				}
					    scanner.close();
					    break;
					    
			}
				else if(choice.equals("n")) {
				    myNumber = (int)(Math.random()*100) + 1;
				    System.out.println(myNumber);
				}
				else {
					System.out.println("키를 똑바로 입력하세요!!!");
				}		
		}
	
	}		
	}
	
//	문제8 아래와 같이 은행 프로그램을 작성하세요 
//	“1.예금” 선택후 금액을 입력하면 예금액이 합산됩니다. 
//	“2.출급” 선택후 금액을 입력하면 예금액이 차감됩니다. 
//	“3.잔고” 선택시 현재 잔고가 출력됩니다. 
//	“4.종료” 선택시 종료됩니다. 
//	“1,2,3,4 이외의 숫자” 다시입력해주세요 메시지 출력됩니다.
	public static void problem8() {
		int totalBalance = 0;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
	
		while(running) {
			for(int i=0; i<30; i++) {
				System.out.print("-");
			}	
			System.out.println();
			System.out.println("1. 예금 | 2.출금 | 3.잔고 | 4.종료 ");
			System.out.println("선택>");
			
			int choice = scanner.nextInt();

			switch(choice) {
				case 1:
					System.out.print("예금액>");
					balance = scanner.nextInt();
					System.out.println();
					totalBalance+=balance;
					break;
				case 2:
					System.out.print("출금액>");
					balance = scanner.nextInt();
					System.out.println();
					totalBalance-=balance;
					break;
				case 3:
					System.out.println("잔고액>" + totalBalance);
					break;
				case 4:
					System.out.println("프로그램 종료");
					scanner.close();
					running = false;
					break;
				default:
					System.out.println("다시 입력해주세요");								
			}
		}					    
		
	}
}
