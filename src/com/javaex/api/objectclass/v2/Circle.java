package com.javaex.api.objectclass.v2;

public class Circle {
	protected int x;
	protected int y;
	protected int radis;
	
	public Circle(int x, int y, int radis) {
		this.x = x;
		this.y = y;
		this.radis = radis;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Circle) {
			Circle other = (Circle)obj;
			return radis == other.radis;
		}
		return super.equals(obj);
	}

}
