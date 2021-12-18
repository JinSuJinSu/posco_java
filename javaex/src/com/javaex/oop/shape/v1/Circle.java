package com.javaex.oop.shape.v1;

public class Circle extends Shape{
	protected double r; // 반지름
	
	public Circle(int x, int y, double r) {
		super(x,y);
		this.r = r;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.printf("원[x=%d, y=%d, r=%f, area=%f]을 그렸어요%n",
				x, y, r, area());
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(r,2);
	}
	
	

}
