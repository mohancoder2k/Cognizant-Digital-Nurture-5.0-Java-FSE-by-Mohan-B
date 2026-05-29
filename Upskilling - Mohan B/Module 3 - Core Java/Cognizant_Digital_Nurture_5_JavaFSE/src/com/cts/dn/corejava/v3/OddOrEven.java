package com.cts.dn.corejava.v3;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number  : ");
		int n1 = sc.nextInt();
		System.out.println("Entered number " + n1 + " is " + checkOddOrEven(n1));
		
	}
	public static String checkOddOrEven(int num) {
		return (num%2==0) ? "Even" : "Odd";
	}
}
