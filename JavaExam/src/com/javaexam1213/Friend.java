package com.javaexam1213;

public class Friend extends Person{
	
	private String phoneNum;
	private String email;

	Friend(String name, String phoneNum, String email) {
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	

	public void getInfo() {
		System.out.println(name +"\t" +  phoneNum  +"\t" + email);
	}
	
}
