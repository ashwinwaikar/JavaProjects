package com.ashwinwaikar.HibernateBasic6;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Group g1 = new Group();

			Member m1 = new Member();
			m1.setMemberName("ASHWIN");
			m1.setMemberAddress("SAKOLI");

			Member m2 = new Member();
			m2.setMemberName("RAJAT");
			m2.setMemberAddress("NAGPUR");

			Member m3 = new Member();
			m3.setMemberName("VANASHREE");
			m3.setMemberAddress("KANPUR");

			Member m4 = new Member();
			m4.setMemberName("SHYAM");
			m4.setMemberAddress("SAUNDAD");

			Set<Member> h = new HashSet<Member>();
			h.add(m1);
			h.add(m2);
			h.add(m3);
			h.add(m4);

			g1.setGroupName("Piyush");
			g1.setGroupTechnology("SOFTWARE");
			g1.setGroupMembers(h);

			session.save(g1);

			transaction.commit();
			System.out.println("done with Group");

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
