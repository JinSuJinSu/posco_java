package com.javaex.api.generic;

public class BoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IntBox iBox = new IntBox();
		iBox.setContent(10);
		System.out.println("IntBox:" + iBox.getContent());
		StrBox sBox = new StrBox();
		sBox.setContent("String");
		System.out.println("StrBox:" + iBox.getContent());
		
		ObjBox oBox = new ObjBox();
		oBox.setContent(10);
		oBox.setContent("String");
		
		String value =  (String)oBox.getContent();
		System.out.println("content:" + value);
//		int iValue =  (Integer)oBox.getContent();
		
		GenericBox<Integer> intGbox = new GenericBox<Integer>();
		//1. 컴파일러에서 파일 체크 가능
		intGbox.setContent(10);
		//2. 다운캐스팅의 불편을 취소
		Integer iValue = intGbox.getContent();
		System.out.println("content:" + iValue);
		
		GenericBox<String> strGbox = new GenericBox<>();

	}

}
