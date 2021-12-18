package com.javaexam1209;

import java.util.Arrays;
import java.util.List;

public class TwoArrayLab3 {
//		[실습4]
//		1. TwoArrayLab3 라는 클래스를 만든다.
//		2. 다음 사양의 int 타입 2차원 배열을 생성한다.
//
//		    1행   10, 20, 30, 40, 50
//		    2행   5, 10, 15
//		    3행  11, 22, 33, 44
//		    4행  9, 8, 7, 6, 5, 4, 3, 2, 1
//
//		3. 행단위 합을 구하여 다음과 같이 출력한다.
//
//		    1행의 합은 x 입니다.
//		    2행의 합은 x 입니다.
//		    3행의 합은 x 입니다.
//		    4행의 합은 x 입니다.
	public static void main(String[] args) {
		
			int[][] array = {{10, 20, 30, 40, 50},
		    		{5, 10, 15},
	    			{11, 22, 33, 44},
	    			{9, 8, 7, 6, 5, 4, 3, 2, 1}};
	
			int startNum=1;
			
			for(int[] values : array) {
				Integer nums[] = Arrays.stream(values).boxed().toArray(Integer[]::new); 
				List<Integer> numbers = Arrays.asList(nums);
				Integer sum = numbers.stream().reduce(0, Integer::sum);
				System.out.println(startNum + "행의 합은 " + sum + " 입니다.");
			}
					
				}
	
				
			}

