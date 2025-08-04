package com.rohit.assignment53;

public class DoseBooking {
	
	private boolean booked = false;
	
	public void bookDose() throws Exception {
		if(booked == true) {
			throw new Exception("Dose already booked.");
		}
		else {
			this.booked = true;
		}
	}
	
	public boolean isDoseBooked() {
		
		if(booked) {
			return false;
		}
		else {
			return true;
		}
	}
	
	
}
