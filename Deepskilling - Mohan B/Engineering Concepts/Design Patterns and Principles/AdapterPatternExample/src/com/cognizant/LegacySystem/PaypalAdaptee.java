package com.cognizant.LegacySystem;

import com.cognizant.ForeignPayments.PaypalGateway;

public class PaypalAdaptee implements PaymentProcessor {
	// public void makeTransaction(double dollars) from Paypal Gateway
	PaypalGateway pg;
	
	public PaypalAdaptee(PaypalGateway pg){
		this.pg = pg;
	}
	@Override
	public String makePayment(double ruppe) {
		// TODO Auto-generated method stub
		return pg.makeTransaction(ruppe);
	}
	
}
