package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.Vehicle;
import com.nit.sbeans.VehicleFactory;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class Client {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Client.class);

		String type = IO.readln("Enter type (car, truck, bike)");

		VehicleFactory vf = ctx.getBean(VehicleFactory.class);
		Vehicle vehicle = vf.getVehicle(type);
		vehicle.assemble();

	}
}
