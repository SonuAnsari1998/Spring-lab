package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("regular")
public class RegularCustomerDiscount implements DiscountStrategy {

	@Override
	public double calculateDiscount(double amount) {
		double discount = (5 * amount) / 100;
		return discount;

	}

}
