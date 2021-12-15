package com.sorting;

public class CircularLinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircularLinkedList list = new CircularLinkedList();
		
        list.addFirst(10);
        System.out.println(list.toString());
        list.addFirst(20);
        list.addFirst(30);
        System.out.println(list.toString());
        
        list.addLast(40);
        list.addLast(40);
        System.out.println(list.toString());
        
        list.removeFirst();
        list.removeFirst();
        list.removeLast();
        list.removeLast();
        System.out.println(list.toString());

	}

}
