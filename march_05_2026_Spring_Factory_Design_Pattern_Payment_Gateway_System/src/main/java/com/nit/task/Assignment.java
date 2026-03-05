/*🧩 Task 3 — Payment Gateway System
🎯 Objective:

Use Factory Design Pattern to dynamically select a payment processor (Credit Card, PayPal, or UPI) in a Spring Core environment.

🧱 Class-wise Design
🔹 PaymentProcessor (Interface)

Defines:

void processPayment(double amount);

🔹 CreditCardProcessor (Implementation)

Prints:

Processing payment via Credit Card. Amount: ₹5000

🔹 PayPalProcessor (Implementation)

Prints:

Processing payment via PayPal. Amount: ₹5000

🔹 UpiProcessor (Implementation)

Prints:

Processing payment via UPI. Amount: ₹5000

🔹 PaymentFactory (Factory Class)

Uses getPaymentProcessor(String method) to return the correct payment processor bean.

🔹 AppConfig (Configuration Class)

Annotated with @Configuration and @ComponentScan.

🔹 Client (Main Class)

Accepts user input like creditCard, paypal, or upi, and executes the corresponding payment logic through the factory.
*/