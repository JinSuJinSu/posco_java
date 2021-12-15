package com.datamanagement;

import java.util.ArrayList;
import java.util.Scanner;

public class NewEmployeeApp {

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
		
		// 무한루프를 돌리는데 필요한 running 4개
		boolean running = true;
		boolean manageRunning = true;
		boolean informationRunning = true;
		
		int manageNum; // switch에 필요한 변수
		int informationNum; // switch에 필요한 변수
		String employment; // 현재 본인의 고용형태
				
		String id; // 아이디
		String password; // 패스워드
		String employeeName; // 직원 이름
		String result; // 삽입, 삭제, 추가 연산에 필요한 변수

		
		while(running) {
			System.out.println("당신은 누구입니까???? 1. 관리자   2.직원   3.프로그램 종료");
			int number = scanner.nextInt();
			manageRunning = true;
			informationRunning = true;

		switch(number) {
			case 1:// 관리자를 선택했을 때의 조건
				System.out.println("id>>>>>");
				id = scanner.next();
				System.out.println("password>>>>>");
				password = scanner.next();
				
				if(id.equals(manager.id) && password.equals(manager.password)) {
					System.out.println("관리자이시군요 다음작업을 수행하십시오");
					while(manageRunning) {
						System.out.println("1. 삽입   2.수정   3.삭제   4.   모든 정보 조회   5.나가기");
						manageNum = scanner.nextInt();
						switch(manageNum) {
						case 1: // 삽입
							// 정규직과 비정규직을 나눠서 선택한다.
							System.out.println("추가하고자 하는 직원의 고용 형태를 입력하세요 정규직/비정규직");
							employment = scanner.next();
							
							if(employment.equals("정규직")) {
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
							}
							
							else if(employment.equals("비정규직")) {
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
								
							}
							else {
								System.out.println("데이터를 제대로 입력하세요");
							}
							break;
						
							
						case 2: // 수정
							System.out.println("수정할 직원의 이름을 입력하세요");
							employeeName = scanner.next();
							result="NO";
							
							
							for(FullTime employee : fullTimeList) {
								if(employee.name.equals(employeeName)) {
									System.out.println("부서 : ");
									String newDepartment = scanner.next();
									System.out.println("연차 : ");
									int newYear = scanner.nextInt();
									employee.department = newDepartment; // 부서 수정
									employee.year = newYear; // 연차 수정
									result="OK";
									break;
								}	
							}
							
							if(result.equals("NO")) { // 정규직 리스트에서 사람을 찾을 수 없을 경우만 루프돌린다.
								for(PartTime employee : partTimeList) {
									if(employee.name.equals(employeeName)) {// 이름이 일치하는 직원 데이터 찾기
										System.out.println("부서 : ");
										String newDepartment = scanner.next();
										System.out.println("근무일수 : ");
										int newWorkTime = scanner.nextInt();
										employee.department = newDepartment; // 부서 수정
										employee.workTime = newWorkTime; // 근무일수 수정
										result="OK";
									
									}	
								}
							}

							if(result.equals("OK")) {
								System.out.println("데이터 수정이 완료되었습니다.");
							}
							else {
								System.out.println("찾으시는 정보가 없습니다. 정확하게 입력하세요");
							}
							break;
						case 3: // 삭제
							System.out.println("퇴사한 직원의 이름을 입력하세요");
							employeeName = scanner.next();
							result="NO";
							
							for(FullTime employee : fullTimeList) {
								if(employee.name.equals(employeeName)) { // 이름이 일치하는 직원 데이터 찾기
										fullTimeList.remove(fullTimeList.indexOf(employee));
										result="OK";
										break;
								}	
							}
							
							if(result.equals("NO")) { // 정규직 리스트에서 사람을 찾을 수 없을 경우만 루프돌린다.
								for(PartTime employee : partTimeList) {
									if(employee.name.equals(employeeName)) {// 이름이 일치하는 직원 데이터 찾기
											partTimeList.remove(partTimeList.indexOf(employee));
											result="OK";
											break;
									}	
								}
							}

							if(result.equals("OK")) {
								System.out.println("데이터 삭제가 완료됬습니다.");
							}
							else {
								System.out.println("찾으시는 정보가 없습니다. 정확하게 입력하세요");
							}
							break;
							
						case 4: // 정보출력
							System.out.println("정규직 전체 직원 데이터");
							System.out.println("아이디\t 비밀번호\t 이름\t 나이\t 부서\t 연차\t 기본급\t 수당\t 지급액\t 세금\t 차임지급액\t 고용형태");
							System.out.println();
							for(FullTime employee : fullTimeList) {
								employee.showAllinformation();;
							}
							System.out.println();
							System.out.println("비정규직 전체 직원 데이터");
							System.out.println("아이디\t 비밀번호\t 이름\t 나이\t 부서\t 근무일수\t 지급액\t 고용형태");
							System.out.println("");
							for(PartTime employee : partTimeList) {
								employee.showAllinformation();;
							}
							break;
						case 5:
							manageRunning = false;
							break;
						default:
							continue;
					}
			}
		}			
				else {
					System.out.println("관리가자 아니군요 똑바로 입력하세요");
				}
				break;
			case 2: // 직원케이스 였을때의 조건
				while(informationRunning) {
				System.out.println("원하시는 목록을 선택하세요 1. 정보조회 2. 나가기");
				informationNum = scanner.nextInt();
				if(informationNum==1) {
				System.out.println("이름을 입력하세요");
				employeeName  = scanner.next();
				result="NO";
				
				for(FullTime employee : fullTimeList) {
					if(employee.name.equals(employeeName)) { // 이름이 일치하는 직원 데이터 찾기
							employee.showInformation();
							result="OK";
							break;
					}	
				}
				
				if(result.equals("NO")) { // 정규직 리스트에서 사람을 찾을 수 없을 경우만 루프돌린다.
					for(PartTime employee : partTimeList) {
						if(employee.name.equals(employeeName)) {// 이름이 일치하는 직원 데이터 찾기
								employee.showInformation();
								result="OK";
								break;
						}	
					}
				}
				
				
				if(result.equals("NO")) {
					System.out.println("데이터가 없습니다. 제대로 입력하세요");
				}
				}
				
				else if(informationNum==2) {
					informationRunning = false;
				}
				else {
					continue;
				}
				}
				break;
					
			case 3: // 나가기
				System.out.println("프로그램 종료합니다.");
				running=false;
				break;
			default: // 다른 값을 입력했을 때는 continue
				continue;
		}
		}
	}
}
				
			
				

				
				
				
		

				
				
							
					
				

