package com.cognizant.account.Entity;

import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Account {
	@Id
	private long number;
	@Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
	private Type type;
	private double balance;
}
