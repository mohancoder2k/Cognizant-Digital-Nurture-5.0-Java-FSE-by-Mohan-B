package com.cts.dn.corejava.v02;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number 1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Number 2 : ");
		int n2 = sc.nextInt();
		System.out.println("Operations : ");
		System.out.println("1) Addition \n2) Subtraction \n3) Multiplication \n4) Division");
		System.out.println("Enter your Operation to perform : ");
		int op = sc.nextInt();
		System.out.println("Result : " + result(n1, n2, op));
		sc.close();
	}
	public static int result(int n1, int n2, int op) {
		switch(op) {
		case 1 : 
			return n1+n2;
		
		case 2:
			return n1-n2;
		case 3:
			return n1*n2;
		case 4:
			 if (n2 == 0) {
	                System.out.println("Error: Division by zero");
	                return 0; 
	            }
	            return n1 / n2;
	     default :
	    	 System.out.println("Enter the available valid operation");
	    	 return 0;
		}
	}
}
