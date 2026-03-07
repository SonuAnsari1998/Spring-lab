package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("carloan")
public class CarLoanInterest implements InterestStrategy {

	@Override
	public double calculateInterest(double amount) {

		double inteestRate = (9 * amount) / 100;
		return inteestRate;
	}

}
