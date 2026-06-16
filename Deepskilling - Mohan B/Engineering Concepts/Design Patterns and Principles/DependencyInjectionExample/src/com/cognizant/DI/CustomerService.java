package com.cognizant.DI;

import java.util.List;

public class CustomerService {
	private final CustomerRepository cr;
	
	public CustomerService(CustomerRepository cr) {
		this.cr = cr;  // In Spring boot -> Autowired annotation used 
	}
	
	public void displayCustomer() {
		List<String> res = cr.findAll();
		for(String str : res) {
			System.out.println(str);
		}
	}
}
