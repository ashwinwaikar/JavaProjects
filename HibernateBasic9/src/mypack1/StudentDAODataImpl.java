package mypack1;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StudentDAODataImpl implements StudentDAO {
	private SessionFactory sf;
	private Session session;

	public StudentDAODataImpl() {
		sf = HibernateUtil.getSessionFactory();
	}

	@Override
	public void addStudent(Student ref) {
		session = sf.openSession();
		Transaction transaction = session.beginTransaction();
		session.save(ref);
		transaction.commit();
		session.close();
		System.out.println("Done with commit");
	}

	@Override
	public Student getStudent() {
		session = sf.openSession();
		Query<?> qry = session.createQuery("from Student");
		List<?> mylist = qry.list();
		Student ref = (Student) mylist.get(0);
		session.close();
		return ref;
	}

}
