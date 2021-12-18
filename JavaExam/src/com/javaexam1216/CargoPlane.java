package com.javaexam1216;

public class CargoPlane extends Plane{
	
	
	public CargoPlane() {
	}

	public CargoPlane(String planeName, int fuelSize) {
		super(planeName, fuelSize);
	}

	@Override
	void flight(int distance) {
		// TODO Auto-generated method stub
		fuelSize-=(distance*5);
	}

}
