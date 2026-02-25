package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

import com.nit.sbeans.RestaurantBillGenerator;

@Configuration
public class AppConfig {

	@Bean
	public RestaurantBillGenerator restaurantBillGenerator() {
		RestaurantBillGenerator rs = new RestaurantBillGenerator();
		rs.setFoodAmount(800);
		rs.setDrinksAmount(200);
		rs.setServiceCharge(50);
		rs.setGstPercentage(18);

		return rs;
	}
}
