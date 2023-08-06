package com.map.onetoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	public static void main(String[] args) {
		System.out.println("Project Started!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = cfg.buildSessionFactory();
		System.out.println(sessionFactory);

		// creating Question class object
		Question q1 = new Question();
		q1.setQuestionId(579);
		q1.setQuestion("Allu kaise diye bhaijaan??");
		// now creating answer
		Answer a1 = new Answer();
		a1.setAnswerId(564);
		a1.setAnswer("Bhaiyaji sasta hai 600Rs kilo lelo");
		a1.setQuestion(q1);
		q1.setAnswer(a1);

		// creating Question class object
		Question q2 = new Question();
		q2.setQuestionId(897);
		q2.setQuestion("Pyaj kaise diye bhaijaan??");
		// now creating answer
		Answer a2 = new Answer();
		a2.setAnswerId(456);
		a2.setAnswer("Bhaiyaji sasta hai 9000Rs kilo lelo");
		a2.setQuestion(q2);
		q2.setAnswer(a2);

		System.out.println(q1);
		System.out.println(q2);
		Session session = sessionFactory.openSession();

		Transaction tx = session.beginTransaction();

		// saving object first main object which has pk then fk object
		session.save(a1);
		session.save(a2);
		session.save(q1);
		session.save(q2);

		tx.commit();

		// Fetching
		Question qq = (Question) session.get(Question.class, 9191);
		System.out.println(qq.getQuestion());
		System.out.println(qq.getAnswer().getAnswer());

		session.close();
		sessionFactory.close();

	}
}
