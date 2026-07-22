package com.cognizant.loan.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.DummyData.LoanDataset;
import com.cognizant.loan.Entity.Loan;

@RestController
@RequestMapping("/api/v1/loan")
public class LoanController {
	
	List<Loan> loan_accounts = new LoanDataset().generateRecords();
	
		@GetMapping("/{number}")
		public Loan getLoanAccount(@PathVariable String number) {
			return loan_accounts.stream()
		            .filter(loan -> loan.getNumber().equals(number))
		            .findFirst()
		            .orElse(null);
		}
}
