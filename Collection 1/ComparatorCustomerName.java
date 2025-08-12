package com.collection.assignment1;

import java.util.Comparator;

public class ComparatorCustomerName implements Comparator<Customer>{
	@Override
	public int compare(Customer c1, Customer c2) {
		return c1.getCustomerName().compareTo(c2.getCustomerName());
	}
}
