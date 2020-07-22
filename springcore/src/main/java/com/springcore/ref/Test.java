package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		
		Ramu r =(Ramu) context.getBean("Ramuref");
		System.out.println(r.getX());
		System.out.println(r.getOb().getY());
		System.out.println(r);

	}

}
