package com.example.exception.exceptions;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

@Configuration
public class MySimpleMappingExceptionResolver {
/*
	@Bean
	public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {
		SimpleMappingExceptionResolver resolver = 
				new SimpleMappingExceptionResolver();
		Properties mapping = new Properties();
		mapping.put("java.lang.ArithmeticException", "mathError");
		mapping.put("java.lang.NullPointerException", "bullPointerError");
		resolver.setExceptionMappings(mapping);
		return resolver;
	}
	*/
}
