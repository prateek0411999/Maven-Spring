//ALL the configration using ANNOTATIONS 
// I.E.  WITHOUT XML KRNA HO TOH

//
//package com.spring.jdbc;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//
//import com.spring.jdbc.dao.StudentDao;
//import com.spring.jdbc.dao.StudentDaoimpl;
//
//@Configuration
//public class JdbcConfig {
//	
//	@Bean("ds")
//	public DriverManagerDataSource getDataSource()
//	{
//		DriverManagerDataSource ds=new DriverManagerDataSource();
//		ds.setDriverClassName("com.mysql.jdbc.Driver");
//		ds.setUrl("jdbc:mysql://localhost:3306/springjdbc");
//		ds.setUsername("root");
//		ds.setPassword("icsd");
//		
//		return ds;
//		
//	}
//	
//	
//	@Bean("jdbcTemplate")
//	public JdbcTemplate getTemplate()
//	{
//		JdbcTemplate jdbcTemplate=new JdbcTemplate();
//		jdbcTemplate.setDataSource(getDataSource());
//		return jdbcTemplate;
//	}
//	
//	@Bean("studentDao")
//	public StudentDao getStudentDao()
//	{
//		StudentDaoimpl studentDao=new StudentDaoimpl();
//		studentDao.setJdbcTemplate(getTemplate());
//		return studentDao;
//		
//		
//		
//	}
//	
//
//}
