package com.report;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.stream.IntStream;

// 개인과제1
public class SortGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1000부터 9999까지 출력하기 위해 for문을 만들어준다.
		for(int i=1000; i<10000; i++) {
			String number = String.valueOf(i);
			ArrayList<String> numberList = new ArrayList<>();
			// 어차피 숫자 하나씩 생각하면 문자열로 정렬해버리면 끝난다.(0으로는 숫자가 시작이 안되므로 주의)
			for(int j=0; j<number.length(); j++) {
				numberList.add(String.valueOf(number.charAt(j)));
			}
			
			// 0이 3개면 계산 필요 없음
			if(Collections.frequency(numberList, "0")<3) {
				Collections.sort(numberList);
			}
			
			
			// 0이 2개일때와 1개일때를 구분해준다.
			if(Collections.frequency(numberList, "0")==2) {
				String value1 = numberList.get(0);
				String value2 = numberList.get(1);
				numberList.remove(0);
				numberList.remove(0);
				numberList.add(1,value1);
				numberList.add(1,value2);		
			}
			else if(Collections.frequency(numberList, "0")==1) {
				String value = numberList.get(0);
				numberList.remove(0);
				numberList.add(1,value);
			}
			
			String result = "";
			for(String value : numberList) {
				result = result.concat(value); // concat으로 연결해준다.
			}
			
			System.out.println("입력 정수 : " + i + "\t결과값 : " +  result); // 결과물 출력
		
		}
		
		}
	
	}

