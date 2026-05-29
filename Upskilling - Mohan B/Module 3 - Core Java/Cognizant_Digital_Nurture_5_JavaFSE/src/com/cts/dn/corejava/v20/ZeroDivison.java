package com.cts.dn.corejava.v20;

import java.util.Scanner;

public class ZeroDivison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers : ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		try {
			System.out.println("Result of N1/N2 : " + (n1/n2));
		}catch(ArithmeticException e) {
			System.out.println("Zero cannot be an divident : " + e);
		}finally {
			System.out.println("Always executes");
		}
		sc.close();
		
	}
}
