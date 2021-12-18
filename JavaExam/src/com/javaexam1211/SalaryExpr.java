package com.javaexam1211;

public class SalaryExpr {
	
	private int bonus;

	public SalaryExpr() {
	}

	public SalaryExpr(int bonus) {
		this.bonus = bonus;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	public int getSalary(int grade) {
		int salary=0;
		switch(grade) {
		case 1:
			salary = bonus+100;
			break;
		case 2:
			salary = bonus+90;
			break;
		case 3:
			salary = bonus+80;
			break;
		case 4:
			salary = bonus+70;
			break;
		default:
			break;
		
		}
		return salary;
	}


}
