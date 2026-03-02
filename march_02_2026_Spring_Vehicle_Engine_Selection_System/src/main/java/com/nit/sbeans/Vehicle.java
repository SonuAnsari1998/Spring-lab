package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
	@Autowired
	@Qualifier("electric")
	Engine engine;

	public void startVehicle() {
		engine.start();
	}
}
