package com.cts.dn.corejava.v04;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Year : ");
		long yr = sc.nextLong();
		System.out.println("was " + yr + " leap year  ? : " + isLeap(yr)  );
		sc.close();
	}
	public static boolean isLeap(long num) {
	    if (num % 4 == 0) {
	        if (num % 100 == 0) {
	            if (num % 400 == 0) {
	                return true; 
	            } else {
	                return false; 
	            }
	        } else {
	            return true; 
	        }
	    } else {
	        return false;
	    }
	
	}}
