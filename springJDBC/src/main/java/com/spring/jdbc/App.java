package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        //spring jdbc
        ApplicationContext con=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        //created the object of JdbcTemplate 
//        JdbcTemplate template=(JdbcTemplate) con.getBean("jdbcTemplate");
//        //now this template has a lot of methods that we can use
//        
//        //update function hh JdbcTemplate p joki
//        //responsible h insert delete aur update k liye
//        //update ka first parameter is the query then the values 
//        
//        
//        
//        //insert query;
//        
//        int result = template.update("insert into student values(?,?,?)",102," Kunal Sharma ", "Panipat" );
//        System.out.println("number of record inserted "+ result);
//    
        
//    
        
        StudentDao d=(StudentDao) con.getBean("studentDao");
//        
//        Student ss=new Student(668, "Manik","PNP");
//        //inserting 
//        int res= d.insert(ss);
//        System.out.println("student added : "+ res);
//    
//        //update
//        Student s2=new Student();
//        s2.setId(100);
//        s2.setCity("Delhi");
//        s2.setName("Ramu");
//        int ress=d.change(s2);
//        System.out.println("updated:  "+ ress);
//        
        
        //delete
//        int res= d.delete(666);
//        System.out.println("deleted: "+res);
        
        //Select - single data- i.e. queryforobject
        Student sss = d.getStudent(668);
        System.out.println(sss);
        //yeh toh ho gya jab apne ko ek hi row le rhe bnde ki id bhej kk 
        
        
        
        //but there will be cases where we need all the data from the database
        //toh usko m list of student objects bnalege EZ
        
        List<Student> students= d.getAllStudents();
        //simple foreach loop se sab ko print krlia
        for(Student s: students)
        {
        	System.out.println(s);
        }
        
    }
}
