package com.javaexam1211;

public class ProducetApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] productList = new Product[5];
		
		Product p1 = new Product();
		Product p2 = new Product("재갈량인형",4,4000);
		Product p3 = new Product("메탈인형",3,3000);
		Product p4 = new Product("강철인형",2,2000);
		Product p5 = new Product("철강인형",1,1000);
		
		productList[0]=p1;
		productList[1]=p2;
		productList[2]=p3;
		productList[3]=p4;
		productList[4]=p5;
		
		printInformation(productList);

	}
	
	 public static void printInformation(Product[] productList) {
		System.out.println("상품명\t재고량\t가격");
		for(Product product : productList) {
			System.out.println(product.getName() + "\t" + product.getBalance() + "\t" + 
		product.getPrice());
		}
	}

}
