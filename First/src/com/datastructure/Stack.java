package com.datastructure;

import java.util.Arrays;

public class Stack extends Memory{
	
	// 스택 상속
	private int num;
	private int[] array;
	
	public Stack(int num) {
		super(num);
	}
	
	public Stack(int num, int[] array) {
		super(num, array);
	}

//	public void pop() {
//		int value = array[array.length-1];	
//		int[] newArray = new int[array.length-1];		
//		newArray = Arrays.copyOf(array, array.length-1);
//		array = newArray;
//		System.out.println("리턴값 : " + value);	
//	}
	
}
