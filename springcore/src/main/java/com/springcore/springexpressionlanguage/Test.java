package com.springcore.springexpressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"com/springcore/springexpressionlanguage/spelconfig.xml");
		Demo d1 = applicationContext.getBean("demo", Demo.class);

		System.out.println(d1);
	}

}
