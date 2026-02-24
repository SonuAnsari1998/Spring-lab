package com.nit.sbeans;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class SchedulerService {
	LocalDate lDate;

	
	public void setlDate(LocalDate lDate) {
		this.lDate = lDate;
	}


	public String getDay() {
		DayOfWeek day = lDate.getDayOfWeek();
		if (day == DayOfWeek.FRIDAY) {
			return "Schedule weekly report email.";
		} else if (day == DayOfWeek.MONDAY) {
			return "Check weekend system logs.";
		} else {
			return "Normal weekday operations.";
		}
	}
}
