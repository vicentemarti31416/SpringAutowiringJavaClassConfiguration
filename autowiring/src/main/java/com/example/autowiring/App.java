package com.example.autowiring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.autowiring.beans.BeanGetter;

public class App {
	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		BeanGetter getter = context.getBean(BeanGetter.class);
		System.out.println(getter.getBeanTarget());
	}
}
