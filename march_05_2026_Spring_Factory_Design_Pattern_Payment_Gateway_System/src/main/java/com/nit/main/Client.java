package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.PaymentFactory;
import com.nit.sbeans.PaymentProcessor;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Client.class);

		String type = IO.readln("Enter the Type: (creditCard, paypal, or upi)");
		double amount = Double.parseDouble(IO.readln("Enter Amount"));

		PaymentFactory pf = ctx.getBean(PaymentFactory.class);
		PaymentProcessor paymentProcessor = pf.getPaymentProcessor(type);
		paymentProcessor.processPayment(amount);
	}
}
