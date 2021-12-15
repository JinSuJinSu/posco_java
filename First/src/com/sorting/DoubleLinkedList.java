package com.sorting;

public class DoubleLinkedList {
	
	private Node head; 
	private Node tail;
	private int size;

	
	// 맨앞에 노드 추가
	public void addFirst(Object data){ 
		Node newNode = new Node(data); 
		if (head != null) { 
			// 기존 노드가 있음 
			newNode.next = head;  // 새로운 노드 옆을 head로 링크시킨다.
			head.prev = newNode;  // head 앞을 NewNode로 링크시킨다.
		}
		head = newNode; // 해드를 새로 생성된 노드로 대체시킨다.
		if(head.next==null) {
			tail=head; 
		}
		size++;
	}
	
	// 맨뒤에 노드 추가
		public void addLast(Object data) {
			if(size==0) {
				addFirst(data); // 비어 있으면 first를 써야한다.
			}
			else {
				Node newNode = new Node(data);
				tail.next = newNode; // tail 옆에 next를 설정해준다.
				newNode.prev = tail; // 이중연결리스트이므로 next 이후 prev로 tail을 한번더 설정해줘야 한다.
				tail = newNode; // tail에 새로 생성된 노드를 저장시킨다.
				size++;		
			}
		}
		
	// 중간에 노드 추가
	public void add(int index, Object data){
		if (index == 0) { 
			addFirst(data); 
			} 
		else if (index == size - 1) { 
			addLast(data); 
			} 
		else { 
			Node newNode = new Node(data); 
			Node prevNode = getNode(index - 1);
			Node nextNode = prevNode.next; // 추가된 노드의 전후 설정 
			newNode.prev = prevNode; 
			newNode.next = nextNode; // 이전 노드의 전후 설정 
			prevNode.next = newNode; // 다음 노드의 전후 설정 
			nextNode.prev = newNode; 
			size++; 
			} 
		}
	
	// 특정 위치의 노드 index 얻기
	public Node getNode(int index) { 
		if (index < size / 2) { 
			Node node = head; 
			for (int i = 0; i < index; i++) { 
				node = node.next; 
			} 
			return node; 
			} 
		else { 
			Node node = tail; 
			for (int i = size - 1; i > index; i--) { 
				node = node.prev; 
			} 
			return node; 
			} 
		}
		
	//맨 앞에 있는 노드 제거
	public Object removeFirst() { 
		if(size == 0) { 
			return null; 
		}
		
		Node removeNode = head; 
		head = null; 
		head = removeNode.next;
		head.prev = null; 
		size--; 
		return removeNode.data; 
		
		}
	
	//맨 뒤에 있는 노드 제거
	public Object removeLast() { 
		if(size == 0) { 
			return null; 
		} 
		
		Node removeNode = tail; 
		tail = null;
		tail = removeNode.prev;
		tail.next = null; 
		size--; 
		return removeNode.data; 
		
		}
	
	
	// 중간에 있는 노드 제거
		public Object remove(int index) { 
			if(size == 0) { 
				return null; 
			} 
			if(index == 0) { 
				return removeFirst(); 
			}
			else if(index == size-1) {
				return removeLast(); 
			}
			else { 
				Node removeNode = getNode(index); 
				Node prevNode = removeNode.prev; 
				Node nextNode = removeNode.next; // 이전 노드 전후 설정 
				prevNode.next = nextNode; // 다음 노드 전후 설정 
				nextNode.prev = prevNode; 
				size--;
				return removeNode.data;
			} 
		}
		
		
	// 정보 출력
	public String toString() { 
		StringBuffer result = new StringBuffer("[");
		if (size != 0) { 
			Node node = head; 
			result.append(node.data); 
			while (node.next != null) { 
				node = node.next;
				result.append(", ");
				result.append(node.data); 
				} 
			}
		result.append("]"); 
		return result.toString(); 
		}
	
  
	
}
