package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FoodDeliveryApp {
	@Autowired
	@Qualifier("kfcService")
	RestaurantService restaurantService;

	public void orderFood(String item) {
		restaurantService.placeOrder(item);
	}
}
