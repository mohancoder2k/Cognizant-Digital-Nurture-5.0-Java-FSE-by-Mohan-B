package com.cognizant.DI;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepository {

	@Override
	public String findCustomerById(long id) {
		// TODO Auto-generated method stub
		return "Mohan Sarady";
	}

	@Override
	public List<String> findAll() {
		// TODO Auto-generated method stub
		List<String> ls = new ArrayList<>();
		ls.add("Mohan");
		ls.add("Ram");
		ls.add("Alice");
	
		return ls;
	}

}
