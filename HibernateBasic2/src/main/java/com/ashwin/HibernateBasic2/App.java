package com.ashwin.HibernateBasic2;
/*create an Entity Student with
	rollno int primary key
	name 
	age
	address

and using Hibernate persist it inside the database.
*/

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setRollno(1009);
		s1.setName("Ashwin");
		s1.setAge(23);
		s1.setAddress("Nagpur");

		Student s2 = new Student();
		s2.setRollno(587);
		s2.setName("Vanashree");
		s2.setAge(12);
		s2.setAddress("Sakoli");

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			session.save(s1);
			session.save(s2);

			transaction.commit();

			System.out.println("done");
		} catch (Exception ee) {
			System.out.println("in catch\t" + ee);
		}
	}
}
