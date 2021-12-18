package com.javaexam1211;

public class Product {
	
	private String name;
	private int balance;
	private int price;
	
	public Product() {
		name = "듀크인형";
		balance = 5;
		price = 10000;
		
	}
	public Product(String name, int balance, int price) {
		this.name = name;
		this.balance = balance;
		this.price = price;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	



}
