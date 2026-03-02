package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("diesel")
public class DieselEngine implements Engine{

	@Override
	public void start() {
		System.out.println("Diesel engine started 🚛");
		
	}

}
