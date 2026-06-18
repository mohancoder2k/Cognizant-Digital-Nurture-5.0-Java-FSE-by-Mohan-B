package com.cognizant.tdd.MockitoSample;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class MyServiceTest {
	
	@Mock
	private StudentRepository sr;
	
	@InjectMocks
	private StudentService ss;
	
	@Test
	void shouldReturnStudentForExistingId() {
		// Arrange
		Student stud = new Student(2L, "Mohan Sarady", "CSE");
		
		// Stubbing
		when(sr.findStudentById(anyLong())).thenReturn(stud);
		
		// Act
		Student res = ss.getStudentDepartment(10L);
		
		// Assert
		assertEquals(stud, res);
	}
	
	@Test
	void shouldReturnTrueWhenStudentRegistered() {
		// Arrange
		Student dum = new Student(102L, "Mohan", "CSE");
		
		// Stubbing
		when(sr.saveStudent(any(Student.class))).thenReturn(true);
		
		// Act
		boolean res = ss.registerStudent(dum);
		
		// Assert 
		assertTrue(res); 
		
	}
}