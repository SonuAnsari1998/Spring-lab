package com.nit.sbeans;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PaymentFactory {

	@Autowired
	Map<String, PaymentProcessor> map;

	public PaymentProcessor getPaymentProcessor(String method) {
		return map.get(method);
	}
}
