package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Customer {
	private int customerId;
	private String customerName;
	private Bank bank;
	@Autowired 
	BankFactory bankFactory;
	
	public void setCustomerId(int customerId) {
		this.customerId=customerId;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName=customerName;
	}
	
	public void setBank(String bankType) {
		this.bank = bankFactory.createBank(bankType);
	}
	public void deposit(double amount) {
		bank.deposit(amount);
	}
	public void withdraw(double amount) {
		bank.withdraw(amount);
	}
	public void displayDetails() {
		System.out.println("Customer Id: "+this.customerId);
		System.out.println("Customer Name: "+this.customerName);
		System.out.println("Available Balance: "+bank.getAmount());
	}
}
