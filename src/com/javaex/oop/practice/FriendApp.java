package com.javaex.oop.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Friend> friendList = new ArrayList<Friend>();
		
		System.out.println("친구를 3명 등록해주세요");
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			String value = scanner.nextLine();
			String[] array = value.split(" ");
			Friend friend = new Friend(array[0],array[1],array[2]);
			friendList.add(friend);
		}
		
		scanner.close();
		
		for(Friend friend : friendList) {
			friend.showInfo(); 
		}
		

	}

}
