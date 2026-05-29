package com.cts.dn.corejava.v15;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		System.out.println("Orginal String : " + str);
		System.out.println("Reversed String : " + reverse(str));
		sc.close();
	}
	public static String reverse(String str) {
		int N = str.length();
		int st = 0;
		int end =  N - 1;
		char[] s = str.toCharArray();
		while(st < end) {
			
			char temp = s[end];
			s[end] = s[st];
			s[st] = temp;
			
			st++;
			end--;
			
		}
		return new String(s);
	}
}
