package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceCenter {
	@Autowired
	Vehicle vehicle;
	String serviceType;

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public String performService() {
		return "ServiceCenter [vehicle=" + vehicle + ", serviceType=" + serviceType + "]";
	}

}
