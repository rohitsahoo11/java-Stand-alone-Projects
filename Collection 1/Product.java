package com.collection.assignment1;

public class Product implements Comparable<Product>{
	private int productNumber;
	private String productName;
	private double productPrice;
	
	public Product(int productNumber, String productName, double productPrice) {
		super();
		this.productNumber = productNumber;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	
	@Override
	public int compareTo(Product p) {
		return this.productName.compareTo(p.productName);
	}

	@Override
	public String toString() {
		return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice="
				+ productPrice + "]";
	}
	
	
	
	
	
}
