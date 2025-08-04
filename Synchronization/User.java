package com.rohit.assignment53;

public class User extends Thread {
	private String name;
	private VaccineEligibility vaccineEligibility;
	private DoseBooking doseBooking;
	
	public User(String name, int age, boolean hasHealthCondition) {
		super();
		this.name = name;
		this.vaccineEligibility = new VaccineEligibility(age, hasHealthCondition);
		this.doseBooking = new DoseBooking();
	}
	
	public boolean isEligible() {
		
		return vaccineEligibility.isEligible();
	}
	
	
	public void bookDose() throws Exception {
		if(isEligible()) {
			
			doseBooking.bookDose();
			System.out.println(this.name+" You are Eligible for the vaccine.");
		}
		else {
			throw new RuntimeException(this.name+" You are not eligible for the vaccine.");
		}
	}
	
	public boolean isDoseBooked() {
		return doseBooking.isDoseBooked();
	}
	
}
