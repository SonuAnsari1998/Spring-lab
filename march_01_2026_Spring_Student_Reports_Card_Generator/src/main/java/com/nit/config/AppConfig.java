package com.nit.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.nit.sbeans.Consumer;

@Component
@ComponentScan(basePackages = "com.nit.sbeans")
public class AppConfig {
	
	@Bean
	public Consumer getConsumer()
	{
		Consumer c=new Consumer();
		c.setConsumerId(101);
		c.setName("Rahat");
		return c;
	}
}
