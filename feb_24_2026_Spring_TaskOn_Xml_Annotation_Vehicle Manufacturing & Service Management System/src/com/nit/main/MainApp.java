package com.nit.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nit.sbeans.ServiceCenter;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("com/nit/config/SpringConfig.xml");
		ServiceCenter bean = ctx.getBean(ServiceCenter.class);
		System.out.println(bean.performService());
		
	}
}

