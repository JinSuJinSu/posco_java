package com.javaexam1203;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. TimeTest 라는 클래스를 생성한다.
//		2. time 이라는 변수를 선언하여 32150(초) 이라는 값을 초기화 한다.   
//		3. time 변수의 값으로 "XX시간 XX분 XX초" 형식으로 변환하여 출력한다.
		
		int time = 32150;
		
		int min = time / 60; 
		int hour = min / 60;
		time = time % 60;
		min = min % 60;
		
		System.out.printf("%d시간 %d분 %d초", hour, min, time);


		
		
		

	}

}
