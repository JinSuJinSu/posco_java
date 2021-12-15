package com.sorting;

import java.util.Arrays;

public class SortEx {
	
	double[] randomArray; //필드 생성
	
	public void randomCeration() {
		this.randomArray = new double[100];
		for(int i=0; i<this.randomArray.length; i++) {
			this.randomArray[i] = Math.random();
		}
	}
	
	// 버블 정렬 메소드
	public void bubbleSort(double[] data) {
			for(int i=1; i<data.length; i++) {
				for(int j=0; j<data.length-i; j++) {
					if(data[j]>data[j+1]) {
						double temp = data[j];
						data[j] = data[j+1];
						data[j+1] = temp;
						// 인접한 2개의 값들을 비교하교 앞에 있는 값이 더 클경우					
						// swap을 써서 위치를 바꿔준다.					
					}
				}		
			}
			System.out.println(Arrays.toString(data));
		}
	
	// 삽입 정렬 메소드
	public void insertionSort(double[] data) {
		
		for (int i = 1; i < data.length; i++) {
            int index = i; // 삽입될 위치를 저장하기 위한 index를 만들어준다.
            double temp = data[i]; // temp로 값을 저장시킨다.

            // 이미 정렬된 배열에서 현재 정렬대상 값이 삽입될 위치의 인덱스를 찾고 현재값보다 큰값은 한칸씩 뒤로 이동시킨다.
            while( (index > 0) && (data[index - 1] > temp) ) {
            	data[index] = data[index -1];
            	index--;
            }
            
            data[index] = temp; // 삽입될 위치에 temp를 삽입한다.
        }
        System.out.println(Arrays.toString(data));
	}
		
	public static void main(String[] args) {
		
		SortEx ex1 = new SortEx();
		
		ex1.randomCeration();
		ex1.bubbleSort(ex1.randomArray);
		ex1.insertionSort(ex1.randomArray);	
	}

}
