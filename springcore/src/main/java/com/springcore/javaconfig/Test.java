package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//iss case m classpathxmlapplicationcontext toh use nhi kr skte kyuki vo xml file dekhta hh 
		ApplicationContext con= new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Student s= (Student) con.getBean("firststudent");
		System.out.println(s);
		s.study();
	}

}
 