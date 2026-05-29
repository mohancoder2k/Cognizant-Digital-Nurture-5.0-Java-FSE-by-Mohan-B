package com.cts.dn.corejava.v25;

import java.util.HashMap;
import java.util.Scanner;

public class StudentRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer> mp = new HashMap<>();
		int N = sc.nextInt();
		while(N-- > 0) {
			System.out.println("Enter Student and their ID : ");
			mp.put(sc.next(), sc.nextInt());
		}
		System.out.println("Student Details ");
		for(String name : mp.keySet()) {
			System.out.println(name + "       -      " + mp.get(name) );
		}
		sc.close();
	}

}
