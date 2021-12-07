package com.javaex.oop.practice;

public class Friend {
	
	String name;
	String phoneNumber;
	String school;
	
	public Friend(String name, String phoneNumber, String school) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.school = school;
	}
	
	void showInfo() {
		System.out.printf("이름:%s  핸드폰:%s  학교:%s%n",name,phoneNumber,school);
	}

}
