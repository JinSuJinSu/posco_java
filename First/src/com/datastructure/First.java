package com.datastructure;

public class First {
	
	//field
	private int a;
	private int b;
	
	//constructor
	public First() {
//		a=b=0; // 명확한 코딩을 하는 것이 좋은 습관
		this(0,0);
	}
	
	public First(int a) {
//		this.a = a;
//		b=0; // 명확한 코딩을 하는 것이 좋은 습관
		this(a,0);
	}
	
	public First(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		First aa = new First();
		First bb = new First(10);
		First cc = new First(20,3);
		
		System.out.println(aa.getA()+"\t" + aa.getB()); // 0,0
		System.out.println(bb.getA()+"\t" + bb.getB()); // 10,0
		System.out.println(cc.getA()+"\t" + cc.getB()); // 20,3
		

	}

}
