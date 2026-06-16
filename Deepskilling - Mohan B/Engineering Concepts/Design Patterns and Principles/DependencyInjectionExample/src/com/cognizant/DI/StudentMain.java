package com.cognizant.DI;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			CustomerRepository cust = new CustomerRepositoryImpl();
			CustomerService ser = new CustomerService(cust);
			ser.displayCustomer();
	}

}
