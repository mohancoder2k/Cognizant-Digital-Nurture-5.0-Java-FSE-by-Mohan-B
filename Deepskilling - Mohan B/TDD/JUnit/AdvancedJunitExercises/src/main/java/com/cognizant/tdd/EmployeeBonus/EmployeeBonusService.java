package com.cognizant.tdd.EmployeeBonus;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

public class EmployeeBonusService {

	public boolean isElgibleForBonus(Employee e) {
		// TODO Auto-generated method stub
		LocalDate doj = e.getDoj();
		LocalDate today = LocalDate.now();
		Period p = Period.between(doj, today);
		int yoe = p.getYears();
		int rating = e.getRating();
		if(yoe >= 2) {
			if(rating >= 3 && rating <=5) {
				if(!e.isDisplinaryAction()) return true;
			}
		}
		return false;
	}
	public void printStatusOfEmployee() {
		List<Employee> records = empRecords();
		for(Employee emp : records) {
			if(isElgibleForBonus(emp)) {
				System.out.println(emp.getE_name() + "--" + "Eligible");
			}else {
				System.out.println(emp.getE_name() + "--" + "Not Eligible");
			}
		}
	}
	public List<Employee> empRecords(){
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(101, "Alice Smith", LocalDate.of(2015, 3, 15), true, "Manager", "IT", 5));
		employees.add(new Employee(102, "Bob Jones", LocalDate.of(2018, 6, 1), true, "Developer", "Engineering", 4));
		employees.add(new Employee(103, "Charlie Brown", LocalDate.of(2020, 1, 10), true, "Analyst", "Finance", 4));
		employees.add(new Employee(104, "Diana Prince", LocalDate.of(2012, 11, 22), false, "Director", "HR", 5));
		employees.add(new Employee(105, "Evan Wright", LocalDate.of(2021, 5, 19), false, "Consultant", "IT", 3));
		employees.add(new Employee(106, "Fiona Gallagher", LocalDate.of(2019, 8, 14), false, "Developer", "Engineering", 4));
		employees.add(new Employee(107, "George Clark", LocalDate.of(2023, 2, 28), true, "Intern", "Marketing", 1));
		employees.add(new Employee(108, "Hannah Abbott", LocalDate.of(2014, 7, 5), false, "Lead Engineer", "Engineering", 5));
		employees.add(new Employee(109, "Ian Malcolm", LocalDate.of(2017, 10, 31), true, "Manager", "Finance", 3));
		employees.add(new Employee(110, "Julia Roberts", LocalDate.of(2022, 9, 12), false, "Specialist", "HR", 8));
		employees.add(new Employee(111, "Mohan", LocalDate.of(2024, 5, 12), false, "SDE 2", "Product", 4));
		employees.add(new Employee());
		return employees;
	}
}
