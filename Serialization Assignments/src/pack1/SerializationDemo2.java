package pack1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*2)Person class implements Serializable with
	private String name
	private int age
	getters and setters
	parameterized constructor

	Student extends Person
	private int rollno
	getter and setters
	parameterized constructor accepting name,age and rollno
	pass name and age to the super constructor

	Demo class with main
	create one object of Student, write it inside file and then read.
*/
class Person implements Serializable {
	private String name;
	private int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class Student extends Person {
	public Student(String name, int age, int rollno) {
		super(name, age);
		this.rollno = rollno;
	}

	private int rollno;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
}

public class SerializationDemo2 {

	public static void main(String[] args) {
		Student s1 = new Student("Ashwin Waikar", 23, 1009);
		try {

			System.out.println(s1.getName() + " " + s1.getAge() + " " + s1.getRollno());

			s1.setName("Harshad Mehta");
			s1.setAge(19);
			s1.setRollno(92);

			// Serialization Starts
			FileOutputStream fos = new FileOutputStream(
					"D:\\VITA E-DAC\\Java\\Day10\\Day_10_a\\With_Serializable\\Serializable Assignments\\two.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s1);

			// DeSerialization Starts
			FileInputStream fis = new FileInputStream(
					"D:\\VITA E-DAC\\Java\\Day10\\Day_10_a\\With_Serializable\\Serializable Assignments\\two.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s2 = (Student) ois.readObject();

			System.out.println(s2.getName() + " " + s2.getAge() + " " + s2.getRollno());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
