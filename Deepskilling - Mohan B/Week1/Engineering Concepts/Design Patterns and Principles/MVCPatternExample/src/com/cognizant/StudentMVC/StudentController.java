package com.cognizant.StudentMVC;

public class StudentController {
	private Student model;
	private StudentView view;
	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void setStudentName(String name) {
		model.setName(name);
	}
	public void setGrade(String grade) {
		model.setGrade(grade);
	}
	public void setId(long id) {
		model.setId(id);
	}
	public String getStudentName() {
		return model.getName();
	}
	public String getStuGrade() {
		return model.getGrade();
	}
	public long getStudId() {
		return model.getId();
	}
	public void printView() {
		view.displayStudentDetails(getStudentName(), getStudId(), getStuGrade());
	}
}
