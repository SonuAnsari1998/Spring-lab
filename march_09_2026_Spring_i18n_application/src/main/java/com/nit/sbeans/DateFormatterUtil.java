package com.nit.sbeans;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatterUtil {

	public static String formatDateForLocale(Locale locale, LocalDate date) {
		DateTimeFormatter ofPattern;
		if (locale.getLanguage().equals("en")) {
			ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		} else if (locale.getLanguage().equals("hi")) {
			ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		} else if (locale.getLanguage().equals("te")) {
			ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		} else if (locale.getLanguage().equals("fr")) {
			ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		} else {
			ofPattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		}
		return date.format(ofPattern);
	}
}
