package com.collection.assignment1;

import java.util.Comparator;

public class ComparatorCustomerNumber implements Comparator<Customer>{
	@Override
	public int compare(Customer c1, Customer c2) {
		return Integer.compare(c1.getCustomerNumber(), c2.getCustomerNumber());
	}
}
