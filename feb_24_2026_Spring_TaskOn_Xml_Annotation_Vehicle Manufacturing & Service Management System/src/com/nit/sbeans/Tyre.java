package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
	String brand;
	double size;
	
	
	public void setBrand(String brand) {
		this.brand = brand;
	}


	public void setSize(double size) {
		this.size = size;
	}


	public String showTyreDetails() {
		return "Tyre Details :"+
				"\nBrand: "+this.brand+
				"\nSize: "+this.size;
	}
	
}
