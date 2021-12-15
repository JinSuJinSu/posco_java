package com.sorting;

import java.util.Arrays;

public class SortPracitce {
	
	int[] randomArray; //필드 생성
	
	public int[] randomCeration() {
		this.randomArray = new int[20];
		for(int i=0; i<this.randomArray.length; i++) {
			this.randomArray[i] = (int)(Math.random()*100) + 1;
		}
		return randomArray;
	}
	
	// 퀵정렬 메소드
    int[] quickSort(int[] array,int start, int end) {
        int part=partition(array,start,end);
        
        if(start<part-1) {
        	quickSort(array,start,part-1); // 초기 피벗을 기준으로 왼쪽에서 퀵정렬을 다시 해준다.
        }
        
        if(end>part) {
        	quickSort(array,part,end);
        // 초기 피벗을 기준으로 오른쪽에서 퀵정렬을 다시 해준다.
    }
        
        return array;
    }
   
    // 퀵정렬에 필요한 값 비교 메소드
   int partition(int[] array,int start,int end) {
        int pivot=array[(start+end)/2]; // 중간에 피벗을 잡는게 일반적인 방법
        
        while(start<=end) {
            while(array[start]<pivot) {
            	start++; 
            	// 피벗에서 맨왼쪽부터 순차적으로 접근할 때 값이 피벗보다 작으면 그대로 두고
            	// 클 때 루프 탈출 후 조건을 줘야된다.
            }
            while(array[end]>pivot) {
            	end--;
            	// 피벗에서 맨오른쪽부터 순차적으로 접근할 때 값이 피벗보다 크면 그대로 두고
            	// 작을 때 루프 탈출 후 조건을 줘야된다.
            }
            
            if(start<=end) {
                int temp=array[start];
                array[start]=array[end];
                array[end]=temp;
                // 값을 교체시킨다.               
                start++;
                end--;
            }
        }       
        return start;
    }
   
// 버블 정렬 메소드
	void bubbleSort(int[] data) {
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
			System.out.println(Arrays.toString(data));;
		}
	
	// 삽입 정렬 메소드
	void insertionSort(int[] data) {
		
		for (int i = 1; i < data.length; i++) {
            int index = i; // 삽입될 위치를 저장하기 위한 index를 만들어준다.
            int temp = data[i]; // temp로 값을 저장시킨다.

            // 이미 정렬된 배열에서 현재 정렬대상 값이 삽입될 위치의 인덱스를 찾고 현재값보다 큰값은 한칸씩 뒤로 이동시킨다.
            while( (index > 0) && (data[index - 1] > temp) ) {
            	data[index] = data[index -1];
            	index--;
            }
            
            data[index] = temp; // 삽입될 위치에 temp를 삽입한다.
        }
		System.out.println(Arrays.toString(data));;
	}
	
	public static void main(String[] args) {
		
		// 인스턴스 생성
		SortPracitce ex1 = new SortPracitce();
		SortPracitce ex2 = new SortPracitce();
		SortPracitce ex3 = new SortPracitce();
		
		// 배열생성
		int[] array1 = ex1.randomCeration();
		int[] array2 = ex2.randomCeration();
		int[] array3 = ex3.randomCeration();
		
		// 퀵정렬 전,후 비교
		System.out.println(Arrays.toString(array1));
		int[] newArray = ex1.quickSort(array1,0,array1.length-1);
		System.out.println(Arrays.toString(newArray));
		System.out.println();
		
		// 버블정렬 전,후 비교
		System.out.println(Arrays.toString(array2));
		ex2.bubbleSort(array2);
		System.out.println();
		
		// 삽입정렬 전,후 비교
		System.out.println(Arrays.toString(array3));
		ex3.insertionSort(array3);		
	}
}
