package com.spring.orm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.spring.orm.entities.Student;

public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	@Transactional
	public int insert(Student student)
	{
		//insert
		Integer i =(Integer) this.hibernateTemplate.save(student);
		return i;
	}
	
	//get the single data(Object)
	public Student getStudent(int studentId)
	{
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	//get all the data
	public List<Student> getAllStudent()
	{
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
		
	}
	
	//DELETE
	@Transactional
	public void delete(int id)
	{	
		//get krke delete krte hh
		Student student= this.hibernateTemplate.get(Student.class, id);
		//now delete
		this.hibernateTemplate.delete(student);
		
		
	}
	
	//UPDATE
	@Transactional
	public void update(Student student)
	{
		this.hibernateTemplate.update(student);
	}
	
	

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
}
