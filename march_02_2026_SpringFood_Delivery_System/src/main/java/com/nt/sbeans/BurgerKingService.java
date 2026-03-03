package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component
public class BurgerKingService implements RestaurantService {
	@Override
	public void placeOrder(String item) {
		System.out.println("Order placed for at Burger King 🍔");
	}

}
