package com.javaex.api.objectclass.v2;

public class Rectangle {
	
	protected int x;
	protected int y;
	protected int radis;
	
	public Rectangle(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Rectangle) {
			Rectangle other = (Rectangle)obj;
			return x*y == other.x*other.y;
		}
		return super.equals(obj);
	}

}
