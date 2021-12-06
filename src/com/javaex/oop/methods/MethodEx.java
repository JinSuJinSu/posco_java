package com.javaex.oop.methods;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력 X, 출력 X
		printMessage();
		// 입력 O, 출력 O
		double reulst = getSum(4,5);
		System.out.println("4 + 5 = " + reulst);
		// 입력 X, 출력 O
		// 입력 O, 출력 X
		System.out.println(getTotal(new double[] {1,2,3,4,5,6,7,8,9}));
		System.out.println(getTotalVar(1,2,3,4,5,6,7,8,9));
		
		printTotal("합계",1,2,3,4,5,6,7,8,9,0);
		
	}
	// 고정인자 + 가변인자 -> 정의 순서 중요
	private static void printTotal(String message, double ... values) {
		System.out.println(message + ":" + getTotal(values));
	}
	// 가변 인수 이용한 다수 인수 전달
	private static double getTotalVar(double ... values) {
//		double total = 0;
//		for(double value : values) {
//			total += value;
//		}		
		return getTotal(values);		
	}
	
	// 배열로 매개변수 전달
	private static double getTotal(double[] values) {
		double total = 0;
		for(double value : values) {
			total += value;
		}		
		return total;
	}
	
	private static double getSum(double num1, double num2) {
		// 매개변수의 갯수는 제한이 없다.
		// 결과 리턴시 메서드의 타입과 결과 데이터의 타입이 일치해야 한다.
		return num1 + num2;
	}
	
	private static void printMessage() {
		System.out.println("Hello Java");
		
	}

}
