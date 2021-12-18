package com.javaexam1213;

public class Human {
	
	protected String name;
	protected int age;
	protected int height;
	protected int weight;
	
	public Human() {
		
	}
	
	public Human(String name, int age, int height, int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public void printInformation() {
		System.out.println(name + "\t" + age + "\t" + height + "\t" + weight);
	}
	
	

}
