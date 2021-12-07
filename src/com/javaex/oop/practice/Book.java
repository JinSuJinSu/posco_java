package com.javaex.oop.practice;

public class Book {
	
	int bookNo;
	String title;
	String author;
	int stateCode;
	
	public Book(int bookNo, String title, String author) {
		this.bookNo = bookNo;
		this.title = title;
		this.author = author;
		this.stateCode = 1;
	}
	
	
	public int getStateCode() {
		return stateCode;
	}


	public void setStateCode(int stateCode) {
		this.stateCode = stateCode;
	}



	public void rent() {
		if(stateCode==1) {
			this.stateCode=0;
			System.out.println(title + "가 대여됬습니다.");
		}
		else if(stateCode==0) {
			System.out.println("이미 대여중인 책입니다.");
		}
	}
	
	public void print() {
		if(stateCode==1) {
			System.out.println("재고 있음");
		}
		else if(stateCode==0) {
			System.out.println("대여중");
		}
	}
	


}
