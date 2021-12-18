package com.javaexam1216;

import java.util.HashSet;
import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Product> productSet = new HashSet<>();
		Scanner scanner = new Scanner(System.in);
		int count=0;	

		Product p1 = new Product("p100","TV","20000");
		Product p2 = new Product("p200","Computer","10000");
		Product p3 = new Product("p300","Audio","1000");
		Product p4 = new Product("p100","TV","20000");
		
		p1.addData(productSet);
		p2.addData(productSet);
		p3.addData(productSet);
		p4.addData(productSet);
		
		System.out.println("제품 ID\t제품명\t가격");
		System.out.println("--------------------------");	
		
		for(Product product : productSet) {
			System.out.println(product.getProductId() + "\t"
					+ product.getProductName() + "\t"
					+ product.getProducPrice() + "\t");
		}
		
		
		
		


		
		
	}

}
