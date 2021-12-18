package com.javaexam1213;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student arrays [] = new Student[3];
		
		Student s1 = new Student("홍길동",20,171,81,"201101","영문");
		Student s2 = new Student("고길동",20,183,72,"201102","건축");
		Student s3 = new Student("박길동",20,175,65,"201103","컴공");
		
		arrays[0] = s1;
		arrays[1] = s2;
		arrays[2] = s3;
		
		
		for(Student student : arrays) {
			student.printInformation();
		}
		

	}

}
