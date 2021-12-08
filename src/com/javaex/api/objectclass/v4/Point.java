package com.javaex.api.objectclass.v4;


// v4. 깊은 복사
// 객체의 필드데이터를 확실하게 복제
public class Point implements Cloneable{
	private int x;
	private int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Point getClone() {
		// 복제본
		Point clone = null;
		try {
		clone = (Point)clone();
		} 
		catch(CloneNotSupportedException e) {
			// 복제 실패
			e.printStackTrace();
		}	
		return clone;
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

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
	
	
	
	

}
