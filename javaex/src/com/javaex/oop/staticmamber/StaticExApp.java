package com.javaex.oop.staticmamber;

public class StaticExApp {
	
	public static void main(String[] args) {
		StaticEx s1 = new StaticEx();
		// static 멤버는 new 없이 접근 가능
		System.out.println("RefCount:" + StaticEx.refCount);
		
		StaticEx s2 = new StaticEx();
		System.out.println("RefCount:" + StaticEx.refCount);
		
		s2 = null; //s2 해제
		System.out.println("s2 해제");
		System.out.println("RefCount:" + StaticEx.refCount);
		
		// 주의 : 가급적이면 가비지 컬렉터를 직접 호출하지는 말것
		System.gc();
		try {
			Thread.sleep(3000); // 3초대기
		}
		catch(Exception e) {
			System.out.println("ERROR!!");
		}
		System.out.println("RefCount:" + StaticEx.refCount);
		
		

}
}
