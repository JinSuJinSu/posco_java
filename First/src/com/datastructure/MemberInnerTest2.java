package com.datastructure;


abstract class Abs{
	abstract void disp(); // "disp"
	
}



class Outter2{
	
	private int num = 10;
	private static int num2 = 3;
	
	
	public void output() {
		// 무조건 extend하기 보단 
		// abstract 개념을 제대로 이해하자
	new Abs() {
	
	@Override
	public void disp() {
	     System.out.println(num);
		System.out.println(num2);
	}
	}.disp();
	}
	
}


public class MemberInnerTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outter2 outer = new Outter2();
		outer.output();
		
	}

}
