package com.sqlquery;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.hibernate.HibernateDurgesh.Student;

public class SQLExample {

	public static void main(String[] args) {
		System.out.println("Project Started!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		System.out.println(sessionFactory);
		Session session = sessionFactory.openSession();

		// SQL Query
		String query = "select * from Student_Details";

		// createSQLQuery() takes SQL as a parameter
		// crtl+2 shortcut so that we can get LHS of anything
		NativeQuery createSQLQuery = session.createSQLQuery(query);

		List<Object[]> list = createSQLQuery.list();

		for (Object[] student : list) {
			System.out.println(Arrays.deepToString(student));
			System.out.println(student[4] + "       " + student[3]);
		}

		session.close();
		sessionFactory.close();
	}

}
