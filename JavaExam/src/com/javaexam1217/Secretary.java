package com.javaexam1217;

public class Secretary extends Employee implements Bonus{
	
	public Secretary() {
		super();
	}
	
	public Secretary(String name, int number, String department, int salary) {
		super(name,number,department,salary);
	}

	@Override
	public void incentive(int pay) {
		// TODO Auto-generated method stub
		salary+=pay*0.8;
	}
	

}
