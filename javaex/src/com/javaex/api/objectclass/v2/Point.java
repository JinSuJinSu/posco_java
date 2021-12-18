package com.javaex.api.objectclass.v2;


// v2. equals
public class Point {
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		// 객체 문자열 포맷을 반환
		return String.format("Point(%d, %d)", x,y);
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Point) {
			Point other = (Point)obj;
			return x == other.x && y==other.y;
		}
		return super.equals(obj);
	}
	
	
	
	

}
