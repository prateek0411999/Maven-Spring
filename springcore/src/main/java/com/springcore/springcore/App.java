package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //now to use student here we used to do it by new keyword(manually)
        //by using spring we eliminate the above thing 
        
        //we will create classpathXmlApplicaionContext and provide it with our config.xml jisme 
        //hmne bean(class) aur uski property ki values specify ki hh
        
        
        
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student s1= (Student) context.getBean("student1");
        System.out.println(s1);
    
    }
}
