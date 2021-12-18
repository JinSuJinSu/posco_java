package com.javaex.exam;

public class Exercise3 {
	
   public static void main(String[] args) {
	   
	   
//	   실습 3
//
//	   1. char 타입의 변수 name1, name2, name3 를 선언하고 본인 
//	      이름의 각 문자들을 문자 리터럴로 만들어 각각 저장한다.
//	   2. 이름을 하나의 행에 출력한다.  
//
//	   작성 클래스명 : Exercise3
	   
	   char ch1 = 'h',ch2 = 'j', ch3 = 's';
	   
	   String name1 = String.valueOf(ch1);
	   String name2 = String.valueOf(ch2);
	   String name3 = String.valueOf(ch3);
	   System.out.println(name1+name2+name3);
	    
}

}
