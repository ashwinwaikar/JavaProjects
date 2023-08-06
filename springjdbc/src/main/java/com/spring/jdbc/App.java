package com.spring.jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDaoImpl;
import com.spring.jdbc.entities.Student;

public class App {
	public static void main(String[] args) {
		System.out.println("Program Started!");
		// using Spring jdbc=>jdbcTemplate

		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");

		StudentDaoImpl s = applicationContext.getBean("studentDao", StudentDaoImpl.class);

		/*
		 * //insert---- > Student student1 = new Student(); student1.setId(4521);
		 * student1.setName("Rahul Jaykar"); student1.setCity("Pandharpur");
		 * 
		 * int i1 = s.insertt(student1);
		 * 
		 * System.out.println(i1 + " Records inserted successfully");
		 */

		/*
		 * //Update query--->>> Student student2 = new Student(); student2.setId(1009);
		 * student2.setName("Ankita Pal"); student2.setCity("Banaras");
		 * 
		 * int i2 = s.updatee(student2);
		 * 
		 * System.out.println(i2 + " Records updated successfully");
		 */

		int i3 = s.deletee(4789);
		System.out.println(i3 + " Records deleted successfully");

	}
}
