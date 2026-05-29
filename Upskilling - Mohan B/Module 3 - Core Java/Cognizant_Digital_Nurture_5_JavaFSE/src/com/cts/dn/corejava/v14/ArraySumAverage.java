package com.cts.dn.corejava.v14;

import java.util.Scanner;

public class ArraySumAverage {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int nums[] = new int[N];
		System.out.println("Enter array elements : ");
		int itr ;
		int sum  = 0;
		for(itr=0; itr<N;itr++) {
			nums[itr] += sc.nextInt();
			sum += nums[itr];
		}
		System.out.println("Sum : " + sum);
		System.out.println("Average : " + (double)(sum/N));
		sc.close();
	}
}
