package com.datastructure;

import java.util.Arrays;
import java.util.Scanner;

public class MemoryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 동적바인딩으로 stack 배열, queue배열 생성
		Memory m1 = new Stack(5);
		m1.createArray(); // 배열 만들기
		
		Memory m2 = new Queue(5);
		m2.createArray();
		
		// 배열 정보 출력
		System.out.println("초기 스택배열 : " + Arrays.toString(m1.getArray()));
		System.out.println("초기 큐배열 : " + Arrays.toString(m2.getArray()));
		
		// 무한루프에 필요한 변수들
		boolean running = true;
		boolean stackRunning = true;
		boolean queueRunning = true;
		
		Scanner scanner = new Scanner(System.in);
		
		while(running) {
			System.out.println("1. Stack\t 2.Queue\t 3.break" ); // 입력문
			int number = scanner.nextInt();
			switch(number) {
			case 1:
				while(stackRunning) {	
					System.out.println("1. StackPush\t 2.StackPop\t 3.break" );// 입력문
					int stackNumber = scanner.nextInt();
					switch(stackNumber) {
					case 1:
						System.out.println("추가할 숫자를 입력하세요");
						int value = scanner.nextInt();
						m1.push(value);
						break;
					case 2:
						m1.stackPop();
						break;
					case 3:
						stackRunning = false;
					default:
						continue;	
				}
				}
				break;
			case 2:		
				while(queueRunning) {
					System.out.println("1. QueuePush\t 2.QueuePop\t 3.break" );// 입력문
					int queueNumber = scanner.nextInt();
					switch(queueNumber) {
					case 1:
						System.out.println("추가할 숫자를 입력하세요");
						int value = scanner.nextInt();
						m2.push(value);
						break;
					case 2:
						m2.queuePoll();;
						break;
					case 3:
						queueRunning = false;
					default:
						continue;	
					}
					}
					break;
				case 3:
					running = false;
					break;
				default:
					continue;	
		}
			}
		
		// 결과 배열 정보 출력
		System.out.println("결과 스택배열 : " + Arrays.toString(m1.getArray()));
		System.out.println("결과 큐배열 : " + Arrays.toString(m2.getArray()));
		
		scanner.close(); // scanner 사용후 닫아준다.
		

	}
	

}
