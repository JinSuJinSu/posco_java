package com.sorting;



public class LinkedList {
	
	 	private Node head;
	    private Node tail;
	    private int size;
	   

		// 맨앞에 데이터 추가
	    public void addFirst(Object data){
	        Node newNode = new Node(data); // 새로운 노드 생성

	        newNode.next = head; // 첫번째로 삽입되므로 옆에 있는 값을 기존에 있던 head로 대체한다.
	        head=newNode; // 삽입된 노드는 head가 된다.
	        size++; // 노드가 추가됬으므로 size 증가
	        
	        if(head.next == null){
	            tail = head;
	        }
	    }
	    
	    // 맨 뒤에 데이터 추가
	    public void addLast(Object data){
	        Node newNode = new Node(data); // 새로운 노드 생성

	        if(size == 0){
	            addFirst(data); // 링크드리스트가 비어있으면 노드 추가
	        }
	        else {
	            tail.next = newNode; // tail옆에 삽입되는 노드가 위치하게 된다.
	            tail = newNode; // 삽입된 노드는 tail이 된다.
	            size++; // 노드가 추가됬으므로 size 증가
	        }
            
	    }
	    
	    //중간에 데이터 추가
	    public void add(Object data, int index){

	        if(index == 0){
	            addFirst(data);
	        }

        	else{
                Node prev = getNode(index-1); // 삽입할 index 바로 전 위치의 노드를 구한다.
                Node temp = prev.next; // temp를 next로해서 정한다.
                Node newNode = new Node(data); // 새로운 노드 생성

                prev.next = newNode; // 전 위치 노드의 next 값을 새로 생성된 노드로 바꿔준다.
                newNode.next = temp; // 새로 생성된 노드의 next값은 temp로 바꿔준다.
                size++;

                if(newNode.next == null){
                    tail = newNode; // 맨 뒤에 추가될 경우 tail로 지정해준다.
                }
            }
	          
	        }
	    
	    
	    // 특정 위치에 있는 노드 값 구하기    
	    public Node getNode(int index){
	    	Node temp = head;
	    	int startIndex=0;
	        while(startIndex != index){
	        	temp = temp.next;
	        	startIndex++;
	            if(temp == null)
	                return null;
	        }
	        return temp;
	    }

		// head 노드 값 얻기
	    public Object getFirst(){
	        return head.data;
	    }

	    //tail 노드값 얻기
	    public Object getLast(){
	        return tail.data;
	    }
	    
	    // 특정 노드의 index값 구하기(링크드 리스트 특성상 head부터 시작해서 하나씩 접근하는 수 밖에 없다.
	    // arraylist랑 다르게 연결고리로 구현되어 있기 때문
	    public int indexOf(Object data){
	        Node temp = head;
	        int index = 0;
	        while(temp.data != data){
	        	temp = temp.next;
	            index++;
	            if(temp == null)
	                return -1;
	        }
	        return index;
	    }    
	    
	    // 맨 앞에 있는 노드 제거
	    public Object removeFirst(){

	        Node temp = head; // 노드에 head값 저장
	        head = head.next; // head 옆에 있는 값이 새로운 head가 된다.
	        Object data = temp.data; // data 객체에 지울 Node를 저장해준다.
	        temp = null; // head 지우기
	        size--; // 사이즈 감소
	        return data;
	    }
	    
	    // 맨뒤에 있는 노드 제거
	    public Object removeLast(){
	    	return remove(size-1);
	    	}
	    
	    // 중간에 있는 노드 제거
	    public Object remove(int index){
	    	
	        if(index == 0){
	            return removeFirst();
	        }
	        
	        Node prev = getNode(index-1); // 이전 노드의 위치를 구한다.
	        Node temp = prev.next;
	        prev.next = prev.next.next; // 전 위치에서 next에 있는 것이 삭제될 노드

	        Object data = temp.data; // 삭제할 노드
	        if(temp == tail){
	            tail = prev;
	        }
	        size--; // 사이즈 감소

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
	        if(head == null){
	            return "[]";
	        }
	        Node temp = head;
	        String str = "["; 
	        while(temp.next != null){
	            str =str.concat(temp.data + " , "); // while문을 돌면서 순차적으로 접근
	            temp = temp.next;
	        }

	        str =str.concat(temp.data + "]");
	        return str;
	    }
	    
	    
	    
	    
}
