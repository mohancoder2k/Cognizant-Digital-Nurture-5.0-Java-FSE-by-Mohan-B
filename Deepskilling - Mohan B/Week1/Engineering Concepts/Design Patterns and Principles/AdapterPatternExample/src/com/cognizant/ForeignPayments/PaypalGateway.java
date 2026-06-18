package com.cognizant.ForeignPayments;

public class PaypalGateway {
	public String makeTransaction(double dollars) {
		// TODO Auto-generated method stub
		if (dollars > 0) return "Payment Succeeded with amount : " + dollars + "dollars";
		return "Invalid Payment";
	}

}
