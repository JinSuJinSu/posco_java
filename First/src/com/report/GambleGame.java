package com.report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class GambleGame {

	// run 조건과 triplete 조건에 필요한 변수
	private static int runCount = 0;
	private static int tripleteCount = 0;
	private static String cards= ""; // 게임을 시작할 때 수령하는 카드 숫자들
	private static String result = ""; // 게임 결과
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// 게임 시작
		boolean running = true;
		while(running) {
		// 랜덤하게 0~9까지 6개의 숫자을 입력받아 결과값을 생성해준다.
		for(int i=0; i<6; i++) {
			int number = (int) (Math.random() * 10);
			cards = cards.concat(String.valueOf(number));
			}	
		cards="999999";
		// 입력받은 수를 순차적으로 접근할 수 있도록 배열로 만들어준다.
		int[] numberArray = new int[cards.length()];
		for(int i=0; i<numberArray.length; i++) {
			numberArray[i] = Integer.valueOf(String.valueOf(cards.charAt(i)));
			}
		
		int[] indexArray = new int[10]; // 인덱스로 접근할 수 있는 리스트를 만들어준다.
		
		for(int i=0; i<numberArray.length; i++) {
			indexArray[numberArray[i]]+=1; // 각각의 숫자가 몇개씩 나왔는지 확인해준다.
		}
	
		
		for(int i=0; i<indexArray.length; i++) {
			if(indexArray[i]==3) {
				tripleteCount+=1; // triple은 똑같은 숫자가 3개 나와야 된다.
			}
			else if(indexArray[i]==6) {
				tripleteCount+=2;
			}
		}
		
		for(int i=0; i<indexArray.length-2; i++) {
			if(indexArray[i]==1 && indexArray[i+1]==1 && indexArray[i+2]==1) {
				indexArray[i]=0 ;
				indexArray[i+1] = 0;
				indexArray[i+2] = 0; // 0으로 초기화 안할시 123487같은 숫자가 babygin으로 나오는 오류가 발생한다.
				// ex)(1,2,3),(2,3,4) =>runcount 성립이 되버림
				runCount+=1; // runcount는 연속적으로 숫자가 1개씩 나와야 된다.			
			}
			else if(indexArray[i]==2 && indexArray[i+1]==2 && indexArray[i+2]==2) {
				runCount+=2; // runcount는 연속적으로 숫자가 1개씩 나와야 된다.ex)456456
				
			}
		}
		
		if(tripleteCount+runCount==2) {
				result="Baby gin!!!"; // 3개씩 1개의 조건을 가지므로 2가 되면 babygin이다.
			}
		else {
			result = "Lose";
		}
		
		System.out.println("Input 6 Numbers : " + cards);
		System.out.println(result);
		System.out.println("Play the game again? (1-yes/2-no) : ");
		
		int choice = scanner.nextInt();
		if(choice==1) {
			cards="";
			result="";
			tripleteCount=0;
			runCount=0; // 변수 초기화
			continue; // 게임을 계속한다.
		}
		else{
			System.out.println("게임을 종료하겠습니다.");
			running = false;
		}
		
	}
		scanner.close();		
//
	}
//		
	
}

