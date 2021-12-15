package com.sorting;

import java.util.Arrays;

public class BinarySearch {
	
	// 이진탐색트리에 필요한 Node 클래스를 생성한다.
	public class Node {
		
		// 필드 생성하기
		int data;
		Node left;
		Node right;
		
		// 생성자
		Node(int data){
			this.data = data;
		}
	}
	
	Node root;
	// 이진탐색트리 root를 생성한다. 배열의 가운데 인덱스에 있는 값을 root로 정한다.
	// Node 필드값이 아니라 BinarySearch필드 값이니 생성할 떄 주의할것
	int[] array;
	
	void makeTree(int[] array) {
		// 배열을 이진트리 형태로 만들어주기 위한 메소드
		root = makeTreeRe(array,0,array.length-1);
	}
	
	Node makeTreeRe(int[] array, int start, int end) { 
		
		if(start>end) { // 시작점이 끝점보다 크면 안된다.
			return null;
		}
		int middle = (start+end)/2; // 중간부터 접근한다.
		Node current = new Node(array[middle]); // 새로운 노드를 생성한다.
		current.left = makeTreeRe(array,start,middle-1); // 왼쪽 기준으로 중간점을 정하고 새로운 노드 생성
		current.right = makeTreeRe(array,middle+1,end); // 오른쪽 기준으로 중간점을 정하고 새로운 노드 생성
		return current;	// 재귀함수로 반복적으로 생성된 노드들을 루트부터 시작해서 계속 연결시킨다.
	}
	
	// 탐색 연산
	void searchBST(Node current, int data) {
		if(current==null) {// 데이터가 존재하지 않을 때
			System.out.println("현재 트리에 찾는 값이 없습니다.");
		}
		else if(current.data==data) { // 현재 데이터와 찾고자 하는 값이 일치할 때
			System.out.println("트리 탐색 완료 : " + data);
		}
		else if(current.data>data) { // 찾고자 하는 값이 현재 데이터보다 작을 때
			System.out.println(current.data + "보다 작습니다.");
			searchBST(current.left, data);
		}
		else{ 
			// 찾고자 하는 값이 현재 데이터보다 클 때
			System.out.println(current.data + "보다 큽니다.");
			searchBST(current.right, data);	
		}
	}
	//삽입연산
	public void insertBST(int inserteData){
		//삽입할 노드 생성
		Node node = new Node(inserteData);
		
		//트리가 없으면 삽입할 노드를 루트로 만듬
		if(root == null){
			root = node;
			return ;
		}
		//current는 비교할 노드, parent는 current의 상위 노드
		Node current = root;
		Node parent = null;
		
		while(true){
			parent = current;
			//삽입할 값이 비교할 노드보다 작으면 왼쪽으로 탐색
			if(inserteData < current.data){
				current = current.left;
				//왼쪽 자식 노드가 없으면 그자리에 삽입
				if(current == null){
					parent.left = node;
					return ;
				}
			}
			//삽입할 값이 비교할 노드보다 크면 오른쪽으로 탐색
			else{
				current = current.right;
				//오른쪽 자식 노드가 없으면 그자리에 삽입
				if(current == null){
					parent.right = node;
					return ;
				}
			}
		}
	}
	
