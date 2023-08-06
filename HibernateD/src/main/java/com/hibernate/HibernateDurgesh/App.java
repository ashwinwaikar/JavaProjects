package com.hibernate.HibernateDurgesh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("Project Started!");

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		System.out.println(sessionFactory);

//		Creating Student object
		Student s1 = new Student();
		s1.setSid(1009);
		s1.setName("Kadar Waikar");
		s1.setCity("Sakoli");

		System.out.println(s1);

// 		Creating Address object
		Address a1 = new Address();
		a1.setStreet("Hudkeshwar Road");
		a1.setCity("Nagpur");
		a1.setOpen(true);
		a1.setAddedDate(new Date());
		a1.setXyz(1009.1999);

		// Reading image
		try {
			FileInputStream fis = new FileInputStream("src/main/java/passport photo.jpeg");
			byte[] data = new byte[fis.available()];
			fis.read(data);
			a1.setImage(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(a1);

		Session session = sessionFactory.openSession();

		Transaction transaction = session.beginTransaction();

		session.save(s1);
		session.save(a1);

		transaction.commit();
		session.close();

		System.out.println("Done");
	}
}
