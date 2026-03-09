package com.nit.sbeans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan(basePackages = "com.nit.sbeans")
public class AppConfig {
	
	@Bean("messageSource")
	public ResourceBundleMessageSource createObj() {
		ResourceBundleMessageSource r = new ResourceBundleMessageSource();
		r.setBasename("com/nit/resource/messages");
		return r;
	}

}
