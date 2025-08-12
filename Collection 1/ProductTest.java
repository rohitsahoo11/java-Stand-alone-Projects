package com.collection.assignment1;
import java.util.*;
public class ProductTest {
	public static void main(String[] args) {
		ArrayList<Product> product = new ArrayList<>();
		
		product.add(new Product(111, "Walkman", 23333));
		product.add(new Product(333, "Mobile", 87673));
		product.add(new Product(222, "Laptop", 12322));
		product.add(new Product(555, "Desktop", 87656));
		product.add(new Product(444, "Tv", 908767));
		
		Collections.sort(product);
		product.forEach(System.out::println);
		
	}
}
