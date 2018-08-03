package com.stackroute.spring.spring_demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo1 {
	public static void main(String[] Args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		SpringDemo obj=(SpringDemo) ctx.getBean("hdjas");
		obj.demo();
	}

}
