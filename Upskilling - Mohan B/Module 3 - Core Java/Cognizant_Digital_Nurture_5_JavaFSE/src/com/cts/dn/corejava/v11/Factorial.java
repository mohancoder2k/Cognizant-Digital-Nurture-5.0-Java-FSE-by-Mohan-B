package com.cts.dn.corejava.v11;

import java.util.Scanner;

public class Factorial {
	   @SuppressWarnings("resource")
	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("Enter a Number to find factorial  : ");
		   int num = sc.nextInt();
		   int fact = 1;
		   if (num == 1) {
			   System.out.println("Factorial is : " + fact);
			   return;
		   }
		   for(int i=2; i<=num; i++) {
			   fact *= i;
		   }
		   System.out.println("Factorial is : " + fact);
		   sc.close();
	   }
}
