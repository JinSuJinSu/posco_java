package com.datamanagement;

public class FullTime extends Employee implements Manipulationable{
	
	public int year;
	public int benefit;
	public int basicSalary;
	public int payment;
	public double tax;
	public int totalF;
	
	// 최초로 생성할 때 필요한 생성자
	public FullTime(String id, String password, String name, int age,
			String department, int year, String isEmployee) {
		super(id,password,name,age,department,isEmployee);
		this.year = year;
	
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getBenefit() {
		return benefit;
	}

	public void setBenefit(int benefit) {
		this.benefit = benefit;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}

	public int getPayment() {
		return payment;
	}

	public void setPayment(int payment) {
		this.payment = payment;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public int getTotalF() {
		return totalF;
	}

	public void setTotalF(int totalF) {
		this.totalF = totalF;
	}

	@Override
	public void calculation() {
		// TODO Auto-generated method stub
		int nowYear = this.year;
		this.benefit = nowYear*10;
		this.basicSalary = 300 + (nowYear*10);
		this.payment = benefit + basicSalary;
		
		if(nowYear>=1 && nowYear<=10) {
			this.tax = 0.1;
		}
		else if(nowYear>=11 && nowYear<=20) {
			this.tax = 0.2;
		}
		else if(nowYear>=21 && nowYear<=30) {
			this.tax = 0.3;
		}
		else{
			this.tax = 0.4;
		}
		this.totalF = (int)((basicSalary +benefit)*(1-tax));
	}

	@Override
	public void showInformation() {
		// TODO Auto-generated method stub
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("부서 : " + department);
		System.out.println("연차 : " + year + "년차");
		System.out.println("기본급 : " + basicSalary + "만원");
		System.out.println("수당 : " + benefit + "만원");
		System.out.println("지급액 : " + payment + "만원");
		System.out.println("세금 : " + (tax*100) + "%");
		System.out.println("차인지급액 : " + totalF + "만원");	
		System.out.println("고용형태 : " + isEmployee);
	}

	@Override
	public void showAllinformation() {
		// TODO Auto-generated method stub
		System.out.printf("%s\t %s\t %s\t %d\t %s\t %d\t %d\t %d\t %d\t %.1f\t %d\t 정규직%n",
				id,password,name,age,department,year,basicSalary,benefit,payment,tax,totalF);
	}
	

}
