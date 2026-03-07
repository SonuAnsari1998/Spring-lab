package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("bus")
public class BusBooking implements BookingService {

	@Override
	public void bookTicket() {
		System.out.println("Processing Bus booking");

	}

}
