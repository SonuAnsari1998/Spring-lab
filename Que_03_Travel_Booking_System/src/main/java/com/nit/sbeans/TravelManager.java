package com.nit.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TravelManager {
	@Autowired
	@Qualifier("hotel")
	BookingService bookingService;

	public void getDetails() {
		System.out.println("Booking Type: Hotel");
		bookingService.bookTicket();
		System.out.println("Booking completed successfully");
	}

}
