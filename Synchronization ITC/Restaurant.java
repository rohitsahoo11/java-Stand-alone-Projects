package com.rohit.assignment52_itc;

public class Restaurant{
	
	private String name;
	private String order;
	private boolean isOrderReady = false;
	
	public Restaurant(String name) {
		super();
		this.name = name;
		
	}
	
	
	public synchronized void placeOrder(String order) {
		this.order = order;
		
		
			try {
				while(!isOrderReady) {
					wait();
				}
				System.out.println("Chef: "+order+" is ready!");
			}
			catch(Exception e) {
				System.err.println(e);
			}
		
		if(isOrderReady) {
			System.out.println("Waiter: Serving the "+order);
			System.out.println("Khale thus thus ke");
		}
		
	}
	
	public synchronized void prepareOrder() {
		try {
			Thread.sleep(2000);
		}
		catch(InterruptedException e) {
			System.err.println(e);
		}
		this.isOrderReady = true;
		notify();
	}


	public String getRestaurantName() {
		return name;
	}


	public String getOrder() {
		return order;
	}
	
	
	
}
