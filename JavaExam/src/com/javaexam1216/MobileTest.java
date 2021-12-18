package com.javaexam1216;

public class MobileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ltab moblie1 = new Ltab("Ltab",500,"ABC-01");
		Otab moblie2 = new Otab("Otab",1000,"XYZ-20");
		
		
		printShort();
		printMoblie(moblie1);
		printMoblie(moblie2);
		
		System.out.println();
		System.out.println("[ 10분 충전]");
		moblie1.charge(10);
		moblie2.charge(10);
		
		printShort();
		printMoblie(moblie1);
		printMoblie(moblie2);
		
		System.out.println();
		System.out.println("[ 5분 통화]");
		moblie1.operate(5);;
		moblie2.operate(5);
		
		printShort();
		printMoblie(moblie1);
		printMoblie(moblie2);
		
	}
	
	public static void printMoblie(Mobile mobile) {
		System.out.println(mobile.mobileName + "\t" + mobile.batterySize + "\t"
				+ mobile.osType + "\t");
		
	}
	public static void printShort() {
		System.out.println("Mobile\tBattery\tOS");
		System.out.println("------------------------------");
	}

}
