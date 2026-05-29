package com.cts.dn.corejava.v09;

import java.util.Scanner;

public class GradeCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Mark : ");
		int mark = sc.nextInt();
		char grade = 'F';
		if(mark >= 90 && mark <= 100) grade = 'A';
		else if(mark >= 80 && mark <= 89) grade = 'B';
		else if(mark >= 70 && mark <= 79) grade = 'C';
		else if(mark >= 60 && mark <= 69) grade = 'D';
		else grade = 'F';
		System.out.println("Grade of the student : " + grade);
		sc.close();
	}
}
/*
 * Task: Assign grades based on marks entered by the user. • Instructions: o
 * Prompt the user for marks out of 100. o Use if-else statements to assign
 * grades: ▪ 90-100: A ▪ 80-89: B ▪ 70-79: C ▪ 60-69: D ▪ Below 60: F o Display
 * the assigned grade.
 */