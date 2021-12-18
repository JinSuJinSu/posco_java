package com.javaexam1212;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GradeExpr {
	
	private int[] jumsu;

	public GradeExpr(int[] jumsu) {
		this.jumsu = jumsu;
	}
	
	double getAverage() {
		int totalScore = getTotal();
		return (double)totalScore/jumsu.length;
		
	}
	
	int getTotal() {
		int sum=0;
		for(int value : jumsu) {
			sum+=value;
		}
		return sum;
		
	}
	
	int getGoodScore() {
	    Integer[] scores = Arrays.stream(jumsu).boxed().toArray(Integer[]::new); 
		ArrayList<Integer> socreList = new ArrayList<Integer>(Arrays.asList(scores));
		return Collections.max(socreList);				
	}
	
	int getBadScore() {
	    Integer[] scores = Arrays.stream(jumsu).boxed().toArray(Integer[]::new); 
		ArrayList<Integer> socreList = new ArrayList<Integer>(Arrays.asList(scores));
		return Collections.min(socreList);		
	}

	public int[] getJumsu() {
		return jumsu;
	}

	public void setJumsu(int[] jumsu) {
		this.jumsu = jumsu;
	}
	
	
	
	

}
