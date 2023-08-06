package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan(basePackages = "com.springcore.javaconfig")
public class ApnaJavaConfigurationClass {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}

	@Bean(name = { "student", "temp" })
	public Student getStudent() {
		// creating a new student object
		Student s = new Student(getSamosa());
		return s;
	}
}
