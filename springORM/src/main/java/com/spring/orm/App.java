package com.spring.orm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
      ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
      
      StudentDao studentDao= (StudentDao) context.getBean("studentDao");
    
//      Student stu= new Student(150, "Prateek Sharma", "Panipat");
//      int res= studentDao.insert(stu);
//      
//      System.out.println("done: "+res);
    
      //CONSOLE BASED APPLICATION FOR CRUD OPERARION:-- SPRING ORM - HIBERNATE
      
      BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
      boolean go=true;
    
      while(go)
      {
    	  System.out.println();
    	  System.out.println("Press 1 to add new Student ");
          System.out.println("Press 2 to display all students");
          System.out.println("Press 3 to get detail of single student ");
          System.out.println("Press 4 to delete a student ");
          System.out.println("Press 5 to update ");
          System.out.println("Press 6 to exit ");
          
         try {
        	 
        	 int i=Integer.parseInt(br.readLine());
        	 
        	 switch(i)
        	 {
        	 	case 1:
        	 		//Add a new Student
        	 		System.out.println("Enter user id");
        	 		int uid= Integer.parseInt(br.readLine());
        	 		
        	 		System.out.println("Enter user name");
        	 		String name=br.readLine();
        	 		
        	 		System.out.println("ENter user city");
        	 		String city=br.readLine();
        	 		
        	 		Student s=new Student(uid,name,city);
        	 		int re =studentDao.insert(s);
        	 		System.out.println(re+ "student added");
        	 		System.out.println("**********************************");
        	 		break;
        	 	case 2:
        	 		//display all
        	 		
        	 		List<Student> allstudents=studentDao.getAllStudent();
        	 		for(Student ss: allstudents)
        	 		{
        	 			System.out.println("Name: "+ss.getStudentName());
        	 			System.out.println("Id : "+ss.getStudentId());
        	 			System.out.println("City: "+ss.getStudentCity());
        	 			System.out.println("-----------------------------------");
        	 		}
        	 		
        	 		break;
        	 		
        	 	case 3:
        	 		//Get single student
        	 		int id;
        	 		System.out.println("Enter the id of the student");
        	 		id=Integer.parseInt(br.readLine());
        	 		Student s1=studentDao.getStudent(id);
        	 		System.out.println(s1.toString());
        	 	//	System.out.println(s1.getStudentName());
        	 		break;
        	 		
        	 	case 4:
        	 		//delete a student
        	 		System.out.println("Enter the id of that student");
        	 		int uu=Integer.parseInt(br.readLine());
        	 		studentDao.delete(uu);
        	 		System.out.println("Student deleted");
        	 		break;
        	 	case 5:
        	 		//update a student
        	 		System.out.println("Enter the id of student to modify it's detail");
        	 		int ii = Integer.parseInt(br.readLine());
        	 		System.out.println("Enter his modified name");
        	 		String namee=br.readLine();
        	 		System.out.println("Enter his modified city");
        	 		String cityy=br.readLine();
        	 		Student s2=new Student(ii,namee,cityy);
        	 		studentDao.update(s2);
        	 		System.out.println("Updated ");
        	 		break;
        	 	case 6:
        	 		//Exit
        	 		go=false;
        	 		break;
        	 		
        	 }
        	 	
        	 
			
		} catch (Exception e) {
			// TODO: handle exception
			
			System.out.println("Invalid Input try with another one");
			System.out.println();
		}
      }
      System.out.println("Thank for using my application");
      System.out.println();
      
    
    }
}
