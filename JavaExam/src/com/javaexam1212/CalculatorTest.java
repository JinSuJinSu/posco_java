package com.javaexam1212;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("숫자 2개를 입력하세요");
			int num1 = scanner.nextInt();
			int num2 = scanner.nextInt();
			CalculatorExpr calculator = new CalculatorExpr(num1, num2);
			
			System.out.println("추출된 숫자 : " + num1 + ", " + num2);
			System.out.println("덧셈 :" + calculator.getAddition());
			System.out.println("뺄셈 :" + calculator.getSubtraction());
			System.out.println("곱셈 :" + calculator.getMultiplication());
			System.out.println("나눗셈 :" + calculator.getDivision());
			
			System.out.println("계속 하시겠습니까?? y/n");
			String condition = scanner.next();
		
		if(condition.equals("y")) {
			continue;
		}
		else {
			System.out.println("포로그램 종료");
			break;
		}

		
		}
		scanner.close();

	}

}
