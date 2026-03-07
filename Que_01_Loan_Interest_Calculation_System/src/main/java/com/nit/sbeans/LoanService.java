package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class LoanService {

	private final HomeLoanInterest homeloan;

	@Autowired
	@Qualifier("homeloan")
	InterestStrategy interestStrategy;

	LoanService(HomeLoanInterest homeloan) {
		this.homeloan = homeloan;
	}

	public void processLoan(double amount) {
		System.out.println("Loan Type: Home loan");
		System.out.println("Loan Amount: " + amount);
		System.out.println("Interest Amount: " + interestStrategy.calculateInterest(amount));
	}
}
