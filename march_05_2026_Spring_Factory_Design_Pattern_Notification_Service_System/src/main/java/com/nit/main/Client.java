package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.NotificationFactory;
import com.nit.sbeans.Notifier;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class Client {

	private final NotificationFactory notificationFactory;

	Client(NotificationFactory notificationFactory) {
		this.notificationFactory = notificationFactory;
	}

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(Client.class);

		String type = IO.readln("Enter type: (email/sms/push)");
		String msg = IO.readln("Enter your msg");

		NotificationFactory bean = ctx.getBean(NotificationFactory.class);
		Notifier notifier = bean.getNotifier(type);
		notifier.sendNotification(msg);
	}
}
