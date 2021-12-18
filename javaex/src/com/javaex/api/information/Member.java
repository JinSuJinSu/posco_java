package com.javaex.api.information;

public class Member implements Comparable{
	
	String name;

	public Member(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Member [name=" + name + "]";
	}
	
	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		// 0 : 두 객체의 순번이 같다.
		// 음수 : 순서가 앞이다.
		// 양수 : 순거가 뒤다.
		if(o instanceof Member) {
			Member other = (Member)o;
			return name.compareTo(other.name);
		}
		return 0;
	}
	
	

}
