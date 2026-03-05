/*/*🧩 Task 4 — Notification Service System    march_05_2026_Spring_Factory_Design_Pattern_Notification_Service_System
🎯 Objective:

Illustrate the Factory Design Pattern in Spring Core by dynamically selecting a notification channel (Email, SMS, or Push Notification).

🧱 Class-wise Design
🔹 Notifier (Interface)

Defines:

void sendNotification(String message);

🔹 EmailNotifier (Implementation)

Prints:

Sending Email Notification: Your order has been shipped!

🔹 SmsNotifier (Implementation)

Prints:

Sending SMS Notification: Your OTP is 4321.

🔹 PushNotifier (Implementation)

Prints:

Sending Push Notification: New offer available in your app!

🔹 NotificationFactory (Factory Class)

Contains getNotifier(String type) and uses Spring’s Map injection to get the right notifier bean.

🔹 AppConfig (Configuration Class)

Uses annotation-based configuration and component scanning.

🔹 Client (Main Class)

Takes input (email/sms/push), retrieves the appropriate notifier from the factory, and calls sendNotification().*/

