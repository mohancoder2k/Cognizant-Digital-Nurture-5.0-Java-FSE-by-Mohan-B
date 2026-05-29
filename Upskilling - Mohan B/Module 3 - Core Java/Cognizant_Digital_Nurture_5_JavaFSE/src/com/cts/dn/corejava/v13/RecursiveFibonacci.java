package com.cts.dn.corejava.v13;

import java.util.Scanner;

public class RecursiveFibonacci {
	public static void main(String[] args) {
		 // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Please enter a non-negative integer.");
        } else {
            // Call the recursive method and display the result
            long result = fibonacci(n);
            System.out.println("The Fibonacci number at position " + n + " is: " + result);
        }
        
        sc.close();
	}
	 public static long fibonacci(int n) {
	      
	        if (n <= 1) {
	            return n;
	        }
	       
	        return fibonacci(n - 1) + fibonacci(n - 2);
	    }
}
/*
 * Task: Calculate the nth Fibonacci number using recursion. • Instructions: o
 * Prompt the user for a positive integer n. o Define a recursive method
 * fibonacci(int n) that returns the nth Fibonacci number. o Display the result.
 */