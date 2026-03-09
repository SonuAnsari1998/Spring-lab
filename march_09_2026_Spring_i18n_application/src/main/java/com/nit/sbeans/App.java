package com.nit.sbeans;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;


public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		String languate = IO.readln("Enter language (en, fr, hi, te)");
		
		Locale locale = new Locale(languate);
		
		MessageSource bean = ctx.getBean(MessageSource.class);
		String m = bean.getMessage("msg", new Object[] {}, locale);
		
		
		
		
		
	}
}
