package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("hotel")
public class HotelBooking implements BookingService {

	@Override
	public void bookTicket() {
		System.out.println("Processing Hotel booking");

	}

}
