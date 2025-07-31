package com.rohit.assignment52_itc;

public class Chef extends Thread{
	
	private Restaurant restaurant;

	public Chef(Restaurant restaurant) {
		super();
		this.restaurant = restaurant;
	}
	
	
	@Override
	public void run() {
		restaurant.prepareOrder();
		System.out.println("Chef: Preparing "+ restaurant.getOrder());
		//System.out.println("Chef: fried chicken is ready!");
		
	}
}
