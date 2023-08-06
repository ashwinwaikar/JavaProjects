package com.hibernate.HibernateDurgesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchDemo {
	public static void main(String[] args) {
		System.out.println("Project Started!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();

		// this is also same method chaning works from left to right in java
		/*
		 * SessionFactory sessionFactory = new
		 * Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		 */

		System.out.println(sessionFactory);

		Session session = sessionFactory.openSession();

//		get and load method

		// load method
		Student s = (Student) session.load(Student.class, 1009);
		System.out.println(s);

		// get method
		Address ad = session.get(Address.class, 1);
		System.out.println(ad.getStreet() + " " + ad.getCity());

		sessionFactory.close();

	}
}
