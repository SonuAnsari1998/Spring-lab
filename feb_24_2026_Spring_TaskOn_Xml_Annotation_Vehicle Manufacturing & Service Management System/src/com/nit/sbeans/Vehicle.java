package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class Vehicle {
	String vehicleName;
	Engine engine;
	Tyre tyre;

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	public Vehicle(Engine engine) {
		this.engine = engine;
	}

	@Autowired
	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}
	
	


	public String displayVehicleInfo() {
		return "Vehicle [vehicleName=" + vehicleName + ", engine=" + engine + ", tyre=" + tyre + "]";
	}

}
