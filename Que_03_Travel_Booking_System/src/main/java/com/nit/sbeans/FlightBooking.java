package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("flight")
public class FlightBooking implements BookingService {

	@Override
	public void bookTicket() {
		System.out.println("Processing flight booking");
	}

}
