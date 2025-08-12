package com.collection.assignment1;

import java.util.ArrayList;
import java.util.Collections;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customer = new ArrayList<Customer>();
		
		customer.add(new Customer(111, "Rohit", 3432));
		customer.add(new Customer(555, "Swastik", 2311));
		customer.add(new Customer(333, "Azad", 5443));
		customer.add(new Customer(222, "Deepak", 4000));
		customer.add(new Customer(444, "Krish", 2000));
		
		System.out.println("-------------Id----------------");
		Collections.sort(customer, new ComparatorCustomerNumber());
		customer.forEach(System.out::println);
		
		System.out.println("-------------name----------------");
		Collections.sort(customer, new ComparatorCustomerName());
		customer.forEach(System.out::println);
		System.out.println("-------------bill----------------");
		Collections.sort(customer, new ComparatorCustomerbill());
		customer.forEach(System.out::println);
	}

}
