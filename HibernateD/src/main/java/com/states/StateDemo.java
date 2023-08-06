package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.HibernateDurgesh.Certificate;
import com.hibernate.HibernateDurgesh.Student;

public class StateDemo {

	public static void main(String[] args) {
//Practical of Hibernate Object States
		// Transient
		// Persistent
		// Detached
		// Removed
		System.out.println("Project Started");

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		// Creating Student object
		Student s1 = new Student();
		s1.setSid(8989);
		s1.setName("Dhanashree");
		s1.setCity("Ganga Jamuna");
		s1.setCerti(new Certificate("Java Hibernate Course", "6 Months"));
		// So the student is now in Transient state till line no 27 i.e not in DB not in
		// SESSION

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(s1);
		// So the student is now in Persistent state till line no 34 present in both
		// SESSION and in DB
		s1.setName("Mader Khan");

		tx.commit();

		session.close();
		// At line 41 the object come in a Detached state
		s1.setName("Vanashree");
		System.out.println(s1.getName());
		factory.close();

	}

}
