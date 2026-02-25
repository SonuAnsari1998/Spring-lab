package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nit.config.AppConfig;
import com.nit.sbeans.TravelPackageCostCalculator;

public class TravelMain {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		
		TravelPackageCostCalculator travel = ctx.getBean(TravelPackageCostCalculator.class);
		
		System.out.println("Final Package Cost: "+travel.calculateFinalPackageCost());
	}
}
