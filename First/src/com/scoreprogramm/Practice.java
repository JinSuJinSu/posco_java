package com.scoreprogramm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.HashSet;

public class Practice {

	public static void main(String[] args) throws Exception{
		
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		ArrayList<ArrayList<Integer>> datas = new ArrayList<ArrayList<Integer>>();
		// 두 점의 x,y 좌표 거리로 계산해야 하기 때문에 [[x1,y1],[x2,y2]] 이런식으로 저장해야함
		// 2차원 ArrayList를 생성해준다.
		
		for(int i=0; i<Integer.valueOf(input); i++) {
			String value = br.readLine();
			String[] array = value.split(" ");
			ArrayList<Integer> data = new ArrayList<>();
			data.add(Integer.valueOf(array[0])); // x좌표 구하기
			data.add(Integer.valueOf(array[1])); // y좌표 구하기
			datas.add(data); // 2차원 ArrayList에 데이터 추가해준다.	
		}
		
		ArrayList<Integer> startRock = datas.get(0); //왕눈이 돌
		
		ArrayList<Double> distances = new ArrayList<Double>();// 거리 정보를 담을 ArrayList 생성
		
		for(int i=1; i<datas.size(); i++) {
			int startX = startRock.get(0);
			int startY = startRock.get(1);
			int nowX = datas.get(i).get(0);
			int nowY = datas.get(i).get(1);
			double distance = Math.pow((Math.pow((nowX-startX),2)+Math.pow((nowY-startY),2)),0.5);
			// 두 좌표 사이의 거리를 구하는 공식은 ((x2-x1)^2 + (y2-y1)^2)^0.5
			distances.add(distance);
		}
		
		// 구하고자 하는 것은 최초 점프의 거리 즉, 최소 거리값을 가져오면 되는 것이다.
		double finalDistance = Collections.min(distances);
		
		System.out.printf("%.3f",finalDistance);
		
		
		
		
	

}
	}


