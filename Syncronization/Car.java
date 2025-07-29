package com.rohit.assignment50_synchronization;

public class Car implements Runnable{
	
	public String name;
	public PetrolPump petrolPump;
	
	
	
	public Car(String name, PetrolPump petrolPump) {
		super();
		this.name = name;
		this.petrolPump = petrolPump;
	}



	@Override
	public void run() {
		petrolPump.refillCar(name);
		
	}
	
}
