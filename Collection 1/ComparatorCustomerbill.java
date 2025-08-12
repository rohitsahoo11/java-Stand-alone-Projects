package com.collection.assignment1;

import java.util.Comparator;

public class ComparatorCustomerbill implements Comparator<Customer>{
	@Override
	public int compare(Customer c1, Customer c2) {
		return Double.compare(c1.getCustomerBill(), c2.getCustomerBill());
	}
}	
