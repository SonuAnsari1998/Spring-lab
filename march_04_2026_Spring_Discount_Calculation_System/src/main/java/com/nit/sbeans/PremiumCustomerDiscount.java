package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("premium")
public class PremiumCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		double discount = (10 * amount) / 100;
		return discount;
	}

}
