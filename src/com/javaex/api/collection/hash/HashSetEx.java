package com.javaex.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Hash 알고리즘을 사용하는 컬렉션
		// HashSet 순서가 없다. 중복을 허용하지 않음	
//		hashSetEx();
		hashSetCustom();

	}
	
	private static void hashSetCustom() {
		HashSet<Student> hs = new HashSet<>();
		Student s1 = new Student("홍길동",1);
		Student s2 = new Student("홍길동",2);
		Student s3 = new Student("홍길동",1);
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		
		System.out.println(hs);
		System.out.println(s1.equals(s3));
		
		}
	
	private static void hashSetEx() {
		HashSet<String> hs = new HashSet<>();
		
		// 객체 추가
		hs.add("Java");
		hs.add("C");
		hs.add("Python");
		hs.add("Java");
		
		System.out.println(hs);
		
		//원소의 개수
		System.out.println("hs.size=" + hs.size());
		
		// 포함여부
		System.out.println("contains Java ? " + hs.contains("Java"));
		System.out.println("contains Linux ? " + hs.contains("Linux"));
		
		// 객체 삭제
		hs.remove("Python");
		System.out.println(hs);
	}

}
