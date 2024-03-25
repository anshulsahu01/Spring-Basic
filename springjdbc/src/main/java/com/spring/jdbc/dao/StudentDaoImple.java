package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;


import com.spring.jdbc.entities.Student;

public class StudentDaoImple implements StudentDao{
	
	private JdbcTemplate jdbcTemplate;
	
	
	public int insert(Student student) {
		//insert 
		String query ="insert into student(id,name,city) values(?,?,?)";
		int r = this.jdbcTemplate.update(query,student.getId(),student.getName(),student.getCity());
		
		return r;
	}
	
	
	//update
	
	public int change(Student student) {
		// TODO Auto-generated method stub
		
		String query ="update student set name=? ,city=?, where id=?";
		int r = this.jdbcTemplate.update(query,student.getName(), student.getCity(),student.getId());
		return r;
	}

	
	//Delete
	public int delete(Student student) {
		// TODO Auto-generated method stub
		String query ="delete from student where id=?";
		int r = this.jdbcTemplate.update(query,student Id);
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}



	



	
	

}
