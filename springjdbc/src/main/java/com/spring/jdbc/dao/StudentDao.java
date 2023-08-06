package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	public int insertt(Student s);

	public int updatee(Student s);

	public int deletee(int studentId);
}
