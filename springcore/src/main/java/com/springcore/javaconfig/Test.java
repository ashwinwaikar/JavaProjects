package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				ApnaJavaConfigurationClass.class);
		Student student = applicationContext.getBean("student", Student.class);
		System.out.println(student);
		student.study();
	}

}
