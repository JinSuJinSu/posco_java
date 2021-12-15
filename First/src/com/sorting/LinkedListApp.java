package com.sorting;

public class LinkedListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list = new LinkedList();
		
        list.addFirst(10);
        list.addFirst(20);
        list.addLast(30);
        System.out.println(list.toString());
     
        list.add(40,2);
        System.out.println(list.toString());
        list.add(40,1);
        
        System.out.println(list.toString());
        System.out.println(list.toString());
        System.out.println(list.indexOf(10));

      

 
        
        System.out.println(list.toString());
        
        
        
        

   

        

	}

}
