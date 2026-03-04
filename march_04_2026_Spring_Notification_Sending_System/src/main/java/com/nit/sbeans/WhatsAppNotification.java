package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("whatsapp")
public class WhatsAppNotification implements NotificationStrategy {

	@Override
	public void send(String message) {
		System.out.println("Sends message via WhatsApp.");
		System.out.println(message);
	}

}
