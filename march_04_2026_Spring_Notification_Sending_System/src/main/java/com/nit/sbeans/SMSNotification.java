package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("sms")
public class SMSNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		System.out.println("Sends message via SMS.");
		System.out.println(message);
	}

}
