package com.scoreprogramm;

import java.util.Scanner;

public class Student {
	
	// 필드
	private String name;
	private int languageScore;
	private int englishScore;
	private int mathScore;
	private double avgScore;
	private int sumScore;
	
	// 생성자
	public Student(String name, int languageScore, int englishScore, int mathScore) { // 초기 생성시 합계와 평균은 입력 불가
		this.name = name;
		this.languageScore = languageScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		this.sumScore = languageScore + englishScore + mathScore;
		this.avgScore = (double)(sumScore)/3; // 평균을 구하기 위해 강제 형변환
		
	}
	
	// getter, setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLanguageScore() {
		return languageScore;
	}

	public void setLanguageScore(int languageScore) {
		this.languageScore = languageScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	public void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	

	public double getAvgScore() {
		return avgScore;
	}


	public void setAvgScore(double avgScore) {
		this.avgScore = avgScore;
	}


	public int getSumScore() {
		return sumScore;
	}


	public void setSumScore(int sumScore) {
		this.sumScore = sumScore;
	}
	
}