package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public  class StudentDaoimpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	
	public int insert(Student student) {
		// TODO Auto-generated method stub
		String query = "insert into student values(?,?,?)";
		int res= this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return res;
	}
	public int change(Student student) {
		// updating the data
		
		int r= this.jdbcTemplate.update("update student set name=? , city=? where id=?",student.getName(),student.getCity(),student.getId());
		
		
		return r;
	}
	
	//DELETION
	public int delete(int studentID) {
		//DELETE Operation
		int r= this.jdbcTemplate.update("delete from student where id=?",studentID);
		
		return r;
	}
	
	

	//SELECTING SINGLE STUDENT DATA
	public Student getStudent(int studentID) {
		
		String query = "select * from student where id=?";
		//jab hme single row return krani hh toh QUERYFOROBJECT Method use hogs
		//aur configure krege rowMapper ko
		//rowMapper - resultSet ka object hh lagalo joki data bind krne m help krega
		RowMapper<Student> rowMapper=new RowMapperImpl();
		
		//yeh jo return krega uska schema student jesa hi hh toh usko daal k return kradege
		Student student=this.jdbcTemplate.queryForObject(query, rowMapper,studentID);
		
		return student;
	}
	
	
	
	//SELECTING ALL THE STUDENTS
	public List<Student> getAllStudents() {
		//jese hmne phele alag se rowMapperImpl ki class ka object diya hh
		//hmm vese directly yha bhi kr skte hh annonymous class wala concept se
		//lekin alag se class bnane wala seeen best hh
		
		
		// toh ab yeh query hme list of students degi toh usme store krke return kradiya
		//select all k case queryforobject nhi lagate just query method lagate hh simple
   List<Student> students =	this.jdbcTemplate.query("select * from student", new RowMapperImpl());
   		return students;
		
	}
	


	public JdbcTemplate getJdbcTemplate()
	{
		return jdbcTemplate;
		
	}
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	{
		this.jdbcTemplate= jdbcTemplate;
	}
	
}
