package com.cognizant.LegacySystem;

import com.cognizant.ForeignPayments.StripeGateway;

public class StripeAdaptee implements PaymentProcessor {
	StripeGateway sg;
	public StripeAdaptee(StripeGateway sg) {
		this.sg = sg;
	}
	@Override
	public String makePayment(double ruppe) {
		// TODO Auto-generated method stub
		return sg.charges(ruppe);
	}

}
