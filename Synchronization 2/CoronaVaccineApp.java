package com.rohit.assignment53;

public class CoronaVaccineApp {

	public static void main(String[] args) throws InterruptedException {
		
		User u1 = new User("Ohit", 23, false);
		User u2 = new User("Bohit", 17, false);
		
		u1.isEligible();
		try {
			u1.bookDose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		//u2.isEligible();
		
		try {
			u2.bookDose();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		Thread t1 = new Thread(u1);
		
		Thread t2 = new Thread(u2);
		
		t1.start();
		t1.join();
		t2.start();
	}

}
