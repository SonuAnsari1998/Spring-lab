package com.nit.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Date;

public class CalendarService {
	LocalDate date;

	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getDate() {
		int dayOfMonth = date.getDayOfMonth();
		if(dayOfMonth ==30 || dayOfMonth ==31) {
			return "Month is ending, please submit reports.";
		}else {
			return "Continue working as usual.";
		}
	}

}
