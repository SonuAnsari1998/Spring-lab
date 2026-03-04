package com.nit.main;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.BillingService;
import com.nit.sbeans.DiscountStrategy;
import com.nit.sbeans.RegularCustomerDiscount;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class MainApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainApp.class);

		double pAmount = Double.parseDouble(IO.readln("Enter purchase amount:"));
		System.out.println("Enter customer type (regular/premium/elite):\nRegular\nPremium\nElite");
		String type = sc.next().toLowerCase();//regular

		DiscountStrategy obj = (DiscountStrategy) ctx.getBean(type);

		BillingService bill = new BillingService(obj);
		bill.generateBill(pAmount);

	}
}
