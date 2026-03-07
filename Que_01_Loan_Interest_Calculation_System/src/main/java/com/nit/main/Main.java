package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.LoanService;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);
		LoanService bean = ctx.getBean(LoanService.class);
		bean.processLoan(200000);
		
	}
}
