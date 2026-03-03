/*Task 4 — Food Delivery System (Restaurant Selection) Objective: Use
@Qualifier to choose a specific restaurant implementation.

Interface — RestaurantService Method: void placeOrder(String item);

Implementations: DominosService: Print: Order placed for at Dominos 🍕

KfcService: Print: Order placed for at KFC 🍗

BurgerKingService: Print: Order placed for at Burger King 🍔

Class — FoodDeliveryApp Field: RestaurantService restaurantService

Injection: @Autowired @Qualifier(“kfcService”)

Method: orderFood(String item) → delegate to
restaurantService.placeOrder(item)

Expected Output: Order placed for Chicken Bucket at KFC 🍗*/
