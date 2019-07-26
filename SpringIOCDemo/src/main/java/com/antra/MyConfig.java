package com.antra;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.antra")
public class MyConfig {
	@Bean
	public String getString() {
		return "Hello";
	}
}
