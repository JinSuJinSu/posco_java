package com.javaex.oop.person;

public class Student extends Person{
	private String schollName;
	
	public Student(String schollName) {
		super();
		this.schollName = schollName;
	}
	
	public Student(String name, int age, String schollName) {
		super(name,age); // 부모 생성자
		this.schollName = schollName;
	}
	
	@Override
	public void showInfo() {
		System.out.printf("이름 : %s, 나이 : %d, 출신학교 : %s%n",name,age,schollName);
	}
	
	

}
