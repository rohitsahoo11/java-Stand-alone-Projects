package com.rohit.assignment50_synchronization;

public class PetrolPumpSimulation {

	public static void main(String[] args) throws InterruptedException{
		
		PetrolPump pp = new PetrolPump();
		
		Car []c = new Car[5];
		c[0] = new Car("Ford",pp);
		c[1] = new Car("Lambo",pp);
		c[2] = new Car("Ferarri",pp);
		c[3] = new Car("Mahindra",pp);
		c[4] = new Car("Tata",pp);
		
		
		for(Car i:c) {
			Thread t = new Thread(i);
			t.start();
			t.join();
			
		}

	}

}
