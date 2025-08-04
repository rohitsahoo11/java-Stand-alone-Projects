package com.rohit.assignment53;

public class VaccineEligibility {
	
	private int age;
	private boolean hasHealthCondition;
	
	public VaccineEligibility(int age, boolean hasHealthCondition) {
		super();
		this.age = age;
		this.hasHealthCondition = hasHealthCondition;
	}
	
	public boolean isEligible() {
		if(age >= 18 && age <= 60 && hasHealthCondition == false) {
			//System.out.println("You are Eligible..");
			return true;
		}
		else {
			//System.out.println("You are not Eligible..");
			return false;
		}
	}
}
