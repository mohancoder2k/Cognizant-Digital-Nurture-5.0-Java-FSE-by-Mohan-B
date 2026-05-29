package com.cts.dn.corejava.v16;

import java.util.Scanner;

public class PalindromeChecker {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		System.out.println("Orginal String : " + str);
		System.out.println("Palindrome or Not  : " + isPalin(str));
		sc.close();
	}
	public static boolean isPalin(String str) {
		int N = str.length();
		int st = 0;
		int end =  N - 1;
		char[] s = str.toCharArray();
		while(st < end) {
			
			if(s[st] != s[end]) return false;
			
			st++;
			end--;
			
		}
		return true;
	}
}
