package com.cognizant.LegacySystem;

public class BharatPay  implements PaymentProcessor{

	@Override
	public String makePayment(double ruppee) {
		// TODO Auto-generated method stub
		if (ruppee > 0) return "Payment Succeeded with amount : " + ruppee + "ruppees";
		return "Invalid Payment";
	}

}
