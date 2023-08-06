package com.hibernate.HibernateDurgesh;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	public static void main(String[] args) {
		System.out.println("Project Started!");

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		System.out.println(sessionFactory);

		Student s1 = new Student();
		s1.setSid(1234);
		s1.setName("Ashwin");
		s1.setCity("Sakoli");
		Certificate c1 = new Certificate();
		c1.setCourse("JAVA");
		c1.setDuration("3 Months");
		s1.setCerti(c1);

		Student s2 = new Student();
		s2.setSid(5678);
		s2.setName("Kadar");
		s2.setCity("Masgaon");
		Certificate c2 = new Certificate();
		c2.setCourse("Dhuna Dhune");
		c2.setDuration("1 Year");
		s2.setCerti(c2);

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();

		// objects save
		session.save(s1);
		session.save(s2);

		System.out.println(s1);
		System.out.println(s2);
		
		tx.commit();
		sessionFactory.close();
	}
}