	 //삭제연산
 	boolean deleteBST(int deleteData){
 		//현재위치로부터의 루트 노드
 		Node parent = root;
 		//현재위치
 		Node current = root;
 		//왼쪽 자식과 값이 일치하는지 확인하는 flag
 		boolean isLeftChild = false;
 		//while문의 조건부의 뜻은 전체 노드에서 deleteData 값을 찾을때까지
 		//탐색하는것인데 트리 전체에서 deleteData 값이 없더라도 while은 돌게 되어있음.
 		
 		while(current.data != deleteData){
 			parent = current;
 			if(current.data > deleteData){
 				isLeftChild = true;
 				current = current.left; // 부모값보다 작으면 이진트리 원리로 왼쪽 아래로 이동한다.
 			}else{
 				isLeftChild = false; // 부모값보다 크면 이진트리 원리로 오른쪽 아래로 이동한다.
 				current = current.right;
 			} 
 			//current가 null이면 트리 전체에서 deleteData 의 값이 없는것임.
 			if(current == null){
 				System.out.println("트리가 존재하지 않습니다.");
 				return false;
 			}
 		}
 		/// 여기까지 while이 돌고나면 deleteData의 위치를 찾음.
 		
 		
 		//1. 자식노드가 없는 경우(단말노드)
 		if((current.left == null) && (current.right == null)){
 			// deleteData와 같은 값을 가지는 노드가 루트이고 자식이없다면 루트 삭제 
 			if(current == root){
 				root = null;
 			}
 			//단말노드와의 연결을 끊음
 			if(isLeftChild){
 				parent.left = null;
 			}else{
 				parent.right = null;
 			}
 		}
 		
 		//2. 하나의 자식을 갖는 경우
 		//왼쪽자식을 가지는경우
 		else if(current.right == null){
 			if(current == root){
 				root = current.left;
 			}else if(isLeftChild){
 				parent.left = current.left;
 			}else{
 				parent.right = current.left;
 			}
 		}
 		//오른쪽 자식을 가지는 경우
 		else if(current.left == null){
 			if(current == root){
 				root = current.right;
 			}else if(isLeftChild){
 				parent.left = current.right;
 			}else{
 				parent.right = current.right;
 			}
 		}
 		
 		//3. 두개의 자식을 갖는 경우
 		else if(current.left != null && current.right != null){
 			// 오른쪽 서브트리의 최소값을 찾음
 			Node successor = getSuccessor(current);
 			if(current == root){
 				root = successor;
 			}else if(isLeftChild){
 				parent.left = successor;
 			}else{
 				parent.right = successor;
 			}
 			
 			successor.left = current.left;
 		}
 		return true;
 	}
 	
 	//후임자를 구하는 함수 //오른쪽 서브트리의 최소값(오른쪽 서브트리의 왼쪽값)
 	public Node getSuccessor(Node deleteNode){
 		Node successor = null;
 		Node successorParent = null;
 		Node current = deleteNode.right;
 		
 		while(current != null){
 			successorParent = successor;
 			successor = current;
 			//왼쪽 서브트리를 타고 내려감
 			current = current.left;
 		}
 		if(successor != deleteNode.right){
 			successorParent.left = successor.right;
 			successor.right = deleteNode.right;
 		}
 		return successor;
 	}
	
	// 퀵정렬 메소드
    int[] quickSort(int[] array,int start, int end) {
        int part=partition(array,start,end);
        
        if(start<part-1) {
        	quickSort(array,start,part-1); // 초기 피벗을 기준으로 왼쪽에서 퀵정렬을 다시 해준다.
        }
        
        if(end>part) {
        	quickSort(array,part,end);
        // 초기 피벗을 기준으로 오른쪽에서 퀵정렬을 다시 해준다.
    }
        
        return array;
    }
   
    // 퀵정렬에 필요한 값 비교 메소드
   int partition(int[] array,int start,int end) {
        int pivot=array[(start+end)/2]; // 중간에 피벗을 잡는게 일반적인 방법
        
        while(start<=end) {
            while(array[start]<pivot) {
            	start++; 
            	// 피벗에서 맨왼쪽부터 순차적으로 접근할 때 값이 피벗보다 작으면 그대로 두고
            	// 클 때 루프 탈출 후 조건을 줘야된다.
            }
            while(array[end]>pivot) {
            	end--;
            	// 피벗에서 맨오른쪽부터 순차적으로 접근할 때 값이 피벗보다 크면 그대로 두고
            	// 작을 때 루프 탈출 후 조건을 줘야된다.
            }
            
            if(start<=end) {
                int temp=array[start];
                array[start]=array[end];
                array[end]=temp;
                // 값을 교체시킨다.               
                start++;
                end--;
            }
        }       
        return start;
    }
   
  
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub			
		BinarySearch bst = new BinarySearch();
		int[] array = new int[]{1,3,17,7,9,13,11,15,5};
		int[] quickSortedArray =bst.quickSort(array, 0, array.length-1);
		bst.makeTree(quickSortedArray);
		bst.searchBST(bst.root,17);
		bst.insertBST(16);
		bst.searchBST(bst.root,4);
		bst.insertBST(16);
		bst.searchBST(bst.root,4);
	}

}
