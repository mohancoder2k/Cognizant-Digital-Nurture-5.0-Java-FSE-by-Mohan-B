package com.cognizant.AdapterPatter.Main;

import com.cognizant.ForeignPayments.PaypalGateway;
import com.cognizant.ForeignPayments.StripeGateway;
import com.cognizant.LegacySystem.*;

public class AdapterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaymentProcessor p1 = new BharatPay();
		System.out.println(p1.makePayment(900.00));
		
		PaypalGateway paypalService = new PaypalGateway();
		PaymentProcessor p2 = new PaypalAdaptee(paypalService);
		System.out.println(p2.makePayment(8494.00));
		
		StripeGateway stripeSer = new StripeGateway();
		PaymentProcessor p3 = new StripeAdaptee(stripeSer);
		System.out.println(p3.makePayment(567.00));
	}

}
