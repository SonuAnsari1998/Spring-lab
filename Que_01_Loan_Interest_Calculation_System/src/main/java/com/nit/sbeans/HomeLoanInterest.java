package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("homeloan")
public class HomeLoanInterest implements InterestStrategy {

	@Override
	public double calculateInterest(double amount) {
		double inteestRate = (7 * amount) / 100;
		return inteestRate;
	}

}
