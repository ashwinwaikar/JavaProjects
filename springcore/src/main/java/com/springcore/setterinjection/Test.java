package com.springcore.setterinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/setterinjection/setterinjectionconfig.xml");
		Student student1 = (Student) context.getBean("student1");// getting by the name of bean of config file
		Student student2 = (Student) context.getBean("s1");// getting by the id of bean of config file

		System.out.println(student1);
		System.out.println(student2);

		Student student3 = (Student) context.getBean("student2");// getting by the name of bean of config file
		Student student4 = (Student) context.getBean("s2");// getting by the id of bean of config file

		System.out.println(student3);
		System.out.println(student4);

		Student student5 = (Student) context.getBean("student3");// getting by the name of bean of config file
		Student student6 = (Student) context.getBean("s3");// getting by the id of bean of config file

		System.out.println(student5);
		System.out.println(student6);
	}
}
