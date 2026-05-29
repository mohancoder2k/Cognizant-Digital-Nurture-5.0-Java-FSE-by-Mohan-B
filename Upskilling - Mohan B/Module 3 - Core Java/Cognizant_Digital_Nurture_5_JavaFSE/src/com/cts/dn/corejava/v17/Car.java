package com.cts.dn.corejava.v17;

public class Car {
	String make; // manufacturer
	String model;
	long year;
	
	Car(){
		System.out.println("At default constructor");
	}

	public Car(String make, String model, long year) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
	}
	public void displayDetail() {
		System.out.println("Manufacturer : " + make);
		System.out.println("Model : " + model);
		System.out.println("Year of Manufacturing : " + year);
	}
	
}
