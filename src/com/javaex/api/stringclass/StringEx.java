package com.javaex.api.stringclass;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		usefulMethods();
		stringBufferEx();

	}
	private static void stringBufferEx() {
		// 버퍼링 생성
		StringBuffer sb = new StringBuffer("This");
		System.out.println(sb);
		
		// 문자열 추가 : append
		sb.append(" is pencil");
		System.out.println(sb);
		
		// 문자열 삽입
		sb.insert(7, " my");
		System.out.println(sb);
		
		// 문자열 치환
		sb.replace(7, 10, " your");
		System.out.println(sb);
		
		// 버퍼 사이즈 조정 : setLength
		sb.setLength(5);
		System.out.println(sb);
		
		StringBuffer sb2 = new StringBuffer("This").append(" is pencil").
				insert(7," my").replace(7,10," your");
		
		String s = sb2.toString();
		
		
		
		
	}
	
	private static void usefulMethods() {
		// 유용한 메서드들
		String str =  "Java Programming JavaScript Programming";
		System.out.println("str:" + str);
		System.out.println("LENGTH:" + str.length());
		
		// 변환 메서드
		System.out.println("UPPER:" + str.toUpperCase());
		System.out.println("LOWER:" + str.toLowerCase());
		
		// 검색 메서드
		System.out.println("인덱스 5의 글자:" + str.charAt(5));
		int index = str.indexOf("Java"); //Java의 인덱스
		System.out.println("1번째 Java 인덱스" + index);
		index = str.indexOf("Java",5); //5번째 이후의 인덱스
		System.out.println("2번째 Java 인덱스" + index);
		index = str.indexOf("Java",21); // 21번째 이후의 인덱스
		System.out.println("3번째 Java 인덱스" + index); // -1 찾을 수 없음
		
		System.out.println("마지막 Java 인덱스:" + str.lastIndexOf("Java"));
		
		// 문자열 추출
		System.out.println("substring(5):" + str.substring(5));
		System.out.println("substring(5,16):" + str.substring(5, 16)); // 5 ~ 16까지
		
		// 문자열 변경
		System.out.println("replace:" + str.replace("Programming", "Coding"));
		
		// 문자열은 변경되지 않음
		System.out.println("str:" + str);
		
		// 화이트 스페이스 제거
		String s2 = "                Hello          ";
		String s3 = "           Java               ";
		
		System.out.println(s2.trim() + " " + s3.trim());
		
		// 문자열 분리
		String[] words = str.split(" ");
		for(String word : words) {
			System.out.println("WORD: " + word);
		}
		
		// 문자열의 비교 : Unicode 비교
		// 0: 순서가 없다.
		// 음수 : 순서가 빠르다.
		// 양수 : 순서가 높다.
		System.out.println("ABC".compareTo("ABD"));
		
		
		
	}

}
