package com.javaex.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, Integer> map = new Hashtable<>();
		
		// 키, 값의 쌍으로 저장
		// 맵에 데이터 보관
		map.put("SOCCER",11);
		map.put("BASEBALL", 9);
		map.put("VOLLEYBALL", 6);
		
		System.out.println(map);
		// 키는 HashSet : 키는 중복할 수 없고 순서가 없다.
		map.put("VOLLEYBALL", 12);
		System.out.println(map);
		
		// 키 포함여부
		System.out.println("SOCCCER 키가 있는가? " + map.containsKey("SOCCER"));
		// 값 포함여부
		System.out.println("값에 9가 있는가? " + map.containsValue(9));
		
		// Iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.printf("Key %s => value %d%n",key, map.get(key));
		}
		
		// 맵 비우기
		map.clear();
		System.out.println(map);

	}

}
