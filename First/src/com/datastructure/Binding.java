package com.datastructure;

class Halbe {
	public void disp() {
		System.out.println("halbe");
	}

}

class Abe extends Halbe{
	public void disp() {
		System.out.println("abe");
	}
}

class Me extends Halbe{
	public void disp() {
		System.out.println("me");
	}
}

class Binding{
	public static void main(String[] args) {
		
		// 정적 바인딩
		Halbe halbe = new Halbe();
		Abe abe =  new Abe();
		Me me = new Me();
		
//		halbe.disp();
//		abe.disp();
//		me.disp();
//		
		
		// 동적 바인딩 : 부모의 레퍼런스로 자식을 접근하는 방식
		Halbe h;
		h = halbe;
		h.disp();
		
		h = abe;
		h.disp();
		
		h = me;
		h.disp();
		
		halbe.disp();
		abe.disp();
		me.disp();
	}
	
	// 과제가 나왔음
	
		
}