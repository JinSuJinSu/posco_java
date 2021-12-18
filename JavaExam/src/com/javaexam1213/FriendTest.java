package com.javaexam1213;

public class FriendTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Friend[] friendList = new Friend[5];
		friendList[0] = new Friend("김김일","010-1111-1111","hjs121@naver.com");
		friendList[1] = new Friend("김김이","010-1111-1112","hjs122@naver.com");
		friendList[2] = new Friend("김김삼","010-1111-1113","hjs123@naver.com");
		friendList[3] = new Friend("김김사","010-1111-1114","hjs124@naver.com");
		friendList[4] = new Friend("김김오","010-1111-1115","hjs125@naver.com");
		
		System.out.println("이름\t전화번호\t이메일");
		System.out.println("-----------------------------");
		for(Friend friend : friendList) {
			friend.getInfo();
		}

	}

}
