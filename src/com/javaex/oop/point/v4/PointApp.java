package com.javaex.oop.point.v4;

import com.javaex.oop.point.v4.Point;

public class PointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Point p1 = new Point(10,20);
		p1.draw();
		p1.draw(true);
		p1.draw(false);
		
//		Point p2 = new Point();
//		p2.setX(30);
//		p2.setY(40);
//		p2.draw();
		
		Point p2 = new Point(30,40);
		p2.draw();
		p2.draw(true);
		p2.draw(false);
		
		ColorPoint cp1 = new ColorPoint(10, 20, "red");
		cp1.draw(true);
		
		// 다형성 : 부모타입으로 자식객체 참조
		Point cp2 = new ColorPoint(30,40,"GREEN");
		cp2.draw(true);
		
		ColorPoint cp3 = new ColorPoint("blue");
		cp3.draw(true);
		

	}

}
