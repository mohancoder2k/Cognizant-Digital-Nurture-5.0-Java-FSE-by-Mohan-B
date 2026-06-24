package com.cognizant.orm_learn;

import java.math.BigDecimal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.orm_learn.DTOs.EmployeeDTO;
import com.cognizant.orm_learn.model.Department;
import com.cognizant.orm_learn.model.Employee;
import com.cognizant.orm_learn.service.DepartmentService;
import com.cognizant.orm_learn.service.EmployeeService;

@SpringBootApplication
public class EmployeeApplicationTest {
	private static EmployeeService emp_ser;
	private static DepartmentService dep_ser;
	public static void main(String[] args) {
		 ApplicationContext context = SpringApplication.run(EmployeeApplicationTest.class, args);
		emp_ser =context.getBean(EmployeeService.class);
		dep_ser = context.getBean(DepartmentService.class);
		testAddNewEmployeeToDb();
		testGetEmployeeById();
	}
	public static void testAddNewEmployeeToDb() {
		System.out.println("Test Started");
		Department dp = dep_ser.getDeptById(2);
		Employee new_comer = Employee.builder().name("Mohan Sarady")
				.salary(new BigDecimal("102000.00")).department(dp).build();
		emp_ser.saveEmployee(new_comer);
		System.out.println("Employee Added");
	}
	public static void testGetEmployeeById() {
		System.out.println("Test Started");
		EmployeeDTO test_emp = emp_ser.getEmployeeById(41);
		System.out.println("Employee Details : ");
		System.out.println(test_emp);
		// System.out.println("Department : " + test_emp.getDepartment());
	}
}
