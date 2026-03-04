package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class BillingService {
	
	DiscountStrategy discountStrategy;
	
	@Autowired
	public BillingService(DiscountStrategy discountStrategy) {
		this.discountStrategy = discountStrategy;
	}


	public void generateBill(double amount) {
		double dis = discountStrategy.calculateDiscount(amount);
		

		System.out.println("Original Amount: ₹"+amount); 
		System.out.println("Discount Applied: ₹"+dis);
		System.out.println("Final Payable Amount: ₹"+(amount-dis));
	}
}
