package com.javaexam1216;

import java.util.HashSet;

public class Product {
	
	private String productId;
	private String productName;
	private String producPrice;
	
	public Product(String productId, String productName, String producPrice) {
		this.productId = productId;
		this.productName = productName;
		this.producPrice = producPrice;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProducPrice() {
		return producPrice;
	}

	public void setProducPrice(String producPrice) {
		this.producPrice = producPrice;
	}
	
	public void addData(HashSet<Product> productSet) {
		int count=0;
		for(Product product : productSet) {
			if(product.getProductId().equals(this.getProductId())) {
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
			count++;
			break;
		}
	}
	if(count==0) { // 중복되어 있는 ID의 제품이 없다.
		System.out.println("성공적으로 저장되었습니다.");
		productSet.add(this);
	}
			
		}
		
	}
	
