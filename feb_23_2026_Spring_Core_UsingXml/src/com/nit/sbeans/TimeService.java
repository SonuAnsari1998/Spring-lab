package com.nit.sbeans;

import java.time.LocalTime;

public class TimeService {
	LocalTime lTime;

	

	public void setlTime(LocalTime lTime) {
		this.lTime = lTime;
	}



	public String getHour() {
		int hour = lTime.getHour();
		if (hour >= 5 && hour <= 11) {
			return "";
		} else if (hour >= 12 && hour <= 4) {
			return "Good Afternoon";
		} else if (hour >= 5 && hour <= 8) {
			return "Good Evening";
		} else {
			return "Good Night";
		}
	}
}
