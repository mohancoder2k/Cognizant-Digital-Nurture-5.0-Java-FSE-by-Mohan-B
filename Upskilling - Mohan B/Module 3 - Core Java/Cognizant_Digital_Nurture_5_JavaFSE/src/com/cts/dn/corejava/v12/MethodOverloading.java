package com.cts.dn.corejava.v12;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10,57));
		System.out.println(add(45.53, 34.21));
		System.out.println(add(10,20,45));
	}
	public static int add(int n1, int n2) {
		return n1 + n2;
	}
	public static double add(double n1, double n2 ) {
			return n1+n2;
		}
	public static int add(int n1, int n2, int n3) {
		return n1+n2+n3;
	}
}
/*
 * Task: Create multiple methods with the same name but different parameters. •
 * Instructions: o Define methods named add that accept: ▪ Two integers. ▪ Two
 * doubles. ▪ Three integers. o Each method should return the sum of its
 * parameters. o Call each method and display the results.
 */