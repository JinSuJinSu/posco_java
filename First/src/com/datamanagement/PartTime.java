package com.datamanagement;

public class PartTime extends Employee implements Manipulationable{
	
	public int workTime;
	public static int hourWage = 1;
	public int totalP;
	
	// 최초로 생성할 때 필요한 생성자
	public PartTime(String id, String password, String name, int age,
			String department, int workTime, String isEmployee) {
		super(id,password,name,age,department,isEmployee);
		this.workTime = workTime;
	}

	public int getWorkTime() {
		return workTime;
	}

	public void setWorkTime(int workTime) {
		this.workTime = workTime;
	}

	public int getHourWage() {
		return hourWage;
	}

	public void setHourWage(int hourWage) {
		this.hourWage = hourWage;
	}

	public int getTotalP() {
		return totalP;
	}

	public void setTotalP(int totalP) {
		this.totalP = totalP;
	}

	@Override
	public void calculation() {
		// TODO Auto-generated method stub
	this.totalP = workTime*8*hourWage;
	
	}

	@Override
	public void showInformation() {
		// TODO Auto-generated method stub
		System.out.println("아이디 : " + id);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age +"살");
		System.out.println("부서 : " + department);
		System.out.println("총 일한 일수 : " + workTime + "일");
		System.out.println("지급액 : " + totalP + "만원");
		System.out.println("고용형태 : " + isEmployee);
	}

	@Override
	public void showAllinformation() {
		// TODO Auto-generated method stub
		System.out.printf("%s\t %s\t %s\t %d\t %s\t %d\t %d\t 비정규직%n",
				id,password,name,age,department,workTime,totalP);
		
	}
	
	
	

}
