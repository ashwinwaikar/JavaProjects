package com.telusko.HibernateBasic;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class App {
	public static void main(String[] args) {
		Alien telusko1 = new Alien();

		telusko1.setAid(45);
		telusko1.setAname("Ashwin");
		telusko1.setColor("Red");

		Alien telusko2 = new Alien();

		telusko2.setAid(50);
		telusko2.setAname("Chiranjeev");
		telusko2.setColor("Pink");

		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();

			session.save(telusko1);
			session.save(telusko2);

			transaction.commit();

			System.out.println("done");
		} catch (Exception ee) {
			System.out.println("in catch\t" + ee);
		}

	}
}
