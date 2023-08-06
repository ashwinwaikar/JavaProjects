package mypack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class StudentDAOFileImpl implements StudentDAO {

	@Override
	public void addStudent(Student ref) {
		try {
			FileOutputStream fos = new FileOutputStream("d:\\trial.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(ref);
		} catch (Exception ee) {
			ee.printStackTrace();
		}

	}

	@Override
	public Student getStudent() {
		Student ref = null;
		try {
			FileInputStream fos = new FileInputStream("d:\\trial.txt");
			ObjectInputStream ois = new ObjectInputStream(fos);
			ref = (Student) ois.readObject();
		} catch (Exception ee) {
			ee.printStackTrace();
		}
		return ref;
	}

}
