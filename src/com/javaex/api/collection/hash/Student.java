package com.javaex.api.collection.hash;

public class Student {
	
	int id;
	String name;
	
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	//해시코드 비교 -> equals 확인 -> 통과
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// 객체 식별값(정수)
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Student) {
			// 다운캐스팅
			Student other = (Student)obj;
			return name.equals(other.name) && id == other.id; 
		}
		return super.equals(obj);
	}
	
	
	
	

}
