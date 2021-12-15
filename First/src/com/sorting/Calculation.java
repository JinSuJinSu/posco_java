package com.sorting;

import java.util.Arrays;
import java.util.Stack;

public class Calculation {
	
//	Stack<String> stack = new Stack<>();
	
		int stackNum = 0;

		
//		for(int i=0; i<array.length; i++) {
//			array[i] = String.valueOf(newValue.charAt(i));		
//		}
//		
//		String resultValue = "";
//		
//		
//		for(int i=0; i<array.length; i++) {
//			if(array[i].equals("+"))
//			{
//				stack.push(array[i]);
//			}
//			if(array[i].equals("-")) {
//				stack.push(array[i]);
//			}
//			if(array[i].equals("(")) {
//				resultValue= resultValue.concat(stack.pop());
//				resultValue= resultValue.concat(" ");
//				stack.push(array[i-1]);	
//			}
//			if(array[i].equals(")")) {
//				while(!stack.peek().equals("(")) {
//					resultValue= resultValue.concat(stack.pop());
//					resultValue = resultValue + " ";
//				}
//				stack.pop();
//			}
//			else {
//				resultValue= resultValue.concat(array[i]);
//				resultValue= resultValue.concat(" ");
//			}
//			System.out.println(resultValue);
//		}
//	}
//	
	public static void main(String[] args) {
		String expression = "113 + 11 - (32 - (9 -2 + 6))";
		String newValue = expression.replace("\\s", "");
		String[] array = newValue.split("(+-)");
		System.out.println(Arrays.toString(array));
		
		
	}

}
