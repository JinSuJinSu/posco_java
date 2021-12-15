package com.sorting;

public class CircularLinkedList {
	
 	private Node head;
    private int size;
    
	// 맨앞에 데이터 추가
    public void addFirst(Object data){
        Node newNode = new Node(data); // 새로운 노드 생성
        
        if(size==0) {
        	newNode.next = newNode; // 노드가 하나밖에 없을 경우 자기 자신을 가리킨다.
        	head = newNode;
        }
        else {
            newNode.next = head.next; // 새로 생성된 노드는 기존의 첫 노드를 가리킨다.
            head.next=newNode; // head란 새로 생성된 노드를 말한다.
        }
        size++; // 노드가 추가됬으므로 size 증가
    }
    
    // 맨 뒤에 데이터 추가
    public void addLast(Object data){
        Node newNode = new Node(data); // 새로운 노드 생성

        if(size == 0){
            addFirst(data); // 링크드리스트가 비어있으면 노드 추가
        }
        else {
        	newNode.next = head.next; 
        	head.next = newNode; 
        	head = newNode;
        }
        size++; // 노드가 추가됬으므로 size 증가
    }
    
    //중간에 데이터 추가
    public void addMiddle(Object data, int index){

        if(index == 0){
            addFirst(data);
        }
        else if(index==size) { // 마지막에 노드 추가
        	addLast(data);
        }
        else{
        	Node prev = getNode(index-1); // index-1번째 노드를 정의해준다.
        	Node temp = prev.next; // index번째 노드를 정의해준다.
        	Node newNode = new Node(data); // 새로운 노드 생성
        	prev.next = newNode; //이전 위치 노드 옆에 새로 생성된 노드 삽입
        	newNode.next = temp; // 저장된 temp를 next로 추가해준다.
           size++;
        }

}
    // 특정 위치에 있는 노드 값 구하기    
    public Node getNode(int index){
    	Node temp = head.next;
    	if(index==0) { // 첫번째 노드 반환
    		return head.next;
    	}
    	else if(index==size-1) { //마지막 노드 반환
    		return head;
    	}
    	else {
    	   	int startIndex=0;
            while(startIndex != index){
            	temp = temp.next;
            	startIndex++;
                if(temp == null)
                    return null;
            }
            return temp;
    	}
 
    }
    
    // 맨 앞에 있는 노드 제거
    public Object removeFirst(){
        Node temp = head.next; // temp는 첫번째 노드이다.
        head.next = temp.next; // 마지막 노드의 다음 필드는 첫번째 노드가 가리키는 필드가 된다.
        Object data = temp.data; // data 객체에 지울 Node를 저장해준다.
        temp = null; // head 지우기
        size--; // 사이즈 감소
        return data;
        
        
    }
    
 // 중간에 있는 노드 제거
    public Object remove(int index){
    	
        if(index == 0){
            return removeFirst();
        }
        else if(index==size-1) {
        	return removeLast();
        }
        else {
        
        Node prev = getNode(index-1); // 이전 노드의 위치를 구한다.
        Node tobeDeleted = prev.next; // 삭제할 노드를 저장시킨다.
        prev.next = prev.next.next; // 전 위치에서 next에 있는 것이 삭제될 노드

        Object data = tobeDeleted.data; // 삭제할 노드
        tobeDeleted = null; // 노드 삭제
        size--; // 사이즈 감소

        return data;
        }
    }
    
    // 맨뒤에 있는 노드 제거
    public Object removeLast(){
    	Node pre = getNode(size-2); // 마지막 이전 노드
    	Node tobeDeleted = head; // 삭제해야 하는 노드
    	pre.next = tobeDeleted.next; // 마지막 이전 노드가 첫번째 노드를 가리킴
    	head = pre; // 마지막 이전 노드가 head가 된다.
    	Object data = tobeDeleted.data; // 삭제할 노드
    	tobeDeleted = null; // 노드 삭제
    	size--;
    	return data;
	}
    
    
    // 링크드 리스트 비어있는지 확인
    public boolean isEmpty(){
        if(size == 0) {
        	return true;
        }
        else {
        	return false;
        }
                   
    }

    public int getSize(){ // 링크드리스트 사이즈
        return size;
    }

    public void clear(){ // 링크드리스트 초기화
        while(size>0){
            removeFirst();
        }
    }
    
    // 정보 출력
    public String toString(){
        if(size == 0){
            return "[]";
        }
        Node temp = head.next;
        String str = "["; 
        while(temp!=head){
            str =str.concat(temp.data + " , "); // while문을 돌면서 순차적으로 접근
            temp = temp.next;
        }

        str =str.concat(temp.data + "]");
        return str;
    }
    
    // 특정 노드의 인덱스 구하기
    public int indexOf(Object data){
        Node temp = head.next;
        int index = 0;
        while(temp.data != data){
        	temp = temp.next;
            index++;
            if(temp == head) // temp가 head라는 것은 더이상 탐색할 것이 없다는 의미이다.
                return -1;
        }
        return index;
    }   

}
