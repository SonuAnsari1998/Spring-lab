package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.TravelManager;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Main.class);

		TravelManager bean = ctx.getBean(TravelManager.class);
		bean.getDetails();
	}
}
