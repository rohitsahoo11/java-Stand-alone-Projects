package com.rohit.assignment50_synchronization;

public class PetrolPump {
	
	public synchronized void refillCar(String carName) {
		System.out.println(carName+" started refilling....");
		
		
			 try {
				 Thread.sleep(3000);
			 }
			 catch(Exception e) {
				 System.out.println(e);
			 }
		
		
		
		System.out.println(carName+" completed refilling!..");
	}
}
