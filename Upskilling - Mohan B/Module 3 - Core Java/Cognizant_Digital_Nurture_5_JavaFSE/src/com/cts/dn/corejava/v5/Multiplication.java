package com.cts.dn.corejava.v5;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Task: Print the multiplication table for a number up to 10. • Instructions: o
		 * Prompt the user for a number. o Use a for loop to iterate from 1 to 10. o
		 * Multiply the input number by the loop counter and display the result
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number to get the table : ");
		int num = sc.nextInt();
		for(int i=1; i<=10; i++) {
			System.out.println(num + " x " + i + " = " + num*i);
		}
	}

}
