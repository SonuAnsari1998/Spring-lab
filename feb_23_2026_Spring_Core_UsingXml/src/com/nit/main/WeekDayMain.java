package com.nit.main;

import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.nit.sbeans.CalendarService;
import com.nit.sbeans.SchedulerService;
import com.nit.sbeans.TimeService;
import com.nit.sbeans.WeekDayAnalyze;
import com.nit.sbeans.YearService;

public class WeekDayMain {
	public static void main(String[] args) {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("src/com/nit/configure/applicationContext.xml");
		System.out.println("------Question --> 01 -----------\n");
		WeekDayAnalyze bean1 = (WeekDayAnalyze) ctx.getBean("wmg1");
		System.out.println(bean1.getDayOfWeek());
		
		System.out.println("\n------Question --> 02 -----------\n");
		CalendarService bean2 = (CalendarService) ctx.getBean("wmg2");
		System.out.println(bean2.getDate());
		
		System.out.println("\n------Question --> 03 -----------\n");
		YearService bean3 = (YearService) ctx.getBean("wmg3");
		System.out.println(bean3.getMonth());
		
		System.out.println("\n------Question --> 04 -----------\n");
		TimeService bean4 = (TimeService) ctx.getBean("wmg4");
		System.out.println(bean4.getHour());
		
		System.out.println("\n------Question --> 05 -----------\n");
		SchedulerService bean5 = (SchedulerService) ctx.getBean("wmg5");
		System.out.println(bean5.getDay());
	}
}

