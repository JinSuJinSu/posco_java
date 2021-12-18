package com.javaexam1216;

public abstract class Plane {
	
	protected String planeName;
	protected int fuelSize;
	
	public Plane() {
		
	}

	public Plane(String planeName, int fuelSize) {
		this.planeName = planeName;
		this.fuelSize = fuelSize;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	public int getFuelSize() {
		return fuelSize;
	}

	public void setFuelSize(int fuelSize) {
		this.fuelSize = fuelSize;
	}
	
	public void refuel(int fuel) {
		fuelSize+=fuel;
	}
	
	abstract void flight(int distance);
	
	

}
