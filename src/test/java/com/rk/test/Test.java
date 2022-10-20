package com.rk.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rk.product.Product;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ac =new ClassPathXmlApplicationContext("spring.xml");
		Product p=ac.getBean("prod", Product.class);
		System.out.println(p);
	}

}
