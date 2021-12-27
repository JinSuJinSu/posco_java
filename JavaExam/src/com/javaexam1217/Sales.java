package com.javaexam1217;

public class Sales extends Employee implements Bonus{
	
	public Sales() {
		super();
	}
	
	public Sales(String name, int number, String department, int salary) {
		super(name,number,department,salary);
	}

	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		salary+=pay*1.2; 
	}
	

	public double tax() {
		return salary*0.13;
	}
	
	public double getExtraPay() {
		return salary*0.03;
	}

}
