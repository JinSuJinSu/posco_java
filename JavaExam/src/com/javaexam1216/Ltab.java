package com.javaexam1216;

public class Ltab extends Mobile{
	
	public Ltab() {
		super();
	}
	
	public Ltab(String mobileName, int batterySize, String osType) {
		super(mobileName,batterySize,osType);
	}

	@Override
	void operate(int time) {
		// TODO Auto-generated method stub
		batterySize-=(10*time);
	}

	@Override
	void charge(int time) {
		// TODO Auto-generated method stub
		batterySize+=(10*time);
	}
	

}
