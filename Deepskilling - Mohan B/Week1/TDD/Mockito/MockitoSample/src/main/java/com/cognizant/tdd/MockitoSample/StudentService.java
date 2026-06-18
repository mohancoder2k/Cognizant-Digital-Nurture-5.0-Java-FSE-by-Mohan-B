package com.cognizant.tdd.MockitoSample;

import java.util.List;

public class StudentService {
	private StudentRepository sr;

	public StudentService(StudentRepository sr) {
		this.sr = sr;
	}
	
	public List<Student> getAllStudentsList(){
		return sr.findAll();
	}
	public Student getStudentDepartment(long sid) {
        Student student = sr.findStudentById(sid);
        
        if (student != null) {
            return student;
        }
        return null; 
    }
	public boolean registerStudent(Student stud) {
		return sr.saveStudent(stud);
	}
}
