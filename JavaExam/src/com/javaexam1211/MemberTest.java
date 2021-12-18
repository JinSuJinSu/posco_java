package com.javaexam1211;

public class MemberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member1 = new Member("홍길동","hjs","123123",2000);
		Member member2 = new Member("홍길칠","hjss","123124",2001);
		Member member3 = new Member("홍길일","hjsss","123125",2002);
		
		System.out.printf("회원1 : %s(%s,%s,%d)%n",
				member1.getName(),member1.getAccount(),member1.getPasswd(),member1.getBirthYear());
		
		System.out.printf("회원2 : %s(%s,%s,%d)%n",
				member2.getName(),member2.getAccount(),member2.getPasswd(),member2.getBirthYear());
		
		System.out.printf("회원3 : %s(%s,%s,%d)%n",
				member3.getName(),member3.getAccount(),member3.getPasswd(),member3.getBirthYear());
	}

}
