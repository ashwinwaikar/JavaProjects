package com.ashwinwaikar.HibernateBasic7;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			Book b1 = new Book();

			Author a1 = new Author();
			a1.setName("ASHWIN");
			a1.setAddress("SAKOLI");

			Author a2 = new Author();
			a2.setName("VANASHREE");
			a2.setAddress("NAGPUR");

			Author a3 = new Author();
			a3.setName("HIMANSHU");
			a3.setAddress("MADRAS");

			Set<Author> h = new HashSet<Author>();
			h.add(a1);
			h.add(a2);
			h.add(a3);

			b1.setTitle("ASHWINkiDASTAN");
			b1.setCost(1009);
			b1.setAuthor(h);
			
			session.save(b1);

			transaction.commit();
			System.out.println("done with Book");

			System.out.println("------------------OBJECT IS PERSISTED---------------");

			Query<Book> blist = session.createQuery("from Book");
			List<Book> books = (List<Book>) blist.list();
			for (Book book2 : books) {
				System.out.println(book2);

			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
