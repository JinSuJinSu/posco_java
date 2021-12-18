package com.javaex.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		// List는 interface
//		List<String> lst = new LinkedList<>();
		List<String> lst = new ArrayList<>();
		
		//객체 추가
		lst.add("Java");
		lst.add("C");
		lst.add("C++");
		lst.add("Python");
		
		//객체 삽입
		lst.add(2, "c#"); // 중간에 객체 삽입
		System.out.println(lst);
		
		//List는 중복 삽입 허용
		lst.add("Java");
		System.out.println(lst);
		
		// List 항목 수
		System.out.println("Size:" + lst.size());
		
		// 삭제
		lst.remove(2); // 인덱스로 삭제
		lst.remove("Python"); // 객체 삭제
		System.out.println(lst);
		
		// List,Set 같은 경우 Iterator 사용
		Iterator<String> it = lst.iterator();
		while(it.hasNext()) {
			String item = it.next(); // 다음 요소를 가져온다.
			System.out.println(item);
		}
		
		// 비우기
		lst.clear();
		System.out.println(lst);
		
		
	}
}
