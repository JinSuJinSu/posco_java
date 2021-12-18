package com.javaexam1211;

public class SalaryExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SalaryExpr s1 = new SalaryExpr(100);
		int num1 = (int)(Math.random()*12)+1;
		int num2 = (int)(Math.random()*4)+1;
		
		
		
		if(num1%2==0) {
			int salary = s1.getSalary(num2);
			System.out.printf("%d월 %d등급의 월급은 %d입니다.",num1,num2,salary);
		}
		else {
			int salary = s1.getBonus();
			System.out.printf("%d월 %d등급의 월급은 %d입니다.",num1,num2,salary);
		}
		

	}

}
