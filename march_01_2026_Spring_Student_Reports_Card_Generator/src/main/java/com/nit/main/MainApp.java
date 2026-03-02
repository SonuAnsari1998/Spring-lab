package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.nit.config.AppConfig;
import com.nit.sbeans.BillService;
import com.nit.sbeans.Consumer;



public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//		Consumer consumer = ctx.getBean(Consumer.class);
//		consumer.setConsumerId(101);
//		consumer.setName("Rahat");
//		consumer.setUnitsConsumed(90);
		BillService bill = ctx.getBean(BillService.class);
		bill.printBill();
	}
}
