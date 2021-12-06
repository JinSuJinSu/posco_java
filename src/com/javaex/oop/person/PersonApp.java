package com.javaex.oop.person;

public class PersonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person("정우성",45);
		p1.showInfo();
		
		Student s1 = new Student("서울고등학교");
		s1.setName("외계인");
		s1.setAge(1000);
		
		Student s2 = new Student("이정재", 45, "한국고등학교" );
		
		s1.showInfo();
		s2.showInfo();
		
		Person p10 = new Student("하버드대학교");
		p10.setName("천재");
		p10.setAge(25);
		p10.showInfo();
		

	}

}
