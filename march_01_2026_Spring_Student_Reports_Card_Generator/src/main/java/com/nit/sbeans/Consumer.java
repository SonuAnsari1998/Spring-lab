package com.nit.sbeans;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;


public class Consumer {
	private int consumerId;
	private String name;
	private double  unitsConsumed;
	public int getConsumerId() {
		return consumerId;
	}
	public void setConsumerId(int consumerId) {
		this.consumerId = consumerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getUnitsConsumed() {
		return unitsConsumed;
	}
	public void setUnitsConsumed(double unitsConsumed) {
		this.unitsConsumed = unitsConsumed;
	}
	
}
