package com.datastructure;



class ATM implements Runnable{
	private long depositeMoney = 10000;

	@Override
	public void run() {
		 synchronized(this) {
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
				notify();
				wait();	
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			if(getDepositeMoney()<=0) {
				break;
			}
			withDraw(1000);
		}
	 }
		
	}
	
	public void withDraw(long howMuch) {
		System.out.println(Thread.currentThread().getName() + ", ");
		if(getDepositeMoney() >0) {
			depositeMoney -=howMuch;
			System.out.printf("잔액 : %,d원 %n",getDepositeMoney());
		}
		else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	
	public long getDepositeMoney() {
		return depositeMoney;
	}
}
	

public class SyncroniazedEx{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM atm = new ATM();
		Thread trd_mom = new Thread(atm,"mom");
		Thread trd_son = new Thread(atm,"son");
		trd_mom.start();
		trd_son.start();

	}
}
