package com.sorting;

import java.util.Arrays;

public class BubbleSort {
	
	public static void main(String[] args) {
		int[] data = {90,78,100,30,55};
		for(int i=1; i<data.length; i++) {
			for(int j=0; j<data.length-i; j++) {
				if(data[j]>data[j+1]) {
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
					// 인접한 2개의 값들을 비교하교 앞에 있는 값이 더 클경우					
					// swap을 써서 위치를 바꿔준다.					
				}
			}
		}
		
		System.out.println(Arrays.toString(data));
		
	}

}
