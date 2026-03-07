package com.nit.sbeans;

import org.springframework.stereotype.Component;

@Component("train")
public class TrainBooking implements BookingService {

	@Override
	public void bookTicket() {
		System.out.println("Processing Train booking");
	}

}
