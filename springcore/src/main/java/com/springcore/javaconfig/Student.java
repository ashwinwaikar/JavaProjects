package com.springcore.javaconfig;

import org.springframework.stereotype.Component;

//@Component here in this example we removed this annotation to get the object created by IOC automatically 
//else we are using the @BEAN annotaion in our own java configuration file
public class Student {

	private Samosa samosa;

	public Student(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}

	public void study() {
		this.samosa.display();
		System.out.println("Student is reading book");
	}
}
