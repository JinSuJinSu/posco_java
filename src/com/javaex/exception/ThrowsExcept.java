package com.javaex.exception;

import java.io.IOException;

// 사용자 정의 예외 정의
class CustomerArithmeticException extends ArithmeticException{
	private int num1;
	private int num2;
	
	CustomerArithmeticException(String message, int num1, int num2){
		super(message);
		this.num1 = num1;
		this.num2 = num2;
	}

	public int getNum1() {
		return num1;
	}

	public int getNum2() {
		return num2;
	}
	
}


public class ThrowsExcept {
	// Checked Exception
	public void executeException() throws IOException{
		System.out.println("강제 예외 발생");
		throw new IOException("강제 예외");
	}
	
	// Uncheked Exception
	public void executeRuntimException() {
		System.out.println("런타임 오류");
		throw new RuntimeException();
	}
	
	public double divide(int num1, int num2) {
		if(num2==0) {
			// ArithmetiException
			// 구체적 예외로 전환하여 throw하는 것이
			// 1. 코드 가독성을 높인다.
			// 2. 예외 상황 정보를 담을 수 있기 있다.
			throw new CustomerArithmeticException("사용자 정의 예외", num1, num2);
			
		}
		
		return num1 / num2;
	}
	
	

}
