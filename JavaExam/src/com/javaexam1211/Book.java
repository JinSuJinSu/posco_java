package com.javaexam1211;

public class Book {
	
	String title;
	String author;
	int price;
	
	public Book() {
		
	}
	public Book(String title, String author, int price) {
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void getBookInfo() {
		System.out.println(title + "   " + author + "   " + price);
	}

}
