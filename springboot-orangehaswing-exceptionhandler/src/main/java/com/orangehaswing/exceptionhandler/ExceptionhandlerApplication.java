package com.orangehaswing.exceptionhandler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ExceptionhandlerApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ExceptionhandlerApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(ExceptionhandlerApplication.class);
	}
}

