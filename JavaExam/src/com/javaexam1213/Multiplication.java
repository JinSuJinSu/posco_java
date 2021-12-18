package com.javaexam1213;

public class Multiplication {
	protected int dan;
	protected int number;
	
	Multiplication() {
		
	}
	Multiplication(int dan) {
		this.dan = dan;
	}
	Multiplication(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	public void printPart() {
		if (number == 0) {
			System.out.print(dan + "단 : ");
			for(int n=1; n <= 9; n++)
				System.out.print(dan + "*" + n+ "="+dan*n + "\t");
			System.out.println();
		} else {
			System.out.println(dan + " * " + number + " = " + dan*number);
		}
	}
}
