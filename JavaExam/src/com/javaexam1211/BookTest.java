package com.javaexam1211;

public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book("책1","김김김",10000);
		Book book2 = new Book("책2","김김칠",11000);
		Book book3 = new Book("책3","김김오",12000);
		Book book4 = new Book("책4","김김우",13000);
		
		Book book5 = new Book();
		book5.title = "책5";
		book5.author ="김김구";
		book5.price = 14000;
		
		book1.getBookInfo();
		book2.getBookInfo();
		book3.getBookInfo();
		book4.getBookInfo();
		book5.getBookInfo();
		

	}

}
