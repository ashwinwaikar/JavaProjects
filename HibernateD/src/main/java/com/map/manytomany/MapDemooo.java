package com.map.manytomany;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemooo {
	public static void main(String[] args) {
		System.out.println("Project Started!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		System.out.println(sessionFactory);

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.setEid(1999);
		e1.setName("Ramukaka");

		e2.setEid(1009);
		e2.setName("Shamu kaka");

		Project p1 = new Project();
		Project p2 = new Project();

		p1.setPid(7878);
		p1.setProjectName("Library Management");

		p2.setPid(4545);
		p2.setProjectName("Fleet Management");

		List<Employee> emplist = new ArrayList<Employee>();
		List<Project> prolist = new ArrayList<Project>();

		emplist.add(e1);
		emplist.add(e2);

		prolist.add(p1);
		prolist.add(p2);

		e1.setProjects(prolist);
		p1.setEmps(emplist);

		e2.setProjects(prolist);
		p2.setEmps(emplist);

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		session.save(e1);
		session.save(e2);
		session.save(p1);
		session.save(p2);

		tx.commit();

		session.close();
		sessionFactory.close();

	}
}
