package com.javaexam1216;

public class AirPlane extends Plane{
	
	
	public AirPlane() {
	}

	public AirPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	void flight(int distance) {
		// TODO Auto-generated method stub
		fuelSize-=(distance*3);
	}

}
