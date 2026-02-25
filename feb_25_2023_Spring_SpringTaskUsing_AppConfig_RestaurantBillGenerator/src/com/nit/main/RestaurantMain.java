package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.RestaurantBillGenerator;

public class RestaurantMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

		RestaurantBillGenerator res = ctx.getBean(RestaurantBillGenerator.class);
		System.out.println("Final Restaurant Bill: ₹"+res.generateFinalBill());
	}

}
