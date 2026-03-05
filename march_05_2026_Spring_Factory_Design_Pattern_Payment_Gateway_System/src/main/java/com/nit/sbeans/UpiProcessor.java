package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("upi")
public class UpiProcessor implements PaymentProcessor {

	@Override
	public void processPayment(double amount) {
		System.out.println("Processing payment via UPI. Amount: ₹" + amount);
	}

}
