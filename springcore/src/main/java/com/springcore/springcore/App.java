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
        
        
        //yeh context object hmara container hh isse hmm iske function use krke object le skte
        ApplicationContext context= new ClassPathXmlApplicationContext("config.xml");
        Student s1= (Student) context.getBean("student1");
        System.out.println(s1);
        Student s2=(Student) context.getBean("student2");
        System.out.println(s2);
        //using p schema in config.xml file 
        Student s3= (Student) context.getBean("student3");
        System.out.println(s3);
    
    }
}
