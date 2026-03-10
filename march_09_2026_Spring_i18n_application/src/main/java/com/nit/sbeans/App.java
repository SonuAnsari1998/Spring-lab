package com.nit.sbeans;

import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter locale (en, fr, hi, te):");
		String lang = sc.nextLine();
		Locale locale = LocaleSelector.getLocale(lang);
		LocalDate now = LocalDate.now();
		String formatted = DateFormatterUtil.formatDateForLocale(locale, now);
		MessageSource ms = ctx.getBean(MessageSource.class);
		String message = ms.getMessage("date.message", new Object[] { formatted }, locale);
		System.out.println(message);
		sc.close();
	}
}
