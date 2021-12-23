package com.javaexamfinal;

public class TVTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SaleTV tv1 = new SaleTV("SALETV-1",40,1,300000);
		RentalTV tv2 = new RentalTV("RENTALTV-10",42,1,100000);
		tv1.channelUP();
		tv1.channelUP();
		tv2.channelDown();
		tv2.channelDown();
		tv2.channelDown();
		
		printAll(tv1);
		printAll(tv2);
		printRentalTV(tv2);
		

	}
	
	public static void printAll(TV tv) {
		if(tv instanceof SaleTV) {
			System.out.println(((SaleTV)tv).toString());
			((SaleTV)tv).play();
			((SaleTV)tv).sale();
			
		}
		else if(tv instanceof RentalTV) {
			System.out.println(((RentalTV)tv).toString());
			((RentalTV)tv).play();
		}
		
	}
	
	static void printRentalTV(Rentable tv) {
		tv.rent();
	}

}
