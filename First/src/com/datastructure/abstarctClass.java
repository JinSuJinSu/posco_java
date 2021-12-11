package com.datastructure;

interface ss{
	// 상수, 메소드
//	final static int num = 100;
	int num = 100; // 위에 있는 것과 같은 코드이다.
	void disp(); // 추상 메소드(abstract 생략)
}

interface sss extends ss{
	// 상수, 메소드
//	final static int num = 100;
	int num = 100; // 위에 있는 것과 같은 코드이다.
	void disp(); // 추상 메소드(abstract 생략)
}

interface ssss extends ss, sss{
	// 상수, 메소드
//	final static int num = 100;
	int num = 100; // 위에 있는 것과 같은 코드이다.
	void disp(); // 추상 메소드(abstract 생략)
}

public class abstarctClass implements ssss{
	
// 추상 클래스
// 1. 오직 상속을 목적으로 사용
// 2. 추상클래스를 상속받는 sub class는 무조건 추상메소드를 오버라이드 해야한다.(하지 않을 경우 추상클래스화 되서 객체를 생성할 수 없다.)
// 3. 추상메소드는 강제성을 발휘하기 때문에 꼭 오버라이드를 해야한다.
// 4. 추상클래스 보다 더 추상화된 것은 inferface
// 5. 추상메소드, 상수를 갖는게 원칙
// 6. 인터페이스는 다중 상속 허용(모호성이 발생하지 않는다.)
// 7. 다중상속을 대체하기 위해 만들어졌다.
	
	@Override
	public void disp() {
		
	}
	


}
