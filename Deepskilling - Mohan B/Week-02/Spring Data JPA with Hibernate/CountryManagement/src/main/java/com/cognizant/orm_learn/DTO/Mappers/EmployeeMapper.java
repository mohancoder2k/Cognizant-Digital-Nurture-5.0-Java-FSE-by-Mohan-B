package com.cognizant.orm_learn.DTO.Mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.cognizant.orm_learn.DTOs.EmployeeDTO;
import com.cognizant.orm_learn.model.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {
	@Mapping(source = "department.name", target = "departmentName")
	EmployeeDTO toDTO(Employee employee);
	 @Mapping(source = "departmentName", target = "department.name")
	Employee toEntity(EmployeeDTO dto);
}
















