package com.cts.dn.corejava.v21;

import java.util.Scanner;

public class AgeEligiblityApplication {

	public static void main(String[] args) throws InvalidAgeException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Applicant Age : ");
		int age = sc.nextInt();
		System.out.println("ELIGIBLE or NOT : " + isEligible(age));
		sc.close();
	}
	public static String isEligible(int age) throws InvalidAgeException {
		if(age < 18) {
			throw new InvalidAgeException("Not eligible to vote");
		}else {
			return "Eligible";
		}
	}
}
/*
 * Objective: Create and use custom exceptions. • Task: Define a custom
 * exception InvalidAgeException. • Instructions: o Throw InvalidAgeException if
 * the user's age is less than 18. o Catch the exception and display a message.
 */



