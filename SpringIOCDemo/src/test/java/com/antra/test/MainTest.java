package com.antra.test;

import com.antra.config.MyConfig;
import com.antra.service.MyService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);
		MyService myService = ac.getBean(MyService.class);
		int price = myService.getTicketPrice();
		System.out.println(price);
	}
}
//Injection Types
//@Scope
//@Qualifier
//@Primary
//@PostConstruct
//@PreDestroy
