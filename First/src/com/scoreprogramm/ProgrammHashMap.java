package com.scoreprogramm;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class ProgrammHashMap{
	
	private static int setNum; // 검색, 삭제기능에 필요한 숫자
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		// 학생 정보를 담을 배열 생성
		HashMap<Student,Integer> studentMap = new HashMap<>();
		
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
				
				Student student = new Student(name,languageScore,englishScore,mathScore); // 생성자를 만든다.
				studentMap.put(student,1);// hashmap에 데이터 추가
				break;
				
			case 2:
				System.out.println("학생 이름과 원하는 과목 점수 입력");
				scanner.nextLine();
				String information = scanner.nextLine();
				String[] informationList = information.split(" ");
				String value1 = informationList[0];
				String value2 = informationList[1];
				int subjectScore = 0;
				
				if(studentMap.isEmpty()) {
					System.out.println("데이터가 없습니다."); // 데이터가 없으면 검색 불가능
				}
				
				
				for(Student students : studentMap.keySet()) {
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
//						// set에는 순서가 보장되지 않는다.
//						if(studenSet.indexOf(students)==studenSet.size()-1) { // 학생 정보가 없으면 해당 문구를 출력해준다.
//							System.out.println("데이터가 없습니다.");
//						}
						setNum+=1;	
					}
					if(setNum==studentMap.size()-1) {
						System.out.println("데이터가 없습니다."); // 학생 정보가 없다
						setNum=0;
					}	
				}
				break;
				
			case 3:
				System.out.println("삭제할 학생 이름");
				String deleteName = scanner.next();
				
				if(studentMap.isEmpty()) {
					System.out.println("데이터가 없습니다.");// 데이터가 없으면 삭제 불가능
				}
				
				for(Student students : studentMap.keySet()) {
					if(students.getName().equals(deleteName)) { // 학생 이름이 같아야 맞는 정보를 찾을 수 있다.
						studentMap.remove(students);// 학생 데이터 제거
						System.out.println("삭제되었습니다.");
						break;
					}
					else {
						
//						if(studenSet.indexOf(students)==studenSet.size()-1) { // 학생 정보가 없으면 해당 문구를 출력해준다.
//							System.out.println("데이터가 없습니다.");
//						}
						setNum+=1;	// map에는 순서가 보장되지 않는다.		
					}
					if(setNum==studentMap.size()-1) {
						System.out.println("데이터가 없습니다."); // 학생 정보가 없다
						setNum=0;
					}
					
				}
				break;
				
			case 4:
				System.out.println("학생 정보를 전부 출력합니다.");
				for(Student studentInformation : studentMap.keySet()) { //for문으로 모든 정보를 출력한다.
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
