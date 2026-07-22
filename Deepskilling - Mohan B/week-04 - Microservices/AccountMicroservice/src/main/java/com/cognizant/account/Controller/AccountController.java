package com.cognizant.account.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.Entity.Account;
import com.cognizant.account.Entity.Type;
import com.cognizant.account.TestingData.*;

@RestController
@RequestMapping("/v1/api/account")
public class AccountController {

	List<Account> accounts = new Dataset().generateRecords();

	@GetMapping("/{number}")
	public Account getAccountByNumber(@PathVariable long number) {
		return accounts.stream()
	            .filter(account -> account.getNumber() == number)
	            .findFirst()
	            .orElse(null);
	}
	
}
