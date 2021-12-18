package com.javaexam1209;

import java.util.ArrayList;

public class LottoMachine1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		[ 실습 ] 자바의 제어문 ~ 기본 배열
//
//		1. LottoMachine1 이라는 클래스를  생성한다.
//		2. 1부터 45 사이의 6개를 추출하여 다음 형식으로 출력한다.
//		    단, 6개 숫자는 중복을 허용하지 않는다.
//
//		    [ 출력형식 ]
//
//		    오늘의 로또 번호 - x, x, x, x, x, x
//
//		6개의 배열을 갖는 원소를 만들기
//		int a1[] = new int[6];
//
//		random[i] = (int)(Math.random()*46)+1;
//
//		1. 난수추출
//		2. 체크하기
//		3. 넣기 또는 넣지 않고 다음 반복으로 
		
		ArrayList<Integer> lottoeList = new ArrayList<>();
		
		int num;
		// 모든 로또 번호를 담을때까지 반복
		while(lottoeList.size()!=6) {
			num = (int)(Math.random()*45)+1;
			if(!lottoeList.contains(num)) {
				lottoeList.add(num);
			}
			else {
				continue;
			}
			
		}
		System.out.print("오늘의 로또 번호 - ");
		for(int i=0; i<lottoeList.size(); i++) {
			if(i!=lottoeList.size()-1) {
				System.out.print(lottoeList.get(i) + ", ");
			}
			else {
				System.out.print(lottoeList.get(i));
			}
		}

	}

}
