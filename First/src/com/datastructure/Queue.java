package com.datastructure;

import java.util.Arrays;

public class Queue extends Memory{
	
	// 메모리 상속
	private int num;
	private int[] array;
	
	public Queue(int num) {
		super(num);
	}
	
	public Queue(int num, int[] array) {
		super(num, array);
	}

//	public void pop() {
//		int value = array[0];
//		int[] newArray = new int[array.length-1];
//		newArray = Arrays.copyOfRange(array, 1, array.length);
//		array = newArray;
//		System.out.println("리턴값 : " + value);
//	}
}
