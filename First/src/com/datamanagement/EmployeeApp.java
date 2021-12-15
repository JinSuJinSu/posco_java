package com.datamanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<FullTime> fullTimeList = new ArrayList<>();
		ArrayList<PartTime> partTimeList = new ArrayList<>();
		
		Employee manager = new Employee("admin","gk893wlstn","하진수",29,"관리부","관리자");
		
		FullTime fm1 = new FullTime("hjs321","123123","홍길동",31,"개발부",7,"정규직");
		fm1.calculation();
		fullTimeList.add(fm1);
		
		FullTime fm2 = new FullTime("hjs123","123123","홍길삼",38,"기술부",10,"정규직");
		fm2.calculation();
		fullTimeList.add(fm2);
		
		PartTime pm1 = new PartTime("hjs429","123123","홍길일",31,"영업부",20,"비정규직");
		pm1.calculation();
		partTimeList.add(pm1);
		
		PartTime pm2 = new PartTime("hjs429","123123","홍길칠",31,"기술부",20,"비정규직");
		pm2.calculation();
		partTimeList.add(pm2);
		
		
		System.out.println("프로그램을 시작합니다.");
		
		Scanner scanner = new Scanner(System.in);
		boolean running = true;
		boolean fullRunning = true;
		boolean partRunning = true;
		
		boolean manageRunning = true;
		boolean manageRunning1 = true;
		boolean manageRunning2 = true;
		
		
		int num;
		int manageNum;
		int fullNum;
		int partNum;
		
		
		String result = "NO";		
		String id;
		String password;
		String newName;

		
		while(running) {
			System.out.println("당신은 누구입니까???? 1. 관리자 2. 정규직  3. 비정규직 4.프로그램 종료");
			int number = scanner.nextInt();
			fullRunning = true;
			partRunning = true;
			manageRunning = true;
			manageRunning1 = true;
			manageRunning2 = true;
			
		switch(number) {
			case 1:
				System.out.println("id>>>>>");
				id = scanner.next();
				System.out.println("password>>>>>");
				password = scanner.next();
				
				if(id.equals(manager.id) && password.equals(manager.password)) {
					System.out.println("관리자이시군요 다음작업을 수행하십시오");
					
					while(manageRunning) {
						System.out.println("1. 정규직  2. 비정규직  3. 나가기");
						manageNum = scanner.nextInt();
						switch(manageNum) {
						case 1:
							while(manageRunning1) {
								System.out.println("1. 삽입  2.수정  3.삭제  4. 모든 정보 조회 5.나가기");
								fullNum = scanner.nextInt();
								switch(fullNum) {
								case 1:
									System.out.println("직웝 생성에 필요한 데이터를 입력하세요");
									System.out.println("아이디 : ");
									String fullId = scanner.next();
									
									System.out.println("패스워드 : ");
									String fullPassword = scanner.next();
									
									System.out.println("이름 : ");
									String fullName = scanner.next();
									
									System.out.println("나이 : ");
									int fullAge = scanner.nextInt();
									
									System.out.println("부서 : ");
									String fullDepartment = scanner.next();
									
									System.out.println("연차 : ");
									int fullYear = scanner.nextInt();
									
									// Scanner로 필요한 정보를 입력받아 필드 값에 넣고
									// 새로운 객체를 생성해준다.
									FullTime fm = new FullTime(fullId,fullPassword,fullName,
											fullAge, fullDepartment ,fullYear, "정규직");
									fm.calculation(); // 기본급, 수당, 지급액, 세금, 차인지급액 계산
									fullTimeList.add(fm); // fullTimeList에 필요한 데이터 추가
									break;
									
								case 2:
									System.out.println("수정할 직원의 이름을 입력하세요");
									newName = scanner.next();
									result="NO";
									
									
									for(FullTime employee : fullTimeList) {
										if(employee.name.equals(newName)) {
											System.out.println("부서 : ");
											String newDepartment = scanner.next();
											System.out.println("연차 : ");
											int newYear = scanner.nextInt();
											employee.department = newDepartment;
											employee.year = newYear;
											result="OK";
											break;
										}	
									}
									
									if(result.equals("NO")) {
										System.out.println("찾으시는 정보가 없습니다. 정확하게 입력하세요");
									}
									
									break;
								case 3:
									System.out.println("퇴사한 직원의 이름을 입력하세요");
									newName = scanner.next();
									result="NO";
									
									for(FullTime employee : fullTimeList) {
										if(employee.name.equals(newName)) {
												fullTimeList.remove(fullTimeList.indexOf(employee));
												result="OK";
												break;
										}	
									}
									
									if(result.equals("OK")) {
										System.out.println("데이터 삭제가 완료됬습니다.");
									}
									else {
										System.out.println("찾으시는 정보가 없습니다. 정확하게 입력하세요");
									}
									break;
								case 4:
									for(FullTime employee : fullTimeList) {
										employee.showInformation();
										System.out.println();
										System.out.println();
									}
									break;
								case 5:
									manageRunning1 = false;
									System.out.println("이용해주셔서 감사합니다.");
									break;
								default:
									continue;
							}
						}
						case 2:
							while(manageRunning2) {
								System.out.println("1. 삽입  2.수정  3.삭제  4. 모든 정보 조회 5.나가기");
								partNum = scanner.nextInt();
								switch(partNum) {
								case 1:
									System.out.println("직웝 생성에 필요한 데이터를 입력하세요");
									System.out.println("아이디 : ");
									String partId = scanner.next();
									
									System.out.println("패스워드 : ");
									String partPassword = scanner.next();
									
									System.out.println("이름 : ");
									String partName = scanner.next();
									
									System.out.println("나이 : ");
									int partAge = scanner.nextInt();
									
									System.out.println("부서 : ");
									String partDepartment = scanner.next();
									
									System.out.println("총 몇일 일했습니까? : ");
									int partDay = scanner.nextInt();
									
									// Scanner로 필요한 정보를 입력받아 필드 값에 넣고
									// 새로운 객체를 생성해준다.
									PartTime pm = new PartTime(partId,partPassword,partName,
											partAge,partDepartment,30,"비정규직");
									pm.calculation(); // 누적된 급여 계산(비정규직은 수당이 없다.)
									partTimeList.add(pm); // partTimeList에 필요한 데이터 추가
									break;
									
								case 2:
									System.out.println("수정할 직원의 이름을 입력하세요");
									newName = scanner.next();
									result="NO";
									
									
									for(PartTime employee : partTimeList) {
										if(employee.name.equals(newName)) {
											System.out.println("부서 : ");
											String newDepartment = scanner.next();
											System.out.println("총 몇일 일했습니까? : ");
											int newTime = scanner.nextInt();
											employee.department = newDepartment;
											employee.workTime = newTime;
											result="OK";
											break;
										}	
									}
									
									if(result.equals("NO")) {
										System.out.println("찾으시는 정보가 없습니다. 정확하게 입력하세요");
									}
									
									break;
								case 3:
									System.out.println("퇴사한 직원의 이름을 입력하세요");
									newName = scanner.next();
									result="NO";
									
									for(PartTime employee : partTimeList) {
										if(employee.name.equals(newName)) {
											partTimeList.remove(partTimeList.indexOf(employee));
												result="OK";
												break;
										}	
									}
									
									if(result.equals("OK")) {
										System.out.println("데이터 삭제가 완료됬습니다.");
									}
									else {
										System.out.println("찾으시는 정보가 없습니다. 정확하게 입력하세요");
									}
									break;
								case 4:
									for(PartTime employee : partTimeList) {
										employee.showInformation();
										System.out.println();
										System.out.println();
									}
									break;
								case 5:
									manageRunning2 = false;
									System.out.println("이용해주셔서 감사합니다.");
									break;
								default:
									continue;
							}
						}
						case 3:
							manageRunning = false;
							break;
							
						default:
							continue;
					}
					}

			}
			
				else {
					System.out.println("관리자가 아닙니다 데이터 똑바로 입력하세요");	
				}
				break;
			
			case 2:			
				while(fullRunning) {
					System.out.println("원하시는 목록을 선택해주세요");
					System.out.println("1. 정보조회   2. 나가기");
					fullNum = scanner.nextInt();
					
				switch(fullNum) {
					case 1:
						System.out.println("본인의 이름을 입력하세요");
						newName = scanner.next();
						result="NO";
						
						for(FullTime employee : fullTimeList) {
							if(employee.name.equals(newName)) {
								employee.showInformation();
								result="OK";
						}
							
						}
						
						if(result.equals("NO")) {
							System.out.println("찾으시는 정보가 없습니다. 정확하게 입력하세요");
						}
						break;
					case 2:
						System.out.println("이용해주셔서 감사합니다.");
						fullRunning=false;
						break;
					default:
						continue;					
				}
				}
				break;
				
			case 3:
				while(partRunning) {
					System.out.println("원하시는 목록을 선택해주세요");
					System.out.println("1. 정보조회   2. 나가기");
					int PartNum = scanner.nextInt();
				switch(PartNum) {
					case 1:
						System.out.println("본인의 이름을 입력하세요");
						newName = scanner.next();
						result = "NO";
						
						for(PartTime employee : partTimeList) {
							if(employee.name.equals(newName)) {
								employee.showInformation();
								result="OK";
								break;
							}
						}
						
						if(result.equals("NO")) {
							System.out.println("찾으시는 정보가 없습니다. 정확하게 입력하세요");
						}
											
						break;
					case 2:
						System.out.println("이용해주셔서 감사합니다.");
						partRunning=false;
						break;
					default:
						continue;
						
				}
				}
				break;
			case 4:
				System.out.println("이용해 주셔서 감사합니다.");
				running = false;
				break;
				
			default:
				continue;
			}
			
		}
				
		}
		
	}


