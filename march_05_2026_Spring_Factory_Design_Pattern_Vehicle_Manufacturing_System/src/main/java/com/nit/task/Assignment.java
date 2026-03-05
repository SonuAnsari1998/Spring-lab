/*Task 2 — Vehicle Manufacturing System
🎯 Objective:

Demonstrate the Factory Design Pattern where Spring Core decides which type of vehicle to create (Car, Truck, or Bike) based on user input.

🧱 Class-wise Design
🔹 Vehicle (Interface)

Acts as the product interface.

void assemble();

🔹 Car (Implementation Class)

Implements Vehicle and prints:

Assembling a Car with automatic transmission.

🔹 Truck (Implementation Class)

Implements Vehicle and prints:

Assembling a Truck with heavy-duty engine.

🔹 Bike (Implementation Class)

Implements Vehicle and prints:

Assembling a Bike with lightweight alloy frame.

🔹 VehicleFactory (Factory Class)

Contains method getVehicle(String type) that returns the correct Vehicle bean using Spring’s Map-based autowiring.

🔹 AppConfig (Configuration Class)

Uses @Configuration and @ComponentScan.

🔹 Client (Main Class)

Reads input (e.g., car, truck, bike), retrieves the appropriate vehicle from the factory, and calls assemble().
*/