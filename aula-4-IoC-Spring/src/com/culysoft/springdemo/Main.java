package com.culysoft.springdemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		BeanFactory factory = new ClassPathXmlApplicationContext("spring.xml");
		
		Veiculo veiculo = (Veiculo)factory.getBean("veiculo");	
		
		veiculo.dirigir();
	}

}
