package com.javaexam1212;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] array = new int[num];
		
		for(int i=0; i<num; i++) {
			int score = scanner.nextInt();
			array[i] = score;
		}
		
		GradeExpr g1 = new GradeExpr(array);
		System.out.print("점수들 : ");
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i] + ", ");
		}
		System.out.println();
		System.out.println("총점 : " + g1.getTotal());
		System.out.println("평균 : " + g1.getAverage());
		System.out.println("최고 점수 : " + g1.getGoodScore());
		System.out.println("최저 점수 : " + g1.getBadScore());

	}

}
