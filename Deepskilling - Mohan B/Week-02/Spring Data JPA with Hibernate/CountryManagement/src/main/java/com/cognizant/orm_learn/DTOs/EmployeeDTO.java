package com.cognizant.orm_learn.DTOs;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDTO {
	private int id;	
	private String name;
	private BigDecimal salary;
	private String departmentName;
}
