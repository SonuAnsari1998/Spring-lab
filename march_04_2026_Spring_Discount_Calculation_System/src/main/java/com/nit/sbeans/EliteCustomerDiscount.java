package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("elite")
public class EliteCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		double discount = (15 * amount) / 100;
		return discount;
	}

}
