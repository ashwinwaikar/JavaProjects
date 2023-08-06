package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public int insertt(Student s) {
		// insert query
		String query = "insert into student(id,name,city) values(?,?,?)";
		int i = this.jdbcTemplate.update(query, s.getId(), s.getName(), s.getCity());
		return i;
	}

	public int updatee(Student s) {
		// update query
		String query = "update student set name=?,city=? where id=?";
		int i = this.jdbcTemplate.update(query, s.getName(), s.getCity(), s.getId());
		return i;
	}

	public int deletee(int studentId) {
		// delete query
		String query = "delete from student where id=?";
		int i = this.jdbcTemplate.update(query, studentId);
		return i;
	}

}
