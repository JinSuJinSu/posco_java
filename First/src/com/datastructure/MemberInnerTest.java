package com.datastructure;



class Outter{
	
	private int num = 10;
	private static int num2 = 3;
	
	public void output() {
	
	class Inner{
		public void disp() {
			 System.out.println(num);
			System.out.println(num2);
		}
	}
	Inner in = new Inner();
	in.disp(); // 클래스 내에서 직접 호출하게 하는 것도 방법이다.
	}
}


public class MemberInnerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//메소드 안쪽에서 클래스가 있을 때 
		Outter o1 = new Outter();
		o1.output();
		
		
//		Outter.Inner o1 = new Outter().new Inner();
//		o1.disp();
//		
		// 강사님 코드
//		Outter out = new Outter();
//		Outter.Inner in = out.Inner();
//		in.disp();
		
		// 한줄 작성
		

	}

}
