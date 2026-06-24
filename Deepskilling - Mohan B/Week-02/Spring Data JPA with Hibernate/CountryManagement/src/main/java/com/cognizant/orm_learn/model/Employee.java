package com.cognizant.orm_learn.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "em_id")
		private int id;
		@Column(name = "em_name")
		private String name;
		@Column(name = "em_salary")
		private BigDecimal salary;
		@Column(name = "em_permanent")
		private boolean permanent;
		@Column(name = "em_date_of_birth")
		private Date dateOfBirth;

		@ManyToOne
	    @JoinColumn(name = "em_dp_id")
		private Department department;
}
