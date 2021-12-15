package com.sorting;

public class DoubleLinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DoubleLinkedList list = new DoubleLinkedList();
		list.addFirst(40); 
		list.addFirst(30);
		list.addFirst(20);
		list.addFirst(10); 
		System.out.println(list.toString()); // 10 20 30 40
		
		list.add(2, 25); // 10 20 25 30 40 
		System.out.println(list.toString());
		
		list.addLast(50);
		System.out.println(list.toString()); // 10 20 25 30 40 50
		
		list.add(0, 25);
		System.out.println(list.toString());
		
		list.add(5, 25);
		System.out.println(list.toString());
		
		list.removeFirst();
		System.out.println(list.toString());
		
		list.removeLast();
		System.out.println(list.toString());
		
		list.remove(2);
		System.out.println(list.toString());
		
		






	}

}
