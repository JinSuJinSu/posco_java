package com.javaexam1213;

public class GuGuDan {
	
	public static void main(String[] args) {
		int dan =(int)( Math.random()*20)+1;
		int number =(int)( Math.random()*20)+1;
		
		System.out.println(dan);
		System.out.println(number);
		
		if(dan>=1 && dan<=9 && number>=1 && number<=9) {
			GuGuDanExpr gugu = new GuGuDanExpr(dan,number);
			gugu.printPart();
		}
		
		else if(dan>=1 && dan<=9 && number>=10) {
			GuGuDanExpr gugu = new GuGuDanExpr(dan);
			gugu.printPart();
		}
		else if(dan>=10) {
			GuGuDanExpr gugu = new GuGuDanExpr(dan);
			gugu.printAll();
		}
		
		
		
	}
	

}
