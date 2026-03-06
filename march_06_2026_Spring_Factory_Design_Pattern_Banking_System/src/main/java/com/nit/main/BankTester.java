package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Customer;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class BankTester {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BankTester.class);
		Customer cust = ctx.getBean(Customer.class);
		int cid = Integer.parseInt(IO.readln("Enter Customer id"));
		String cname = IO.readln("Enter Customer Name");
		double dAmount = Double.parseDouble(IO.readln("Enter Deposite Amount"));
		double wAmount = Double.parseDouble(IO.readln("Enter Withdraw amount"));
		String banktype = IO.readln("Enter Bank type");
		
		cust.setBank(banktype);
		
		cust.setCustomerId(cid);
		cust.setCustomerName(cname);
		cust.deposit(dAmount);
		cust.withdraw(wAmount);
		cust.displayDetails();

	}
}
