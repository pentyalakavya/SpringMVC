package com.accenture.annotationEx;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanGenerator {

	@Bean
	public HelloWorldBean getHelloBean()
	{
		return new HelloWorldBean();
	}
}
