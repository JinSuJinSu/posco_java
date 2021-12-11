package com.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * 성적처리 프로그램
 * 1. 입력(이름, 국,영,수)
 * 2. 검색(이름 검색, 평균 검색, (50점이상)
 * 3. 출력(전체출력)
 * 
 * 
 * */

public class Test{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력받을 학생 수를 정한다.
		System.out.println("입력할 학생 수를 구하세요");
		Scanner scanner = new Scanner(System.in);
		int totalStudent = scanner.nextInt();
		
		// 학생 정보들을 담을 배열 생성
		Student[] studentList = new Student[totalStudent];
		
		// scanner 오류 방지를 위해 추가
		scanner.nextLine();
		
		
		// 학생 정보를 입력 받고 배열로 분리한 후 각각 데이터를 생성자 파라미터에 넣는다.
		// 생성자를 만들면 배열에 값을 추가해준다.
		System.out.println("이름 국어점수 영어점수 수학점수 순으로 출력합니다. ex)홍길동 70 80 90");
		
		for(int i=0; i<totalStudent; i++) {
			System.out.println("학생들의 정보를 적으세요" );
			String information = scanner.nextLine();
			String[] informationList = information.split(" ");
			String name = informationList[0];
			int languageScore = Integer.valueOf(informationList[1]);
			int englishScore = Integer.valueOf(informationList[2]);
			int mathScore = Integer.valueOf(informationList[3]);
			
			Student student = new Student(name,languageScore,englishScore,mathScore);
			studentList[i] = student;
			
		}
		
		// 메소드 수행	
		search(studentList);
		totalPrint(studentList);
		
		// scanner 사용 완료되면 닫아버린다.
		scanner.close();
	}

	
	public static void search(Student[] studentList) {
		System.out.println("성적 확인을 위한 학생을 입력하세요");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		
		// 찾고자 하는 학생 이름과 같은 값을 찾은 후 정보 출력
		// 50점 미만은 보여주지않는다.
		for(Student student : studentList) {
			if(student.getName().equals(name)){
				double avgScore = (double)(student.getLanguageScore() + student.getEnglishScore() + student.getMathScore())/3;
				if (avgScore>=50) {
					System.out.printf("이름 : %s, 평균 : %.2f%n",name,avgScore);
				}
				break;
			}
		}
		scanner.close();
		
	}

	// 전체 학생 정보 출력
	public static void totalPrint(Student[] studentList) {
		System.out.println("전체 학생 성적을 출력합니다.");
		for(Student student : studentList) {
			System.out.printf("이름 : %s, 국어점수 : %d , 영어점수 : %d , 수학점수 : %d%n",student.getName(), student.getLanguageScore(),
					student.getEnglishScore(), student.getMathScore());
		}
	}
	
}