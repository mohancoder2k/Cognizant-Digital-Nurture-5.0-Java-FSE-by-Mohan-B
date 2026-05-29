package com.cts.dn.corejava.v24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<String> students = new ArrayList<>();
			Scanner sc = new Scanner(System.in);
			students.add("Mohan");
			students.add("Tommy");
			students.add("Tiger");
			int N = sc.nextInt();
			while(N-- > 0) {
				students.add(sc.next());
			}
			System.out.println("Student Name list : ");
			for(String name : students) {
				System.out.print(name + " ");
			}
			sc.close();
	}

}


/*
 * Objective: Use dynamic arrays. • Task: Manage a list of student names. •
 * Instructions: o Create an ArrayList to store names. o Allow the user to add
 * names to the list. o Display all names entered.
 */