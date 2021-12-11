package com.scoreprogramm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ProgrammLinkedList{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		// 학생 정보를 담을 배열 생성
		LinkedList<Student> studentList = new LinkedList<>();
		
		System.out.println("성적 처리 프로그램 시작");
		boolean running = true;
		while(running) { // 종료전까지 계속 반복
			System.out.println("1. 삽입\t 2.검색\t 3.삭제\t 4.출력\t 5.종료");
			int num = scanner.nextInt();
			switch(num) {
			case 1:
				System.out.print("이름 : ");
				String name = scanner.next();
				
				System.out.print("국어 점수 : ");
				int languageScore = scanner.nextInt();
				
				System.out.print("영어 점수 : ");
				int englishScore = scanner.nextInt();
				
				System.out.print("수학 점수 : ");
				int mathScore = scanner.nextInt();
				
				Student student = new Student(name,languageScore,englishScore,mathScore); // 생성자륾 만든다.
				studentList.add(student); // linkedList에 데이터 추가
				break;
				
			case 2:
				System.out.println("학생 이름과 원하는 과목 점수 입력");
				scanner.nextLine();
				String information = scanner.nextLine();
				String[] informationList = information.split(" ");
				String value1 = informationList[0];
				String value2 = informationList[1];
				int subjectScore = 0;
				
				if(studentList.isEmpty()) {
					System.out.println("데이터가 없습니다."); // 데이터가 없으면 검색 불가능
				}
				
				
				for(Student students : studentList) {
					if(students.getName().equals(value1)) { // 학생 이름이 같아야 맞는 정보를 찾을 수 있다.
						if(value2.equals("국어")) {
							subjectScore=students.getLanguageScore();
						}
						else if(value2.equals("영어")) {
							subjectScore=students.getEnglishScore();
						}
						else if(value2.equals("수학")) {
							subjectScore=students.getMathScore();
						}
						else {
							System.out.println("국어 영어 수학 제대로 입력하세요. 데이터 오류입니다.");
						}
						System.out.printf("이름:%s\t %s:%d%n",value1,value2,subjectScore);
						break;
					}
					else {
						if(studentList.indexOf(students)==studentList.size()-1) { // 학생 정보가 없으면 해당 문구를 출력해준다.
							System.out.println("데이터가 없습니다.");
						}
					}
				}
				break;
				
			case 3:
				System.out.println("삭제할 학생 이름");
				String deleteName = scanner.next();
				
				if(studentList.isEmpty()) {
					System.out.println("데이터가 없습니다.");// 데이터가 없으면 삭제 불가능
				}
				
				for(Student students : studentList) {
					if(students.getName().equals(deleteName)) { // 학생 이름이 같아야 맞는 정보를 찾을 수 있다.
						studentList.remove(studentList.indexOf(students)); // 학생 데이터 제거
						System.out.println("삭제되었습니다.");
						break;
					}
					else {
						if(studentList.indexOf(students)==studentList.size()-1) { // 학생 정보가 없으면 해당 문구를 출력해준다.
							System.out.println("데이터가 없습니다.");
						}
					}
					
				}
				break;
				
			case 4:
				System.out.println("학생 정보를 전부 출력합니다.");
				for(Student studentInformation : studentList) { //for문으로 모든 정보를 출력한다.
					System.out.printf("이름:%s\t 국어:%d\t 영어:%d\t 수학:%d\t 합계:%d\t 평균:%.2f%n",
							studentInformation.getName(), studentInformation.getLanguageScore(),
							studentInformation.getEnglishScore(), studentInformation.getMathScore(),
							studentInformation.getSumScore(), studentInformation.getAvgScore());
				}
				break;
				
			case 5:
				System.out.println("프로그램 종료"); // 무한루프 조건을 풀어서 탈출한다.
				running = false;
				break;
			
			default:
				continue; // 1~5외의 숫자를 입력하면 건너뛴다.
				
		}

	}
		scanner.close();

}
}
