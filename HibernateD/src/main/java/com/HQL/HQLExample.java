package com.HQL;

import java.util.Arrays;
import java.util.List;

import org.hibernate.query.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.HibernateDurgesh.Student;

@SuppressWarnings("deprecation")
public class HQLExample {
	public static void main(String[] args) {
		System.out.println("Project Started!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		System.out.println(sessionFactory);
		Session session = sessionFactory.openSession();

//		HQL SYNTAX
//		String queryString = "from Student where city='Sakoli'";
//		or we can pass a dynamic paramenters
		String queryString = "from Student as s where s.city=:X and s.name=:Y";

		Query q1 = session.createQuery(queryString);
//passing dynamic parameters
		q1.setParameter("X", "Sakoli");
		q1.setParameter("Y", "Kadar Waikar");

		// IF we are expecting single object in result
		// Student s=(Student) q.uniqueResult();

		// IF we are expecting more that 1 object in result
		List<Student> list = q1.list();

		for (Student student : list) {
			System.out.println(student.getName());
			System.out.println(student);
		}

		System.out.println("------------------------------------------------------------------------------");
		Transaction transaction = session.beginTransaction();

		// DELETE QUERY
		/*
		 * createQuery() method takes HQL as a parameter ............. Query q2 =
		 * session.createQuery("delete from Student s where s.city=:C");
		 * 
		 * q2.setParameter("C", "Nagpur");
		 * 
		 * int r = q2.executeUpdate(); System.out.println("Deleted:" + r);
		 */

		// UPDATE QUERY
		/*
		 * Query q3 =
		 * session.createQuery("update from Student s set s.city=:C where s.sid=:S");
		 * 
		 * q3.setParameter("C", "Ramatekadi"); q3.setParameter("S", 1009);
		 * 
		 * int r = q3.executeUpdate(); System.out.println("Updated:" + r);
		 */

		// JOIN QUERY
		/*
		 * the join conditions (which id fields to do the join on) are usually handled
		 * by Hibernate itself (which already has that information defined in the
		 * mapping), so you only need to specify which attribute the association is
		 * mapped with, and do the join on it
		 */
		Query q4 = session
				.createQuery("select q.question,q.questionId,a.answer from Questionnn q INNER JOIN q.answers as a");
		List<Object[]> list3 = q4.getResultList();
		for (Object[] arr : list3) {
			System.out.println(Arrays.toString(arr));
		}
		session.close();
		sessionFactory.close();
	}
}
