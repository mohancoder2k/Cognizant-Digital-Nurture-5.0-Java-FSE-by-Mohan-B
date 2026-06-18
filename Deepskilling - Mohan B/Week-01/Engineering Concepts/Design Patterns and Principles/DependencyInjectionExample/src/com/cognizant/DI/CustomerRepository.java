package com.cognizant.DI;

import java.util.List;

public interface CustomerRepository {
	List<String> findAll();
	String findCustomerById(long id);
}	
