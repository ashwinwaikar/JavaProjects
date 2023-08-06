package com.map.onetomanyandmanytoone;

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

		// creating Question class object
		Questionnn q1 = new Questionnn();
		q1.setQuestionId(9090);
		q1.setQuestion("Allu kaise diye bhaijaan??");

		// now creating answer
		Answerrr a1 = new Answerrr();
		a1.setAnswerId(786);
		a1.setAnswer("Bhaiyaji sasta hai 600Rs kilo lelo");
		a1.setQuestion(q1);

		Answerrr a2 = new Answerrr();
		a2.setAnswerId(454);
		a2.setAnswer("Bhaiyaji sasta hai 898Rs kilo lelo");
		a2.setQuestion(q1);

		Answerrr a3 = new Answerrr();
		a3.setAnswerId(67543);
		a3.setAnswer("Bhaiyaji sasta hai 12912912Rs kilo lelo");
		a3.setQuestion(q1);

		List<Answerrr> list = new ArrayList<Answerrr>();
		list.add(a1);
		list.add(a2);
		list.add(a3);

		// i.e 1 question has many answers
		q1.setAnswers(list);

		System.out.println(q1);

		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		// or we can use cascade so that it will be in sync
		// saving object first main object which has pk then fk object
		session.save(a1);
		session.save(a2);
		session.save(a3);
		session.save(q1);

		tx.commit();

//		// Fetching
		Questionnn qq = (Questionnn) session.get(Questionnn.class, 9090);

		System.out.println(qq.getQuestionId());
		System.out.println(qq.getQuestion());

		for (Answerrr a : qq.getAnswers()) {
			// System.out.println(a);
			System.out.println(a.getAnswer());
		}

		session.close();
		sessionFactory.close();

	}
}
