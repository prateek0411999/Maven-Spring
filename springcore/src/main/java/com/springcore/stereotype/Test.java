package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereo.xml");
		
	Student s=	(Student) con.getBean("student");
	System.out.println(s);
	System.out.println(s.getAddress());
	
	System.out.println(s.getAddress().getClass().getName());
		//yha yeh bean ka name student kyu likha jabki hmne to specify hi nhi kiya bean
		//toh stereotype annotation m bean name hmara classname hi ban jata hh 
		//lowercase first letter
	System.out.println(s.hashCode());
	
	Student s1 = (Student) con.getBean("student");
	
	System.out.println(s1.hashCode());
	
	//singleton hota hh scope by default to vahi object bna hua ioc hme return krta hh
	//isliye hashcode same aa rha tha 
	//but ab hmne scope annotation use krke scope prototype krdia toh ioc har bar new object 
	//bnata hh isliye hashcode different aa rhe
	}

}
