package com.sorting;


//List를 구성하는 Node 클래스


class Node{
	
	 Object data;    // 데이터 저장 변수
	 Node next;    // 다음 노드를 참조할 링크 노드
	 Node prev;    // 이전 노드를 참조할 링크 노드
	
	public Node(Object data) {
	   this.data = data;
	   this.next = null;
	}
}
