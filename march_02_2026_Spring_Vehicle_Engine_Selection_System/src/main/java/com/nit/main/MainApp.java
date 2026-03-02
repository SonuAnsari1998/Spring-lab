package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Vehicle;

@Configuration
@ComponentScan("com.nit.sbeans")
public class MainApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MainApp.class);
		Vehicle vehicle = ctx.getBean(Vehicle.class);
		vehicle.startVehicle();
	}
}
