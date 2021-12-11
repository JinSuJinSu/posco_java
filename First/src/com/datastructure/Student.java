package com.datastructure;

import java.util.Scanner;

public class Student {
	
	// 필드
	private String name;
	private int languageScore;
	private int englishScore;
	private int mathScore;
	
	// 생성자
	public Student(String name, int languageScore, int englishScore, int mathScore) {
		this.name = name;
		this.languageScore = languageScore;
		this.englishScore = englishScore;
		this.mathScore = mathScore;
		
	}

	// getter, setter
	// 성적을 조작하면 안되므로 set메소드는 private으로 설정한다..
	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getLanguageScore() {
		return languageScore;
	}

	private void setLanguageScore(int languageScore) {
		this.languageScore = languageScore;
	}

	public int getEnglishScore() {
		return englishScore;
	}

	private void setEnglishScore(int englishScore) {
		this.englishScore = englishScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	private void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}
	
}