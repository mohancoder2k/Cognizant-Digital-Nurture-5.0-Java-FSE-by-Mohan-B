package com.cognizant.ForeignPayments;

public class StripeGateway {
	public String charges(double euros) {
		// TODO Auto-generated method stub
		if (euros> 0) return "Payment Succeeded with amount : " + euros + " euros";
		return "Invalid Payment";
	}

}
