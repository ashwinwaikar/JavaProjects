/**
 * 
 */
package clientpro;

import studpack.Student;

/**
 * @author ASHWIN WAIKAR
 *
 */
public class ClientApp2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Student s1 = new Student("Ashwin Waikar", "Nagpur", 23);

		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		System.out.println(s1.getAddress());

		Student s2 = new Student();

		s2.setAddress("Sakoli");
		s2.setName("Himanshu Raulkar");
		s2.setAge(28);

		System.out.println(s2.getName());
		System.out.println(s2.getAge());
		System.out.println(s2.getAddress());

	}

}
