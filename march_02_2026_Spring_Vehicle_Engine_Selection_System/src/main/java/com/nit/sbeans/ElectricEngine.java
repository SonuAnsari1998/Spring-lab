package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("electric")
public class ElectricEngine implements Engine {

	@Override
	public void start() {
		System.out.println("Electric engine started ⚡");

	}

}
