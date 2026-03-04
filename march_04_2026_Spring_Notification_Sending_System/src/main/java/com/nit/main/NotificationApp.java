package com.nit.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.NotificationService;
import com.nit.sbeans.NotificationStrategy;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class NotificationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(NotificationApp.class);

		String type = IO.readln("User chooses channel (email/sms/whatsapp).").toLowerCase();

		String msg = IO.readln("Enter message: "); // Your order has been shipped!

		NotificationStrategy notificationStrategy = (NotificationStrategy) ctx.getBean(type);

		NotificationService notification = ctx.getBean(NotificationService.class);

		notification.setNotificationStrategy(notificationStrategy);
		notification.notifyUser(msg);
	}
}
