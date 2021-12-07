package com.javaex.oop.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class BookApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Book> bookList = new ArrayList<Book>();
		
		Book book1 = new Book(1,"트와일라잇","스테파니메이어");
		Book book2 = new Book(2,"뉴문","스테파니메이어");
		Book book3 = new Book(3,"이클립스","스테파니메이어");
		Book book4 = new Book(4,"브레이킹던","스테파니메이어");
		Book book5 = new Book(5,"아리랑","조정린");
		Book book6 = new Book(6,"젊은 그들","김동인");
		Book book7 = new Book(7,"아프니깐 청춘이다","김난도");
		Book book8 = new Book(8,"귀천","천상병");
		Book book9 = new Book(9,"태백산맥","조정래");
		Book book10 = new Book(10,"풀하우스","원수연");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		bookList.add(book4);
		bookList.add(book5);
		bookList.add(book6);
		bookList.add(book7);
		bookList.add(book8);
		bookList.add(book9);
		bookList.add(book10);
		

		

	}

}
