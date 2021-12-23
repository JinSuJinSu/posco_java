package com.datastructure;

public class Employee {
	
	protected String id;
	protected String password;
	protected String name;
	protected String department;
	protected int isEmployee;
	//1 : 관리자, 2 : 정규직, 3:비정규직
	
	// 최초로 생성할 때 필요한 생성자
	public Employee(String id, String password, String name, String department, int isEmployee) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.department = department;
		this.isEmployee = isEmployee;
	}
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getIsEmployee() {
		return isEmployee;
	}

	public void setIsEmployee(int isEmployee) {
		this.isEmployee = isEmployee;
	}
	

	


}
