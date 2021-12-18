package com.javaexam1211;

public class Member {
	
	private String name;
	private String account;
	private String passwd;
	private int birthYear;
	
	public Member(String name, String account, String passwd, int birthYear) {
		this.name = name;
		this.account = account;
		this.passwd = passwd;
		this.birthYear = birthYear;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	

	

}
