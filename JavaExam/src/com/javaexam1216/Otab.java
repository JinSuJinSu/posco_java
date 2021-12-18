package com.javaexam1216;



public class Otab extends Mobile{
	
	public Otab() {
		super();
	}
	
	public Otab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType);
	}

	@Override
	void operate(int time) {
		// TODO Auto-generated method stub
		batterySize-=(12*time);
	}

	@Override
	void charge(int time) {
		// TODO Auto-generated method stub
		batterySize+=(8*time);
	}
	

}

