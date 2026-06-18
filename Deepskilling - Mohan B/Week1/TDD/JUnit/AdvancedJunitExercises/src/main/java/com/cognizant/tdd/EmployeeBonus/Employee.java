package com.cognizant.tdd.EmployeeBonus;
import java.time.LocalDate;

public class Employee {
	private int emp_id;
	private String e_name;
	private LocalDate doj;
	private boolean displinaryAction;
	private String designation;
	private String dept;
	private int rating;
	public Employee() {
		
	}
	public Employee(int emp_id, String e_name, LocalDate doj, boolean displinaryAction, String designation,
			String dept, int rating) {
		super();
		this.emp_id = emp_id;
		this.e_name = e_name;
		this.doj = doj;
		this.displinaryAction = displinaryAction;
		this.designation = designation;
		this.dept = dept;
		this.rating = rating;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getE_name() {
		return e_name;
	}
	public void setE_name(String e_name) {
		this.e_name = e_name;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public boolean isDisplinaryAction() {
		return displinaryAction;
	}
	public void setDisplinaryAction(boolean displinaryAction) {
		this.displinaryAction = displinaryAction;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
	
}
