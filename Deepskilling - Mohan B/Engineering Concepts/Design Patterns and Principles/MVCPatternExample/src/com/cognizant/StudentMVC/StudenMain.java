package com.cognizant.StudentMVC;

public class StudenMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating the Model
		Student s1 = new Student();
		s1.setName("Mohan Sarady");
		s1.setId(102);
		s1.setGrade("S");
		// creating the view
		StudentView v1 = new StudentView();
		// Calling the controller
		StudentController sc = new StudentController(s1, v1);
		sc.printView();
	}

}
