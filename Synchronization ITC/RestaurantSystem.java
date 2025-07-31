package com.rohit.assignment52_itc;
import java.util.*;
public class RestaurantSystem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("Enter the Restaurant name: ");
//		String name = sc.next();
		
		
		
		Restaurant r = new Restaurant("Taj");
		Waiter w = new Waiter(r);
		Chef c = new Chef(r);
		
		System.out.println("Welcome to "+r.getRestaurantName()+"!!!");
		
//		System.out.print("What is your order?? ");
//		String orderName = sc.nextLine();
		w.acceptOrder("Buurgeer");
		w.start();
		c.start();
		
	}

}
