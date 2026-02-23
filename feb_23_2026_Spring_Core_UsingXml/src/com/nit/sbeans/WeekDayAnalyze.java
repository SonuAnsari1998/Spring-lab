package com.nit.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class WeekDayAnalyze {
	LocalDate date;

	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public String getDayOfWeek() {
		DayOfWeek  day = date.getDayOfWeek();
		if(day==DayOfWeek.SATURDAY || (day==DayOfWeek.SUNDAY)) {
			return "It's the Weekend!";
		}else {
			return "It's a Weekday.";
		}
	}
}
