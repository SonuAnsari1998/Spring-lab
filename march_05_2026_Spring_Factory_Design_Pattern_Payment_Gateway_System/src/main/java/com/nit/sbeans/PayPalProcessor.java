package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("paypal")
public class PayPalProcessor implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		IO.print("Processing payment via UPI. Amount: ₹" + amount);
	}

}
