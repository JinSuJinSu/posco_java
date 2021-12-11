package com.datastructure;

import java.util.Arrays;

public class Memory implements Popable{
	
	// 필드(배열 크기, 배열 정의)
	private int num;
	private int[] array;
	
	// 초기 생성자(초기 배열 생성은 안되므로 크기부터 정해주어야 한다.)
	public Memory(int num) {
		this.num = num;
	}
	
	// 추가 생성자
	public Memory(int num, int[] array) {
		this.num = num;
		this.array = array;
	}

	// getter, setter
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int[] getArray() {
		return array;
	}

	public void setArray(int[] array) {
		this.array = array;
	}

	
	// push 기능
	public void push(int num) {
		int[] newArray = new int[array.length+1];
		newArray = Arrays.copyOf(array, array.length+1);
		newArray[newArray.length-1] = num;
		array = newArray;
	}
	
	// 배열 생성 기능
	public void createArray() {
		array = new int[num];
		for(int i=0; i<num; i++) {
			array[i] = (int)(Math.random()*100) +1;
			}
		}

	// stack pop 기능
	// 선입후출
	public void stackPop() {
		if(array.length!=0) {// 빈 배열일경우 pop을 수행하면 안된다.
		int value = array[array.length-1];	
		int[] newArray = new int[array.length-1];		
		newArray = Arrays.copyOf(array, array.length-1);
		array = newArray;
		System.out.println("리턴값 : " + value);
		}
		else {
			System.out.println("배열이 비어 있습니다. 추가해주세요");
		}
	}
	
	// queue poll 기능
	// 선입선출
	public void queuePoll() {
		if(array.length!=0) {// 빈 배열일경우 poll을 수행하면 안된다.
		int value = array[0];
		int[] newArray = new int[array.length-1];
		newArray = Arrays.copyOfRange(array, 1, array.length);
		array = newArray;
		System.out.println("리턴값 : " + value);
		}
		else {
			System.out.println("배열이 비어 있습니다. 추가해주세요");
		}
	}

	@Override
	public void pop() {
		// TODO Auto-generated method stub
		
	}

}

	




