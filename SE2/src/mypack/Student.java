package mypack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

public class Student implements Serializable {
	private int rollno;
	private String name, address;

	/**
	 * @param rollno
	 * @param name
	 * @param address
	 */
	public Student(int rollno, String name, String address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	}

	public static void main(String[] args) {
		Map<String, Student> m = new HashMap<String, Student>();

		Student s1 = new Student(1009, "Ashwin", "Nagpur");
		Student s2 = new Student(123, "Sanket", "Sakoli");
		Student s3 = new Student(432, "Rajat", "Bihar");
		Student s4 = new Student(535, "Vanashree", "Rajasthan");

		m.put("first", s1);
		m.put("second", s2);
		m.put("third", s3);
		m.put("fourth", s4);

		// Serializing
		try {
			FileOutputStream fos = new FileOutputStream("D:\\VITA E-DAC\\Java\\Exam\\SE\\Q2\\one.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(m);

			FileInputStream fis = new FileInputStream("D:\\VITA E-DAC\\Java\\Exam\\SE\\Q2\\one.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);

			Map<String, Student> m2 = (Map<String, Student>) ois.readObject();

			// steps---map->>set->>iterator
			// now get an Set
			Set<Entry<String, Student>> set = m2.entrySet();

			// now get an iterator
			Iterator<Entry<String, Student>> itr = set.iterator();

			// display elements
			while (itr.hasNext()) {
				Map.Entry<String, Student> me = (Entry<String, Student>) itr.next();

				System.out.println(me.getKey() + ":" + me.getValue());

			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
