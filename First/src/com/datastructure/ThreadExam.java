package com.datastructure;

public class ThreadExam implements Runnable{//extends Thread{
	
	private int[] arr;
	
	public ThreadExam() {
		arr = new int[4];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
	}
	
	@Override
	public void run() {
		
		for(int i=0; i<arr.length; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread() + " " + arr[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExam te = new ThreadExam(); // 쓰레드 생성
//		te.start(); // runnable 상태
		Thread th = new Thread(te);
		th.start();

	}

}
