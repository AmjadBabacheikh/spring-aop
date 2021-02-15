package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan
@Configuration
@EnableAspectJAutoProxy
public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		Client p = context.getBean(Client.class);
		Client q = context.getBean(Client.class);
		BusinessService s = context.getBean(BusinessService.class);
		s.doSomething();
		p.louer_vehicule();
		q.louer_vehicule();
	}

}
