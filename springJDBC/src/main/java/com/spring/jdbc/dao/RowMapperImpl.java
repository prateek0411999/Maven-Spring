package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class RowMapperImpl implements RowMapper<Student> {

	//mapRow method ko implement krte hh
	

	
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		//resultSet se data get kra k set krdia student k object m
		Student student=new Student();
		student.setId(rs.getInt(1));
		student.setName(rs.getString(2));
		student.setCity(rs.getString(3));
		
		return student;
	}
	
	
	

}
