package com.cts.dn.corejava.v17;

import java.util.Scanner;

public class CarMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Manufacturer, Model, year");
		String make = sc.next();
		System.out.println("Hello");
		String model = sc.next();
		long year = sc.nextLong();
		Car c1 = new Car(make, model, year);
		c1.displayDetail();
		sc.close();
	}

}
