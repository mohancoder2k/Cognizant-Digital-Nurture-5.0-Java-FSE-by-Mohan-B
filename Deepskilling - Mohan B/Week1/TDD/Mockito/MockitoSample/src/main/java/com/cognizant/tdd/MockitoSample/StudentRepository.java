package com.cognizant.tdd.MockitoSample;

import java.util.List;

public interface StudentRepository {
	Student findStudentById(long sid);
	List<Student> findAll();
	boolean saveStudent(Student stud);
}
