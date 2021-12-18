package com.javaexam1216;

public class PlaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Plane[] planeArray = new Plane[2];
		planeArray[0] = new AirPlane("L747",1000);
		planeArray[1] = new CargoPlane("C40",1000);
		
		
		printShort();
		for(Plane plane : planeArray) {
			System.out.println(plane.planeName + "\t" + plane.fuelSize);
		}
		
		System.out.println();
		System.out.println("[ 100 운항]");
		printShort();
		for(Plane plane : planeArray) {
			if(plane instanceof AirPlane) {
				((AirPlane)plane).flight(100);
			}
			else if(plane instanceof CargoPlane) {
				((CargoPlane)plane).flight(100);
			}
			System.out.println(plane.planeName + "\t" + plane.fuelSize);
		}
		
		System.out.println();
		printShort();
		System.out.println("[ 200 주유]");
		
		for(Plane plane : planeArray) {
			plane.refuel(200);
			System.out.println(plane.planeName + "\t" + plane.fuelSize);
		}
		
	}
	
	public static void printShort() {
		System.out.println("Plane\tfuelSize");
		System.out.println("----------------------");
	}


}
