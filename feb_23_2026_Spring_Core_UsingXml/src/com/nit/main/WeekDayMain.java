package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.CalendarService;
import com.nit.sbeans.WeekDayAnalyze;

public class WeekDayMain {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nit/configure/applicationContext.xml");
		System.out.println("------Question --> 01 -----------\n");
		WeekDayAnalyze bean1 = (WeekDayAnalyze) ctx.getBean("wmg1");
		System.out.println(bean1.getDayOfWeek());
		
		System.out.println("\n------Question --> 02 -----------\n");
		CalendarService bean2 = (CalendarService) ctx.getBean("wmg2");
		System.out.println(bean2.getDate());
	}
}

