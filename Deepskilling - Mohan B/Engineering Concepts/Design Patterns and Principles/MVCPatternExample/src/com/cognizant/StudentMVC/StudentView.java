package com.cognizant.StudentMVC;

public class StudentView {
	public void displayStudentDetails(String studName, long s_id, String s_grade) {
		System.out.println("Studen Details : ");
		System.out.println("---------------------");
		System.out.println("Name : " + studName );
		System.out.println("ID : " + s_id);
		System.out.println("Grade : " + s_grade);
	}
}
