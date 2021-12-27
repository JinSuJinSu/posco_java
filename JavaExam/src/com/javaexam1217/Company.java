package com.javaexam1217;

import java.util.ArrayList;
import java.util.Scanner;

public class Company {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> employeeList = new ArrayList<Employee>();
		
		Secretary emp1 = new Secretary("Duke",1,"secretary",800);
		Sales emp2 = new Sales("Tuxi",2,"sales",1200);
		
		employeeList.add(emp1);
		employeeList.add(emp2);
		
		printEmployee(employeeList,false);
		
		for(Employee employee : employeeList) {
			if(employee instanceof Sales) { 
				Sales newEmployee = ((Sales)employee); // 객체타입을 부모에서 자식을 바꿀 때는 강제 형변환 필요
				newEmployee.incentive(100); //Sales의 인센티브는 80%
			}
			else if(employee instanceof Secretary) {// 객체타입을 부모에서 자식을 바꿀 때는 강제 형변환 필요
				Secretary newEmployee = ((Secretary)employee);
				newEmployee.incentive(100); //Secretary의 인센티브는 120%
			}
		}
		System.out.println();
		printEmployee(employeeList,true);
	}
	
	public static void printEmployee(ArrayList<Employee> emp, boolean isTax) {
		// 객체의 정보를 출력한다.(실행 결과를 참조)
	        // isTax 의 참/거짓 여부에 따라서 텍스 출력 여부를 결정하여 처리한다.
		if(isTax) {
			System.out.println("name   department   salary   tax   extra pay");
			System.out.println("----------------------------------------------------------------");
			for(Employee employee : emp) {
				if(employee instanceof Sales) {
					Sales newEmployee = ((Sales)employee);
					double taxResult = newEmployee.tax();
					double extraPayResult = newEmployee.getExtraPay();
					System.out.println(newEmployee.name + "   " +  newEmployee.department + "   " + 
							newEmployee.salary + "   " +  taxResult + "  " +  extraPayResult);
				}
				else if(employee instanceof Secretary) {
					Secretary newEmployee = ((Secretary)employee);
					double taxResult = newEmployee.tax();
					System.out.println(newEmployee.name + "   " +  newEmployee.department + "   " + 
							newEmployee.salary + "   " +  taxResult);
				}
			}
		}
		else {
			System.out.println("name   department   salary   extra pay");
			System.out.println("----------------------------------------------------------------");
			
			for(Employee employee : emp) {
				if(employee instanceof Sales) {
					Sales newEmployee = ((Sales)employee);
					double extraPayResult = newEmployee.getExtraPay();
					System.out.println(newEmployee.name + "   " +  newEmployee.department + "   " + 
							newEmployee.salary + "    " +  extraPayResult);
				}
				else {
					Secretary newEmployee = ((Secretary)employee);
					System.out.println(newEmployee.name + "   " +  newEmployee.department + "   " + 
							newEmployee.salary);
				}
			}
				
		}
	    }
}
