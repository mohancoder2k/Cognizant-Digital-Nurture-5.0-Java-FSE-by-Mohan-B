package com.cognizant.loan.Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Builder
@Entity
@Table(name = "loans") // You can change the table name as needed
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Loan {

    @Id
    private String number;

    private String type;

    // Double is used here for monetary values, but for strict financial applications, 
    // java.math.BigDecimal is recommended.
    private Double loan;

    private Double emi;

    private Integer tenure;
}