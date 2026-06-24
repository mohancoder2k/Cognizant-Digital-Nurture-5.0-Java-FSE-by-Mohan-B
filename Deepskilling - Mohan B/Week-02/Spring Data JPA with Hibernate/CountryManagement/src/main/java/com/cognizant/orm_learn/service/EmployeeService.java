package com.cognizant.orm_learn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.orm_learn.DTOs.EmployeeDTO;
import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.repository.EmployeeRepository;

import jakarta.transaction.Transactional;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository emp_repo;
	
	public void saveEmployee(Employee emp) {
		emp_repo.save(emp);
	}
	@Transactional
	public EmployeeDTO getEmployeeById(int e_id) {
		Employee emp = emp_repo.findById(e_id);
		EmployeeDTO res = EmployeeDTO.builder()
				.id(emp.getId())
				.name(emp.getName())
				.salary(emp.getSalary())
				.departmentName(emp.getDepartment().getName())
				.build();
		return res;
	}
}
